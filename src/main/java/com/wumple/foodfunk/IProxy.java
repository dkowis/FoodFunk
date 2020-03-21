package com.wumple.foodfunk;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public interface IProxy
{
	void init();

	World getClientWorld();

	PlayerEntity getClientPlayer();
}