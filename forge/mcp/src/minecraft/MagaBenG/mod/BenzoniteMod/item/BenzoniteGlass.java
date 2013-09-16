package MagaBenG.mod.BenzoniteMod.item;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BenzoniteGlass extends Block
{
    public BenzoniteGlass(int par1, Material par2Material, boolean par3)
    {
        super(par1, Material.glass);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    public boolean isOpaqueCube()
    {
        return false;
    }

    protected boolean canSilkHarvest()
    {
        return true;
    }
    public int getRenderBlockPass()
    {
        return 0;
    }
    public int quantityDropped(Random par1Random)
    {
        return 0;
    }
    public boolean renderAsNormalBlock()
    {
        return false;
    }
}
