
package net.mcreator.yahryouareherobrinereborn.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.yahryouareherobrinereborn.init.YahrYouAreHerobrineRebornModTabs;
import net.mcreator.yahryouareherobrinereborn.init.YahrYouAreHerobrineRebornModItems;

public class CorazonToolsPickaxeItem extends PickaxeItem {
	public CorazonToolsPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(YahrYouAreHerobrineRebornModItems.CORAZON_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties().tab(YahrYouAreHerobrineRebornModTabs.TAB_YAH));
	}
}
