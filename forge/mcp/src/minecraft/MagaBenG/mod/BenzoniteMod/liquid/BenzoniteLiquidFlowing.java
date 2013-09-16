package MagaBenG.mod.BenzoniteMod.liquid;

import net.minecraft.block.BlockFlowing;
import net.minecraft.block.material.Material;

public class BenzoniteLiquidFlowing extends BlockFlowing
{
    public BenzoniteLiquidFlowing(int id)
    {
        super(id, Material.water);
        blockHardness = 100F;
        this.setLightOpacity(3);
    }
}