package MagaBenG.mod.BenzoniteMod.liquid;

import java.util.Random;

import net.minecraft.block.BlockFlowing;
import net.minecraft.block.BlockStationary;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public class BenzoniteLiquidStill extends BlockStationary
{
    public BenzoniteLiquidStill(int id)
    {
        super(id, Material.water);
        blockHardness = 100F;
        this.setLightOpacity(3);
        this.disableStats();
    }
}