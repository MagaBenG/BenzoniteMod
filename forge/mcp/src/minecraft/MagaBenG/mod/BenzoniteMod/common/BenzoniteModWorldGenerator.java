package MagaBenG.mod.BenzoniteMod.common;

import java.util.Random;

import MagaBenG.mod.BenzoniteMod.Biome.BenzoniteTree;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenTrees;
import cpw.mods.fml.common.IWorldGenerator;

public class BenzoniteModWorldGenerator implements IWorldGenerator
{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world,
                         IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        switch (world.provider.dimensionId)
        {
            case -1:
                generateNether(world, random, chunkX * 16, chunkZ * 16);

            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
        }
    }

    private void generateSurface(World world, Random random, int blockX, int blockZ)
    {
        WorldGenTrees BenzoniteTree;
        int Xcoord = blockX + random.nextInt(16);
        int Ycoord = random.nextInt(16);
        int Zcoord = blockZ + random.nextInt(16);
        new WorldGenMinable(BenzoniteMod.RedOre.blockID, 4).generate(world, random, Xcoord, Ycoord, Zcoord);
        new WorldGenMinable(BenzoniteMod.BlueOre.blockID, 5).generate(world, random, Xcoord, Ycoord, Zcoord);
        new WorldGenMinable(BenzoniteMod.GreenOre.blockID, 2).generate(world, random, Xcoord, Ycoord, Zcoord);
        new WorldGenMinable(BenzoniteMod.OrangeOre.blockID, 7).generate(world, random, Xcoord, Ycoord, Zcoord);
    }

    private void generateNether(World world, Random random, int blockX, int blockZ)
    {
    }
}
