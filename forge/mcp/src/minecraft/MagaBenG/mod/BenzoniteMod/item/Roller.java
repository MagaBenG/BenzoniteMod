package MagaBenG.mod.BenzoniteMod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;

public class Roller extends Item
{
    public Roller(int par1,
                  EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1);
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }
    public String getTextureFile()
    {
        return ("/Benzonite/Textures/Items/RedBenzonitePickaxe.png");
    }
}