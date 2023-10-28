/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.lite.allinone;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.lite.allinone.init.AioModTabs;
import net.lite.allinone.init.AioModProcedures;
import net.lite.allinone.init.AioModItems;
import net.lite.allinone.init.AioModItemExtensions;
import net.lite.allinone.init.AioModFeatures;
import net.lite.allinone.init.AioModBlocks;
import net.lite.allinone.init.AioModBlockEntities;

import net.fabricmc.api.ModInitializer;

public class AioMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "aio";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing AioMod");

		AioModTabs.load();

		AioModBlocks.load();
		AioModItems.load();
		AioModBlockEntities.load();

		AioModFeatures.load();

		AioModProcedures.load();

		AioModItemExtensions.load();

	}
}
