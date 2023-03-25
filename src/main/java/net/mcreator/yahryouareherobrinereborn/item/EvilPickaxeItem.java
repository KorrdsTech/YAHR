
package net.mcreator.yahryouareherobrinereborn.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.yahryouareherobrinereborn.init.YahrYouAreHerobrineRebornModTabs;
import net.mcreator.yahryouareherobrinereborn.init.YahrYouAreHerobrineRebornModItems;

public class EvilPickaxeItem extends PickaxeItem {
	public EvilPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1164;
			}

			public float getSpeed() {
				return 26f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 60;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(YahrYouAreHerobrineRebornModItems.EVIL_DIAMOND.get()));
			}
		}, 1, -3f, new Item.Properties().tab(YahrYouAreHerobrineRebornModTabs.TAB_YAH));
	}
}
