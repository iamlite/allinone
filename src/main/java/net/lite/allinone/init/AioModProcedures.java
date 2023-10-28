
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.lite.allinone.init;

import net.lite.allinone.procedures.TakeAndStoreXpProcedure;
import net.lite.allinone.procedures.PinkSlimeRightClickedOnEntityProcedure;
import net.lite.allinone.procedures.LauncherEntityWalksOnTheBlockProcedure;
import net.lite.allinone.procedures.GlowBallRightclickedOnBlockProcedure;
import net.lite.allinone.procedures.ExperienceCookiePlayerFinishesUsingItemProcedure;
import net.lite.allinone.procedures.CobbleStoneGeneratorT1UpdateTickProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class AioModProcedures {
	public static void load() {
		new PinkSlimeRightClickedOnEntityProcedure();
		new GlowBallRightclickedOnBlockProcedure();
		new CobbleStoneGeneratorT1UpdateTickProcedure();
		new LauncherEntityWalksOnTheBlockProcedure();
		new TakeAndStoreXpProcedure();
		new ExperienceCookiePlayerFinishesUsingItemProcedure();
	}
}
