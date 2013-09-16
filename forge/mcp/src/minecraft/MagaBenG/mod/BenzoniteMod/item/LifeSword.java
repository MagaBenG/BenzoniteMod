package MagaBenG.mod.BenzoniteMod.item;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class LifeSword<EntityLiving> extends ItemSword
{
    public LifeSword(int par1,
                     EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, par2EnumToolMaterial);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }

    public String getTextureFile()
    {
        return ("/Benzonite/Textures/Items/RedBenzonitePickaxe.png");
    }
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("10-15 Damage");
        par3List.add("15000 Uses");
    }
    public boolean hasEffect(ItemStack par1ItemStack)
    {
        return true;
    }
}