
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

public abstract class BoyArmorItem extends ArmorItem {
	public BoyArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 5, 6, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 12;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_diamond"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}

			@Override
			public String getName() {
				return "boy_armor";
			}

			@Override
			public float getToughness() {
				return 2.2f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.2f;
			}
		}, slot, properties);
	}

	public static class Helmet extends BoyArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(YahrYouAreHerobrineRebornModTabs.TAB_YAH));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "yahr_you_are_herobrine_reborn:textures/models/armor/boy_layer_1.png";
		}
	}

	public static class Chestplate extends BoyArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(YahrYouAreHerobrineRebornModTabs.TAB_YAH));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "yahr_you_are_herobrine_reborn:textures/models/armor/boy_layer_1.png";
		}
	}

	public static class Leggings extends BoyArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(YahrYouAreHerobrineRebornModTabs.TAB_YAH));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "yahr_you_are_herobrine_reborn:textures/models/armor/boy_layer_2.png";
		}
	}

	public static class Boots extends BoyArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(YahrYouAreHerobrineRebornModTabs.TAB_YAH));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "yahr_you_are_herobrine_reborn:textures/models/armor/boy_layer_1.png";
		}
	}
}
