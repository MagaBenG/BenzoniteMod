package MagaBenG.mod.BenzoniteMod.item;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class ItemSpadeL extends ItemSpade
{
    public ItemSpadeL(int par1,
                      EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, par2EnumToolMaterial);
        this.setCreativeTab(CreativeTabs.tabTools);
    }
    public String getTextureFile()
    {
        return ("/Benzonite/Textures/Items/RedBenzonitePickaxe.png");
    }
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("Fast");
        par3List.add("15000 Uses");
    }
    public boolean hasEffect(ItemStack par1ItemStack)
    {
        return true;
    }
}