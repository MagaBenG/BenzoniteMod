package MagaBenG.mod.BenzoniteMod.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemPickaxe;

public class BenzoniteHelm extends ItemArmor
{
    public BenzoniteHelm(int par1, EnumArmorMaterial par2EnumArmorMaterial,
                         int par3, int par4)
    {
        super(par1, par2EnumArmorMaterial, par3, par4);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }

    public String getTextureFile()
    {
        return ("/Benzonite/Textures/Items/RedBenzonitePickaxe.png");
    }
}
