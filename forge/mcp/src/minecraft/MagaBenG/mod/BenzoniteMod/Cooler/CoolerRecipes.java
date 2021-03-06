package MagaBenG.mod.BenzoniteMod.Cooler;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CoolerRecipes
{
    private static final CoolerRecipes CoolingBase = new CoolerRecipes();

    /** The list of smelting results. */
    private Map coolingList = new HashMap();
    private Map experienceList = new HashMap();
    private HashMap<List<Integer>, ItemStack> metaCoolingList = new HashMap<List<Integer>, ItemStack>();
    private HashMap<List<Integer>, Float> metaExperience = new HashMap<List<Integer>, Float>();

    /**
     * Used to call methods addSmelting and getSmeltingResult.
     */
    public static final CoolerRecipes Cooling()
    {
        return CoolingBase;
    }

    private CoolerRecipes()
    {
        
        this.addCooling(Block.oreGold.blockID, 0, new ItemStack(Item.ingotGold), 1.0F);
        
    }

    /**
     * Adds a smelting recipe.
     */
    public void addCooling(int par1, ItemStack par2ItemStack, float par3)
    {
        this.coolingList.put(Integer.valueOf(par1), par2ItemStack);
        this.experienceList.put(Integer.valueOf(par2ItemStack.itemID), Float.valueOf(par3));
    }

    /**
     * Returns the smelting result of an item.
     * Deprecated in favor of a metadata sensitive version
     */
    @Deprecated
    public ItemStack getCoolingResult(int par1)
    {
        return (ItemStack)this.coolingList.get(Integer.valueOf(par1));
    }

    public Map getCoolingList()
    {
        return this.coolingList;
    }

    @Deprecated //In favor of ItemStack sensitive version
    public float getExperience(int par1)
    {
        return this.experienceList.containsKey(Integer.valueOf(par1)) ? ((Float)this.experienceList.get(Integer.valueOf(par1))).floatValue() : 0.0F;
    }

    /**
     * A metadata sensitive version of adding a furnace recipe.
     */
    public void addCooling(int itemID, int metadata, ItemStack itemstack, float experience)
    {
        metaCoolingList.put(Arrays.asList(itemID, metadata), itemstack);
        metaExperience.put(Arrays.asList(itemstack.itemID, itemstack.getItemDamage()), experience);
    }

    /**
     * Used to get the resulting ItemStack form a source ItemStack
     * @param item The Source ItemStack
     * @return The result ItemStack
     */
    public ItemStack getCoolingResult(ItemStack item)
    {
        if (item == null)
        {
            return null;
        }

        ItemStack ret = (ItemStack)metaCoolingList.get(Arrays.asList(item.itemID, item.getItemDamage()));

        if (ret != null)
        {
            return ret;
        }

        return (ItemStack)coolingList.get(Integer.valueOf(item.itemID));
    }

    /**
     * Grabs the amount of base experience for this item to give when pulled from the furnace slot.
     */
    public float getExperience(ItemStack item)
    {
        if (item == null || item.getItem() == null)
        {
            return 0;
        }

        float ret = item.getItem().getSmeltingExperience(item);

        if (ret < 0 && metaExperience.containsKey(Arrays.asList(item.itemID, item.getItemDamage())))
        {
            ret = metaExperience.get(Arrays.asList(item.itemID, item.getItemDamage()));
        }

        if (ret < 0 && experienceList.containsKey(item.itemID))
        {
            ret = ((Float)experienceList.get(item.itemID)).floatValue();
        }

        return (ret < 0 ? 0 : ret);
    }

    public Map<List<Integer>, ItemStack> getMetaCoolingList()
    {
        return metaCoolingList;
    }
}
