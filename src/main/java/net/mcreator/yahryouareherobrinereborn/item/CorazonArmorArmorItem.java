
package net.mcreator.yahryouareherobrinereborn.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.yahryouareherobrinereborn.init.YahrYouAreHerobrineRebornModTabs;
import net.mcreator.yahryouareherobrinereborn.init.YahrYouAreHerobrineRebornModItems;

public abstract class CorazonArmorArmorItem extends ArmorItem {
	public CorazonArmorArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 18;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 6, 12, 6}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(YahrYouAreHerobrineRebornModItems.CORAZON_INGOT.get()));
			}

			@Override
			public String getName() {
				return "corazon_armor_armor";
			}

			@Override
			public float getToughness() {
				return 3f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends CorazonArmorArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(YahrYouAreHerobrineRebornModTabs.TAB_YAH));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "yahr_you_are_herobrine_reborn:textures/models/armor/corazonarmor_layer_1.png";
		}
	}

	public static class Chestplate extends CorazonArmorArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(YahrYouAreHerobrineRebornModTabs.TAB_YAH));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "yahr_you_are_herobrine_reborn:textures/models/armor/corazonarmor_layer_1.png";
		}
	}

	public static class Leggings extends CorazonArmorArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(YahrYouAreHerobrineRebornModTabs.TAB_YAH));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "yahr_you_are_herobrine_reborn:textures/models/armor/corazonarmor_layer_2.png";
		}
	}

	public static class Boots extends CorazonArmorArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(YahrYouAreHerobrineRebornModTabs.TAB_YAH));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "yahr_you_are_herobrine_reborn:textures/models/armor/corazonarmor_layer_1.png";
		}
	}
}
