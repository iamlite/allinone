
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.lite.allinone.init;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.lite.allinone.block.entity.CobbleGenMk1BlockEntity;
import net.lite.allinone.AioMod;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;

public class AioModBlockEntities {
	public static BlockEntityType<?> COBBLE_GEN_MK_1;

	public static void load() {
		COBBLE_GEN_MK_1 = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(AioMod.MODID, "cobble_gen_mk_1"), FabricBlockEntityTypeBuilder.create(CobbleGenMk1BlockEntity::new, AioModBlocks.COBBLE_GEN_MK_1).build(null));
	}
}
