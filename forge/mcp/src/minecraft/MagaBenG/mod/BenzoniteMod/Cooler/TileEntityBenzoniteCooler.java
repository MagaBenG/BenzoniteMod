package MagaBenG.mod.BenzoniteMod.Cooler;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFurnace;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.ForgeDummyContainer;

public class TileEntityBenzoniteCooler extends TileEntityFurnace implements ISidedInventory
{
    private static final int[] slots_top = new int[] {0};
    private static final int[] slots_bottom = new int[] {2, 1};
    private static final int[] slots_sides = new int[] {1};

    /**
     * The ItemStacks that hold the items currently being used in the Cooler
     */
    private ItemStack[] CoolerItemStacks = new ItemStack[3];

    /** The number of ticks that the Cooler will keep burning */
    public int CoolerBurnTime;

    /**
     * The number of ticks that a fresh copy of the currently-burning item would keep the Cooler burning for
     */
    public int currentItemBurnTime;

    /** The number of ticks that the current item has been cooking for */
    public int CoolerCookTime;
    private String field_94130_e;

    /**
     * Returns the number of slots in the inventory.
     */
    public int getSizeInventory()
    {
        return this.CoolerItemStacks.length;
    }

    /**
     * Returns the stack in slot i
     */
    public ItemStack getStackInSlot(int par1)
    {
        return this.CoolerItemStacks[par1];
    }

    /**
     * Removes from an inventory slot (first arg) up to a specified number (second arg) of items and returns them in a
     * new stack.
     */
    public ItemStack decrStackSize(int par1, int par2)
    {
        if (this.CoolerItemStacks[par1] != null)
        {
            ItemStack itemstack;

            if (this.CoolerItemStacks[par1].stackSize <= par2)
            {
                itemstack = this.CoolerItemStacks[par1];
                this.CoolerItemStacks[par1] = null;
                return itemstack;
            }
            else
            {
                itemstack = this.CoolerItemStacks[par1].splitStack(par2);

                if (this.CoolerItemStacks[par1].stackSize == 0)
                {
                    this.CoolerItemStacks[par1] = null;
                }

                return itemstack;
            }
        }
        else
        {
            return null;
        }
    }

    /**
     * When some containers are closed they call this on each slot, then drop whatever it returns as an EntityItem -
     * like when you close a workbench GUI.
     */
    public ItemStack getStackInSlotOnClosing(int par1)
    {
        if (this.CoolerItemStacks[par1] != null)
        {
            ItemStack itemstack = this.CoolerItemStacks[par1];
            this.CoolerItemStacks[par1] = null;
            return itemstack;
        }
        else
        {
            return null;
        }
    }

    /**
     * Sets the given item stack to the specified slot in the inventory (can be crafting or armor sections).
     */
    public void setInventorySlotContents(int par1, ItemStack par2ItemStack)
    {
        this.CoolerItemStacks[par1] = par2ItemStack;

        if (par2ItemStack != null && par2ItemStack.stackSize > this.getInventoryStackLimit())
        {
            par2ItemStack.stackSize = this.getInventoryStackLimit();
        }
    }

    /**
     * Returns the name of the inventory.
     */
    public String getInvName()
    {
        return this.isInvNameLocalized() ? this.field_94130_e : "Cooler";
    }

    /**
     * If this returns false, the inventory name will be used as an unlocalized name, and translated into the player's
     * language. Otherwise it will be used directly.
     */
    public boolean isInvNameLocalized()
    {
        return this.field_94130_e != null && this.field_94130_e.length() > 0;
    }

    /**
     * Sets the custom display name to use when opening a GUI linked to this tile entity.
     */
    public void setGuiDisplayName(String par1Str)
    {
        this.field_94130_e = par1Str;
    }

    /**
     * Reads a tile entity from NBT.
     */
    public void readFromNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.readFromNBT(par1NBTTagCompound);
        NBTTagList nbttaglist = par1NBTTagCompound.getTagList("Items");
        this.CoolerItemStacks = new ItemStack[this.getSizeInventory()];

        for (int i = 0; i < nbttaglist.tagCount(); ++i)
        {
            NBTTagCompound nbttagcompound1 = (NBTTagCompound)nbttaglist.tagAt(i);
            byte b0 = nbttagcompound1.getByte("Slot");

            if (b0 >= 0 && b0 < this.CoolerItemStacks.length)
            {
                this.CoolerItemStacks[b0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
            }
        }

        this.CoolerBurnTime = par1NBTTagCompound.getShort("BurnTime");
        this.CoolerCookTime = par1NBTTagCompound.getShort("CookTime");
        this.currentItemBurnTime = getItemBurnTime(this.CoolerItemStacks[1]);

        if (par1NBTTagCompound.hasKey("Cooler"))
        {
            this.field_94130_e = par1NBTTagCompound.getString("Cooler");
        }
    }

