package MagaBenG.mod.BenzoniteMod.armor;

import org.lwjgl.input.Keyboard;

import MagaBenG.mod.BenzoniteMod.common.BenzoniteMod;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class JetPack
{
    private static boolean hasJetpack = false;

    public boolean onTickInGame(float f, Minecraft minecraft)
    {
        if (minecraft.thePlayer.inventory.armorItemInSlot(2) != null)
        {
            ItemStack itemstack = minecraft.thePlayer.inventory.armorItemInSlot(1);

            if (itemstack.itemID == BenzoniteMod.GreenBenzoniteChest.itemID)
            {
                if (minecraft.currentScreen == null && Keyboard.isKeyDown(minecraft.gameSettings.keyBindJump.keyCode))
                {
                    if (minecraft.thePlayer.motionY > 0.0D)
                    {
                        minecraft.thePlayer.motionY += 0.084999999105930327D;
                    }
                    else
                    {
                        minecraft.thePlayer.motionY += 0.11699999910593033D;
                    }

                    minecraft.theWorld.spawnParticle("smoke", minecraft.thePlayer.posX, minecraft.thePlayer.posY - 1.0D, minecraft.thePlayer.posZ, 0.0D, 0.0D, 0.0D);
                }

                if (minecraft.thePlayer.motionY < 0.0D)
                {
                    minecraft.thePlayer.motionY /= 1.1499999761581421D;
                }

                if (!minecraft.thePlayer.onGround)
                {
                    minecraft.thePlayer.motionX *= 1.0399999618530273D;
                    minecraft.thePlayer.motionZ *= 1.0399999618530273D;
                }

                minecraft.thePlayer.fallDistance = 0.0F;
                hasJetpack = true;
            }
            else
            {
                hasJetpack = false;
            }
        }

        return true;
    }

    public Item setUnlocalizedName(String string)
    {
        // TODO Auto-generated method stub
        return null;
    }
}
