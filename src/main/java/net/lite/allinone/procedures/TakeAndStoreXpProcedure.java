package net.lite.allinone.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.lite.allinone.init.AioModItems;

public class TakeAndStoreXpProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 5) {
			if (entity instanceof Player _player)
				_player.giveExperienceLevels(-(5));
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(AioModItems.EXPERIENCE_COOKIE);
				_setstack.setCount(1);
				_player.getInventory().add(_setstack);
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SCULK_CHARGE_POP, x, y, z, 10, 3, 3, 3, 1);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.amethyst_block.chime")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.amethyst_block.chime")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
	}
}
