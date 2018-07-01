package com.wumple.foodfunk.capabilities.rot;

import javax.annotation.Nullable;

import choonster.capability.CapabilityUtils;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.capabilities.ICapabilityProvider;

public class RotHelper
{
	/**
	 * Get the {@link IRot} from the specified {@link ItemStack}'s capabilities, if any.
	 *
	 * @param itemStack The ItemStack
	 * @return The IRot, or null if there isn't one
	 */
	@Nullable
	public static IRot getRot(@Nullable ItemStack itemStack) {
		return CapabilityUtils.getCapability(itemStack, RotProvider.CAPABILITY, RotProvider.DEFAULT_FACING);
	}

	/**
	 * Create a provider for the default {@link IRot} instance.
	 *
	 * @return The provider
	 */
	public static ICapabilityProvider createProvider(ItemStack stack) {
		//return new SimpleCapabilityProvider<>(RotProvider.CAPABILITY, RotProvider.DEFAULT_FACING);
		
		return new RotProvider(RotProvider.CAPABILITY, RotProvider.DEFAULT_FACING, stack);
	}

	/**
	 * Create a provider for the specified {@link IRot} instance.
	 *
	 * @param Rot The IRot
	 * @return The provider
	 */
	public static ICapabilityProvider createProvider(IRot capability, ItemStack stack) {
		//return new SimpleCapabilityProvider<>(RotProvider.CAPABILITY, RotProvider.DEFAULT_FACING, capability);
		
		return new RotProvider(RotProvider.CAPABILITY, RotProvider.DEFAULT_FACING, capability, stack);
	}
}
