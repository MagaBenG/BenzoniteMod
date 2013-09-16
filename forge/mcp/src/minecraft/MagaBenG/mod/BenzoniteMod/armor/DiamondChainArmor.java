package MagaBenG.mod.BenzoniteMod.armor;

import MagaBenG.mod.BenzoniteMod.common.BenzoniteMod;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
//import net.minecraftforge.common.IArmorTextureProvider;

public class DiamondChainArmor extends ItemArmor //implements IArmorTextureProvider
{
    public DiamondChainArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
                             int par3, int par4)
    {
        super(par1, par2EnumArmorMaterial, par3, par4);
// TODO Auto-generated constructor stub
    }
/**
    @Override
    public String getArmorTextureFile(ItemStack itemstack)
    {
        if (itemstack.itemID == BenzoniteMod.DiamondChainHelm.itemID || itemstack.itemID == BenzoniteMod.DiamondChainChest.itemID)
        {
            return "/Textures/Armor/DiamondChain_1.png";
        }

        if (itemstack.itemID == BenzoniteMod.DiamondChainBoots.itemID)
        {
            return "/Textures/Armor/DiamondChain_1.png";
        }

        if (itemstack.itemID == BenzoniteMod.DiamondChainLegs.itemID)
        {
            return "/Textures/Armor/DiamondChain_2.png";
        }
        else
        {
            return null;
        }
    }
    */
}