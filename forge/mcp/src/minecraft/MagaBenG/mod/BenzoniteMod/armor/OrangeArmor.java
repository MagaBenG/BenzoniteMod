package MagaBenG.mod.BenzoniteMod.armor;

import MagaBenG.mod.BenzoniteMod.common.BenzoniteMod;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
//import net.minecraftforge.common.IArmorTextureProvider;

public class OrangeArmor extends ItemArmor //implements IArmorTextureProvider
{
    public OrangeArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
                       int par3, int par4)
    {
        super(par1, par2EnumArmorMaterial, par3, par4);
// TODO Auto-generated constructor stub
    }

 
    public String getArmorTextureFile(ItemStack itemstack)
    {
        if (itemstack.itemID == BenzoniteMod.OrangeBenzoniteHelm.itemID || itemstack.itemID == BenzoniteMod.OrangeBenzoniteChest.itemID)
        {
            return "/Textures/Armor/Orange_1.png";
        }

        if (itemstack.itemID == BenzoniteMod.OrangeBenzoniteBoot.itemID)
        {
            return "/Textures/Armor/Orange_1.png";
        }

        if (itemstack.itemID == BenzoniteMod.OrangeBenzoniteLeg.itemID)
        {
            return "/Textures/Armor/Orange_2.png";
        }
        else
        {
            return null;
        }
    }
}
