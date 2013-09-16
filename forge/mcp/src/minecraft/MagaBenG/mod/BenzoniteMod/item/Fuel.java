package MagaBenG.mod.BenzoniteMod.item;

import MagaBenG.mod.BenzoniteMod.common.BenzoniteMod;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class Fuel implements IFuelHandler
{
    @Override
    public int getBurnTime(ItemStack fuel)
    {
        int var1 = BenzoniteMod.Fuel.itemID;

        if (var1 == BenzoniteMod.Fuel.itemID)
        {
            return 10000;
        }

        return var1;
    }
}