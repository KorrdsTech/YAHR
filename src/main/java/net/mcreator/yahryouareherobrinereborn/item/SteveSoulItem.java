
package net.mcreator.yahryouareherobrinereborn.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.yahryouareherobrinereborn.init.YahrYouAreHerobrineRebornModTabs;

public class SteveSoulItem extends Item {
	public SteveSoulItem() {
		super(new Item.Properties().tab(YahrYouAreHerobrineRebornModTabs.TAB_YAH).stacksTo(64).rarity(Rarity.COMMON));
	}
}
