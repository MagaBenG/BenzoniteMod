package MagaBenG.mod.BenzoniteMod.armor;

import MagaBenG.mod.BenzoniteMod.common.BenzoniteMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;
//import net.minecraftforge.common.IArmorTextureProvider;

public class FlyArmor extends ItemArmor //implements IArmorTextureProvider
{
    public FlyArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
                    int par3, int par4)
    {
        super(par1, par2EnumArmorMaterial, par3, par4);
// TODO Auto-generated constructor stub
    }


    public String getArmorTextureFile(ItemStack itemstack)
    {
        if (itemstack.itemID == BenzoniteMod.FlyArmorHelm.itemID || itemstack.itemID == BenzoniteMod.FlyArmorChest.itemID)
        {
            return "/Textures/Armor/Fly_1.png";
        }

        if (itemstack.itemID == BenzoniteMod.FlyArmorBoot.itemID)
        {
            return "/Textures/Armor/Fly_1.png";
        }

        if (itemstack.itemID == BenzoniteMod.FlyArmorLegs.itemID)
        {
            return "/Textures/Armor/Fly_2.png";
        }
        else
        {
            return null;
        }
    }
}