    /**
     * Writes a tile entity to NBT.
     */
    public void writeToNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.writeToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setShort("BurnTime", (short)this.CoolerBurnTime);
        par1NBTTagCompound.setShort("CookTime", (short)this.CoolerCookTime);
        NBTTagList nbttaglist = new NBTTagList();

        for (int i = 0; i < this.CoolerItemStacks.length; ++i)
        {
            if (this.CoolerItemStacks[i] != null)
            {
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.setByte("Slot", (byte)i);
                this.CoolerItemStacks[i].writeToNBT(nbttagcompound1);
                nbttaglist.appendTag(nbttagcompound1);
            }
        }

        par1NBTTagCompound.setTag("Items", nbttaglist);

        if (this.isInvNameLocalized())
        {
            par1NBTTagCompound.setString("Cooler", this.field_94130_e);
        }
    }

    /**
     * Returns the maximum stack size for a inventory slot. Seems to always be 64, possibly will be extended. *Isn't
     * this more of a set than a get?*
     */
    public int getInventoryStackLimit()
    {
        return 64;
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns an integer between 0 and the passed value representing how close the current item is to being completely
     * cooked
     */
    public int getCookProgressScaled(int par1)
    {
        return this.CoolerCookTime * par1 / 200;
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns an integer between 0 and the passed value representing how much burn time is left on the current fuel
     * item, where 0 means that the item is exhausted and the passed value means that the item is fresh
     */
    public int getBurnTimeRemainingScaled(int par1)
    {
        if (this.currentItemBurnTime == 0)
        {
            this.currentItemBurnTime = 200;
        }

        return this.CoolerBurnTime * par1 / this.currentItemBurnTime;
    }

    /**
     * Returns true if the Cooler is currently burning
     */
    public boolean isBurning()
    {
        return this.CoolerBurnTime > 0;
    }

    /**
     * Allows the entity to update its state. Overridden in most subclasses, e.g. the mob spawner uses this to count
     * ticks and creates a new spawn inside its implementation.
     */
    public void updateEntity()
    {
        boolean flag = this.CoolerBurnTime > 0;
        boolean flag1 = false;

        if (this.CoolerBurnTime > 0)
        {
            --this.CoolerBurnTime;
        }

        if (!this.worldObj.isRemote)
        {
            if (this.CoolerBurnTime == 0 && this.canSmelt())
            {
                this.currentItemBurnTime = this.CoolerBurnTime = getItemBurnTime(this.CoolerItemStacks[1]);

                if (this.CoolerBurnTime > 0)
                {
                    flag1 = true;

                    if (this.CoolerItemStacks[1] != null)
                    {
                        --this.CoolerItemStacks[1].stackSize;

                        if (this.CoolerItemStacks[1].stackSize == 0)
                        {
                            this.CoolerItemStacks[1] = this.CoolerItemStacks[1].getItem().getContainerItemStack(CoolerItemStacks[1]);
                        }
                    }
                }
            }

            if (this.isBurning() && this.canSmelt())
            {
                ++this.CoolerCookTime;

                if (this.CoolerCookTime == 200)
                {
                    this.CoolerCookTime = 0;
                    this.smeltItem();
                    flag1 = true;
                }
            }
            else
            {
                this.CoolerCookTime = 0;
            }

            if (flag != this.CoolerBurnTime > 0)
            {
                flag1 = true;
                BlockFurnace.updateFurnaceBlockState(this.CoolerBurnTime > 0, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
            }
        }

        if (flag1)
        {
            this.onInventoryChanged();
        }
    }

    /**
     * Returns true if the Cooler can smelt an item, i.e. has a source item, destination stack isn't full, etc.
     */
    private boolean canSmelt()
    {
        if (this.CoolerItemStacks[0] == null)
        {
            return false;
        }
        else
        {
            ItemStack itemstack = CoolerRecipes.Cooling().getCoolingResult(this.CoolerItemStacks[0]);

            if (itemstack == null)
            {
                return false;
            }

            if (this.CoolerItemStacks[2] == null)
            {
                return true;
            }

            if (!this.CoolerItemStacks[2].isItemEqual(itemstack))
            {
                return false;
            }

            int result = CoolerItemStacks[2].stackSize + itemstack.stackSize;
            return (result <= getInventoryStackLimit() && result <= itemstack.getMaxStackSize());
        }
    }

    /**
     * Turn one item from the Cooler source stack into the appropriate smelted item in the Cooler result stack
     */
    public void smeltItem()
    {
        if (this.canSmelt())
        {
            ItemStack itemstack = CoolerRecipes.Cooling().getCoolingResult(this.CoolerItemStacks[0]);

            if (this.CoolerItemStacks[2] == null)
            {
                this.CoolerItemStacks[2] = itemstack.copy();
            }
            else if (this.CoolerItemStacks[2].isItemEqual(itemstack))
            {
                CoolerItemStacks[2].stackSize += itemstack.stackSize;
            }

            --this.CoolerItemStacks[0].stackSize;

            if (this.CoolerItemStacks[0].stackSize <= 0)
            {
                this.CoolerItemStacks[0] = null;
            }
        }
    }

    /**
     * Returns the number of ticks that the supplied fuel item will keep the Cooler burning, or 0 if the item isn't
     * fuel
     */
    public static int getItemBurnTime(ItemStack par0ItemStack)
    {
        if (par0ItemStack == null)
        {
            return 0;
        }
        else
        {
            int i = par0ItemStack.getItem().itemID;
            Item item = par0ItemStack.getItem();

            if (par0ItemStack.getItem() instanceof ItemBlock && Block.blocksList[i] != null)
            {
                Block block = Block.blocksList[i];

                if (block == Block.woodSingleSlab)
                {
                    return 150;
                }

                if (block.blockMaterial == Material.wood)
                {
                    return 300;
                }

                if (block == Block.field_111034_cE)
                {
                    return 16000;
                }
            }

            if (item instanceof ItemTool && ((ItemTool) item).getToolMaterialName().equals("WOOD"))
            {
                return 200;
            }

            if (item instanceof ItemSword && ((ItemSword) item).getToolMaterialName().equals("WOOD"))
            {
                return 200;
            }

            if (item instanceof ItemHoe && ((ItemHoe) item).getMaterialName().equals("WOOD"))
            {
                return 200;
            }

            if (i == Item.stick.itemID)
            {
                return 100;
            }

            if (i == Item.coal.itemID)
            {
                return 1600;
            }

            if (i == Item.bucketLava.itemID)
            {
                return 20000;
            }

            if (i == Block.sapling.blockID)
            {
                return 100;
            }

            if (i == Item.blazeRod.itemID)
            {
                return 2400;
            }

            return GameRegistry.getFuelValue(par0ItemStack);
        }
    }

    /**
     * Return true if item is a fuel source (getItemBurnTime() > 0).
     */
    public static boolean isItemFuel(ItemStack par0ItemStack)
    {
        return getItemBurnTime(par0ItemStack) > 0;
    }

    /**
     * Do not make give this method the name canInteractWith because it clashes with Container
     */
    public boolean isUseableByPlayer(EntityPlayer par1EntityPlayer)
    {
        return this.worldObj.getBlockTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : par1EntityPlayer.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) <= 64.0D;
    }

    public void openChest() {}

    public void closeChest() {}

    /**
     * Returns true if automation is allowed to insert the given stack (ignoring stack size) into the given slot.
     */
    public boolean isItemValidForSlot(int par1, ItemStack par2ItemStack)
    {
        return par1 == 2 ? false : (par1 == 1 ? isItemFuel(par2ItemStack) : true);
    }

    /**
     * Returns an array containing the indices of the slots that can be accessed by automation on the given side of this
     * block.
     */
    public int[] getAccessibleSlotsFromSide(int par1)
    {
        return par1 == 0 ? slots_bottom : (par1 == 1 ? slots_top : slots_sides);
    }

    /**
     * Returns true if automation can insert the given item in the given slot from the given side. Args: Slot, item,
     * side
     */
    public boolean canInsertItem(int par1, ItemStack par2ItemStack, int par3)
    {
        return this.isItemValidForSlot(par1, par2ItemStack);
    }

    /**
     * Returns true if automation can extract the given item in the given slot from the given side. Args: Slot, item,
     * side
     */
    public boolean canExtractItem(int par1, ItemStack par2ItemStack, int par3)
    {
        return par3 != 0 || par1 != 1 || par2ItemStack.itemID == Item.bucketEmpty.itemID;
    }
}
