package com.wumple.foodfunk.chest.larder;

import com.wumple.foodfunk.ModObjectHolder;
import com.wumple.foodfunk.Reference;
import com.wumple.util.xchest2.XChestTileEntityRenderer;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.state.properties.ChestType;
import net.minecraft.util.ResourceLocation;

public class LarderTileEntityRenderer extends XChestTileEntityRenderer<LarderTileEntity>
{
	private static ResourceLocation TEXTURE_NORMAL = new ResourceLocation(Reference.MOD_ID, "textures/entity/larder.png");

	public LarderTileEntityRenderer(TileEntityRendererDispatcher rendererDispatcherIn) {
		super(rendererDispatcherIn);
	}

	@Override
	protected ResourceLocation getTexture()
	{
	  return TEXTURE_NORMAL;
	}
	
	@Override
	protected Block getBlock()
	{
		return ModObjectHolder.LarderBlock;
	}
}
