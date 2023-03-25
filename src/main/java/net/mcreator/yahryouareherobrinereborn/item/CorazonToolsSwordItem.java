
package net.mcreator.yahryouareherobrinereborn.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.yahryouareherobrinereborn.init.YahrYouAreHerobrineRebornModTabs;
import net.mcreator.yahryouareherobrinereborn.init.YahrYouAreHerobrineRebornModItems;

public class CorazonToolsSwordItem extends SwordItem {
	public CorazonToolsSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 980;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 10f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 16;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(YahrYouAreHerobrineRebornModItems.CORAZON_INGOT.get()));
			}
		}, 3, -3f, new Item.Properties().tab(YahrYouAreHerobrineRebornModTabs.TAB_YAH));
	}
}
