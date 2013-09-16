package MagaBenG.mod.BenzoniteMod.item;

import java.util.Map;

import MagaBenG.mod.BenzoniteMod.common.BenzoniteMod;

import com.google.common.collect.Maps;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.ChestItemRenderHelper;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;

public class TileEntityBenzoniteChestRenderer extends ChestItemRenderHelper
{
    private Map<Integer, TileEntityBenzoniteChest> itemRenders = Maps.newHashMap();

    @Override
    public void renderChest(Block block, int i, float f)
    {
        if (block == BenzoniteMod.BenzoniteTable)
        {
            TileEntityRenderer.instance.renderTileEntityAt(itemRenders.get(i), 0.0D, 0.0D, 0.0D, 0.0F);
        }
        else
        {
            super.renderChest(block, i, f);
        }
    }
}
// DO NOT PLACE CRATE NEXT TO NORMAL CHEST! WILL CRASH EVEN IN DE-BUG!//