
package net.lite.allinone.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.lite.allinone.init.AioModTabs;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class EmeraldDustItem extends Item {
	public EmeraldDustItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
		ItemGroupEvents.modifyEntriesEvent(AioModTabs.TAB_ALL_IN_ONE).register(content -> content.accept(this));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
