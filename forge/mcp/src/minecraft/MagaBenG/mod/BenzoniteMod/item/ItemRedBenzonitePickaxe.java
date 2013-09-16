package MagaBenG.mod.BenzoniteMod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ItemRedBenzonitePickaxe extends ItemPickaxe
{
    public ItemRedBenzonitePickaxe(int par1,
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