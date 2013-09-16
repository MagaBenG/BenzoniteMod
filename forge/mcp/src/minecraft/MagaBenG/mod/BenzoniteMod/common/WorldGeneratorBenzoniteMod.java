package MagaBenG.mod.BenzoniteMod.common;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.structure.ComponentVillage;
import net.minecraft.world.gen.structure.ComponentVillageHouse1;
import net.minecraft.world.gen.structure.ComponentVillageStartPiece;
import net.minecraft.world.gen.structure.StructureBoundingBox;
import net.minecraft.world.gen.structure.StructureComponent;
import net.minecraftforge.common.DimensionManager;

public class WorldGeneratorBenzoniteMod extends WorldProvider
{
    public void registerWorldChunkManager()
    {
        this.worldChunkMgr = new WorldChunkManagerBenzoniteMod(BiomeGenBase.beach);
        this.hasNoSky = false;
    }
    public static WorldProvider getProviderForDimension(int par0)
    {
        return DimensionManager.createProviderFor(125);
    }
    public String getSaveFolder()
    {
        return "DIM_BENZONITE";
    }
    public String getWelcomeMessage()
    {
        return "Entering The BenzoniteRelms";
    }
    public String getDepartureMessage()
    {
        return "Leaveing The Benzonite Relms";
    }
    public IChunkProvider createChunkGenerator()
    {
        return new ChunkProviderBenzoniteMod(worldObj, worldObj.getSeed(), false);
    }
    public boolean canRespawnHere()
    {
        return false;
    }
    public double getMovementFactor()
    {
        return 32.0;
    }
    public float getCloudHight()
    {
        return 160.0F;
    }
    public String getDimensionName()
    {
        return "BenzoniteRelms";
    }
}