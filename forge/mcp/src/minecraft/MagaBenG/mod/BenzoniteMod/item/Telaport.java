package MagaBenG.mod.BenzoniteMod.item;

import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class Telaport extends ItemSword
{
    public Telaport(int par1, EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, par2EnumToolMaterial);
        // TODO Auto-generated constructor stub
    }
    @Override
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.onGround || par3EntityPlayer.isAirBorne)
        {
            par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

            if (!par2World.isRemote)
            {
                par2World.spawnEntityInWorld(new EntityEnderPearl(par2World, par3EntityPlayer));
            }
        }

        return par1ItemStack;
    }
    public boolean hasEffect(ItemStack par1ItemStack)
    {
        return true;
    }
}
