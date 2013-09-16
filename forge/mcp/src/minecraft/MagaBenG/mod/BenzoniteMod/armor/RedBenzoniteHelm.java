package MagaBenG.mod.BenzoniteMod.armor;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import MagaBenG.mod.BenzoniteMod.common.BenzoniteMod;

public class RedBenzoniteHelm extends ItemArmor
{
    public RedBenzoniteHelm(int par1, EnumArmorMaterial par2EnumArmorMaterial,
                            int par3, int par4)
    {
        super(par1, par2EnumArmorMaterial, par3, par4);
        // TODO Auto-generated constructor stub
    }

    public String getArmorTextureFile(ItemStack itemstack)
    {
        if (itemstack.itemID == BenzoniteMod.RedBenzoniteHelm.itemID || itemstack.itemID == BenzoniteMod.RedBenzoniteChest.itemID)
        {
            return "/mods/BenzoniteMod/Textures/Armor/Red_1.png";
        }

        if (itemstack.itemID == BenzoniteMod.RedBenzoniteLeg.itemID)
        {
            return "/mods/BenzoniteMod/Textures/Armor/Red_2.png";
        }

        if (itemstack.itemID == BenzoniteMod.RedBenzoniteBoot.itemID)
        {
            return "/mods/BenzoniteMod/Textures/Armor/Red_1.png";
        }
        else
        {
            return null;
        }
    }
}
