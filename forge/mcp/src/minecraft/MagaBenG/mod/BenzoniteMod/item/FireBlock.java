package MagaBenG.mod.BenzoniteMod.item;

import java.util.Random;

import net.minecraft.block.BlockFire;
import net.minecraft.world.World;

public class FireBlock extends BlockFire
{
    public FireBlock(int par1)
    {
        super(par1);
        // TODO Auto-generated constructor stub
    }
    public boolean renderAsNormalBlock()
    {
        return true;
    }
    public int quantityDropped(Random par1Random)
    {
        return 1;
    }
    public int tickRate(World par1World)
    {
        return 30;
    }
}
