package MagaBenG.mod.BenzoniteMod.armor;

import MagaBenG.mod.BenzoniteMod.common.BenzoniteMod;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
//import net.minecraftforge.common.IArmorTextureProvider;

public class GreenArmor extends ItemArmor //implements IArmorTextureProvider
{
    public GreenArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
                      int par3, int par4)
    {
        super(par1, par2EnumArmorMaterial, par3, par4);
// TODO Auto-generated constructor stub
    }


    public String getArmorTextureFile(ItemStack itemstack)
    {
        if (itemstack.itemID == BenzoniteMod.GreenBenzoniteHelm.itemID || itemstack.itemID == BenzoniteMod.GreenBenzoniteChest.itemID)
        {
            return "/Textures/Armor/Green_1.png";
        }

        if (itemstack.itemID == BenzoniteMod.GreenBenzoniteBoot.itemID)
        {
            return "/Textures/Armor/Green_1.png";
        }

        if (itemstack.itemID == BenzoniteMod.GreenBenzoniteLeg.itemID)
        {
            return "/Textures/Armor/Green_2.png";
        }
        else
        {
            return null;
        }
    }
}