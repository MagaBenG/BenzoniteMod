package MagaBenG.mod.BenzoniteMod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;

public class ItemRedBenzoniteHoe extends ItemHoe
{
    public ItemRedBenzoniteHoe(int par1,
                               EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, par2EnumToolMaterial);
        this.setCreativeTab(CreativeTabs.tabTools);
    }
    public String getTextureFile()
    {
        return ("/Benzonite/Textures/Items/RedBenzonitePickaxe.png");
    }
}