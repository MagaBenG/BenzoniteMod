package MagaBenG.mod.BenzoniteMod.armor;

import java.util.List;

import MagaBenG.mod.BenzoniteMod.common.BenzoniteMod;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;
//import net.minecraftforge.common.IArmorTextureProvider;

public class FireArmor extends ItemArmor //implements IArmorTextureProvider
{
    public FireArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
                     int par3, int par4)
    {
        super(par1, par2EnumArmorMaterial, par3, par4);
// TODO Auto-generated constructor stub
    }

   
    public String getArmorTextureFile(ItemStack itemstack)
    {
        if (itemstack.itemID == BenzoniteMod.FireArmorHelm.itemID || itemstack.itemID == BenzoniteMod.FireArmorChest.itemID)
        {
            return "/Textures/Armor/Fire_1.png";
        }

        if (itemstack.itemID == BenzoniteMod.FireArmorBoot.itemID)
        {
            return "/Textures/Armor/Fire_1.png";
        }

        if (itemstack.itemID == BenzoniteMod.FireArmorLegs.itemID)
        {
            return "/Textures/Armor/Fire_2.png";
        }
        else
        {
            return null;
        }
    }
    public boolean onTickInGame(float f, Minecraft minecraft)
    {
        if (minecraft.thePlayer.inventory.armorItemInSlot(2) != null)
        {
            ItemStack itemstack = minecraft.thePlayer.inventory.armorItemInSlot(2);

            if (itemstack.itemID == BenzoniteMod.FireArmorChest.itemID)
            {
                minecraft.thePlayer.field_70135_K = true;
                List list = minecraft.theWorld.getEntitiesWithinAABBExcludingEntity(minecraft.thePlayer, minecraft.thePlayer.boundingBox.expand(4D, 0.0D, 4D)); //Change the 4D to set the radius

                if (list != null)
                {
                    for (int k2 = 0; k2 < list.size(); k2++)
                    {
                        Entity entity = (Entity)list.get(k2);

                        if ((entity instanceof EntityLiving) && !entity.isDead)
                        {
                            entity.setFire(20); //Or any other function you want the entity to recieve
                        }
                    }
                }
            }
        }

        return true;
    }
}
