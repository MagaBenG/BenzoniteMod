package MagaBenG.mod.BenzoniteMod.item;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTutorialBlock extends Block
{
    public BlockTutorialBlock(int par1, int i, Material plants)
    {
        super(par1, Material.iron);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
}
