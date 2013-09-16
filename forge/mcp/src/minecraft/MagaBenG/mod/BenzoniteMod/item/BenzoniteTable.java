package MagaBenG.mod.BenzoniteMod.item;

import MagaBenG.mod.BenzoniteMod.common.BenzoniteMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BenzoniteTable extends BlockContainer
{
    @SideOnly(Side.CLIENT)
    private Icon iconGrassTop;
    @SideOnly(Side.CLIENT)
    private Icon iconSnowSide;
    @SideOnly(Side.CLIENT)
    private Icon iconGrassSideOverlay;

    public BenzoniteTable(int par1)
    {
        super(par1, Material.iron);
        this.setTickRandomly(true);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    @SideOnly(Side.CLIENT)

    /**

    /**
     * Ticks the block if it's been scheduled
     */

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return BenzoniteMod.BenzoniteTable.blockID;
    }



  

    public TileEntity createNewTileEntity(World world)
    {
        return new TileEntityBenzoniteChest();
    }
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
        if (par1World.isRemote)
        {
            return true;
        }
        else
        {
            TileEntityBenzoniteChest tileentitychest = (TileEntityBenzoniteChest)par1World.getBlockTileEntity(par2, par3, par4);

            if (tileentitychest != null)
            {
                par5EntityPlayer.displayGUIChest(tileentitychest);
            }

            return true;
        }
    }

    public boolean hasComparatorInputOverride()
    {
        return true;
    }
    public int getComparatorInputOverride(World par1World, int par2, int par3, int par4, int par5)
    {
        return Container.calcRedstoneFromInventory((IInventory)par1World.getBlockTileEntity(par2, par3, par4));
    }
    public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving, ItemStack par6ItemStack)
    {
        int l = MathHelper.floor_double((double)(par5EntityLiving.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (l == 0)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 2, 2);
        }

        if (l == 1)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 5, 2);
        }

        if (l == 2)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 3, 2);
        }

        if (l == 3)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 4, 2);
        }

        if (par6ItemStack.hasDisplayName())
        {
            ((TileEntityBenzoniteChest)par1World.getBlockTileEntity(par2, par3, par4)).func_94043_a(par6ItemStack.getDisplayName());
        }
    }
}
