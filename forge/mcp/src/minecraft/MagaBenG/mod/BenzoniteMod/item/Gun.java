package MagaBenG.mod.BenzoniteMod.item;

import MagaBenG.mod.BenzoniteMod.Entity.GunBullet;
import MagaBenG.mod.BenzoniteMod.common.BenzoniteMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

public class Gun extends Item
{
    public Gun(int par1,
               EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1);
        this.setCreativeTab(CreativeTabs.tabTools);
    }
   
    @Override
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.consumeInventoryItem(BenzoniteMod.Bullet.itemID))
        {
            par2World.playSoundAtEntity(par3EntityPlayer, "sound.gun", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

            if (!par2World.isRemote)
            {
                par2World.spawnEntityInWorld(new GunBullet(par2World, par3EntityPlayer));
            }
        }

        return par1ItemStack;
    }
}