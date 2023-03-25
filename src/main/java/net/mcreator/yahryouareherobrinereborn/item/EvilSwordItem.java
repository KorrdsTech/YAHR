
package net.mcreator.yahryouareherobrinereborn.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.yahryouareherobrinereborn.init.YahrYouAreHerobrineRebornModTabs;
import net.mcreator.yahryouareherobrinereborn.init.YahrYouAreHerobrineRebornModItems;

public class EvilSwordItem extends SwordItem {
	public EvilSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 1164;
			}

			public float getSpeed() {
				return 18f;
			}

			public float getAttackDamageBonus() {
				return 24f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 42;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(YahrYouAreHerobrineRebornModItems.EVIL_DIAMOND.get()));
			}
		}, 3, -3f, new Item.Properties().tab(YahrYouAreHerobrineRebornModTabs.TAB_YAH));
	}
}
