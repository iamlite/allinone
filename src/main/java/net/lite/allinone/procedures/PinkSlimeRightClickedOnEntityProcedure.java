package net.lite.allinone.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.lite.allinone.init.AioModItems;

public class PinkSlimeRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, (float) 0.5, Level.ExplosionInteraction.MOB);
		if (sourceentity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(AioModItems.PINK_SLIME_BALL);
			_setstack.setCount(1);
			_player.getInventory().add(_setstack);
		}
	}
}
