package MagaBenG.mod.BenzoniteMod.armor;

import MagaBenG.mod.BenzoniteMod.common.BenzoniteMod;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
//import net.minecraftforge.common.IArmorTextureProvider;

public class DiamondGoldArmor extends ItemArmor //implements IArmorTextureProvider
{
    public DiamondGoldArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
                            int par3, int par4)
    {
        super(par1, par2EnumArmorMaterial, par3, par4);
// TODO Auto-generated constructor stub
    }
/**
    @Override
    public String getArmorTextureFile(ItemStack itemstack)
    {
        if (itemstack.itemID == BenzoniteMod.DiamondGoldHelm.itemID || itemstack.itemID == BenzoniteMod.DiamondGoldChest.itemID)
        {
            return "/Textures/Armor/DiamondGold_1.png";
        }

        if (itemstack.itemID == BenzoniteMod.DiamondGoldBoot.itemID)
        {
            return "/Textures/Armor/DiamondGold_1.png";
        }

        if (itemstack.itemID == BenzoniteMod.DiamondGoldLegs.itemID)
        {
            return "/Textures/Armor/DiamondGold_2.png";
        }
        else
        {
            return null;
        }
    }
    */
}