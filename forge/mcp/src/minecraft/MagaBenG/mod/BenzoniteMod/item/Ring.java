package MagaBenG.mod.BenzoniteMod.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeSubscribe;

public class Ring extends Item
{
    public Ring(int par1)
    {
        super(par1);
        // TODO Auto-generated constructor stub
    }
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        ModLoader.getMinecraftInstance().thePlayer.capabilities.allowFlying = true;
        return par1ItemStack;
    }
}
