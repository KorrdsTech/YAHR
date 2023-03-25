
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yahryouareherobrinereborn.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class YahrYouAreHerobrineRebornModTabs {
	public static CreativeModeTab TAB_YAH;

	public static void load() {
		TAB_YAH = new CreativeModeTab("tabyah") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.BOOK);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
