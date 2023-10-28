
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.lite.allinone.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.lite.allinone.AioMod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class AioModTabs {
	public static ResourceKey<CreativeModeTab> TAB_ALL_IN_ONE = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(AioMod.MODID, "all_in_one"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_ALL_IN_ONE, FabricItemGroup.builder().title(Component.translatable("item_group." + AioMod.MODID + ".all_in_one")).icon(() -> new ItemStack(AioModItems.EXPERIENCE_COOKIE)).build());
	}
}
