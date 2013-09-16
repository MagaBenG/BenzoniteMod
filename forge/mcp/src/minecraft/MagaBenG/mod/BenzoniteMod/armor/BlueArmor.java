package MagaBenG.mod.BenzoniteMod.armor;

import MagaBenG.mod.BenzoniteMod.common.BenzoniteMod;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
//import net.minecraftforge.common.IArmorTextureProvider;

public class BlueArmor extends ItemArmor //implements IArmorTextureProvider
{
    public BlueArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
                     int par3, int par4)
    {
        super(par1, par2EnumArmorMaterial, par3, par4);
// TODO Auto-generated constructor stub
    }
/**
    @Override
    public String getArmorTextureFile(ItemStack itemstack)
    {
        if (itemstack.itemID == BenzoniteMod.BlueBenzoniteHelm.itemID || itemstack.itemID == BenzoniteMod.BlueBenzoniteChest.itemID)
        {
            return "/Textures/Armor/Blue_1.png";
        }

        if (itemstack.itemID == BenzoniteMod.BlueBenzoniteBoot.itemID)
        {
            return "/Textures/Armor/Blue_1.png";
        }

        if (itemstack.itemID == BenzoniteMod.BlueBenzoniteLeg.itemID)
        {
            return "/Textures/Armor/Blue_2.png";
        }
        else
       {
            return null;
        }
    }
    */
}