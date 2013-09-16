package MagaBenG.mod.BenzoniteMod.armor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import MagaBenG.mod.BenzoniteMod.common.BenzoniteMod;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class RedArmor extends ItemArmor
{
public RedArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4)
{
super(par1, par2EnumArmorMaterial, par3, par4);


}

@SideOnly(Side.CLIENT)


public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer)
{
if(itemID == BenzoniteMod.RedBenzoniteHelm.itemID || itemID == BenzoniteMod.RedBenzoniteChest.itemID)
{
return "benzonitemod:textures.Armor.Red_1.png";
}
if(itemID == BenzoniteMod.RedBenzoniteLeg.itemID)
{
return "benzonitemod:textures/Armor/Red_2.png";
}
if(itemID == BenzoniteMod.RedBenzoniteBoot.itemID )
{
return "benzonitemod:textures/Armor/Red_2.png";
}


else return null;
}
}