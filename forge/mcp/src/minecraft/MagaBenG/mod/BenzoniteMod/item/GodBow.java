package MagaBenG.mod.BenzoniteMod.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;

public class GodBow extends Item
{
    public static final String[] bowPullIconNameArray = new String[] {"Textures/Items/BowOfAir_pull_0", "BowOfAir_pull_1", "BowOfAir_pull_2"};

    public GodBow(int par1)
    {
        super(par1);
        // TODO Auto-generated constructor stub
    }
    public boolean hasEffect(ItemStack par1ItemStack)
    {
        return true;
    }
}