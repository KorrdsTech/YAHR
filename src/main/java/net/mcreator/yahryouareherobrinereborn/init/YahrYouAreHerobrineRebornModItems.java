
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yahryouareherobrinereborn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.yahryouareherobrinereborn.item.SteveSoulItem;
import net.mcreator.yahryouareherobrinereborn.item.SkinBookItem;
import net.mcreator.yahryouareherobrinereborn.item.NecronomiconTomoVItem;
import net.mcreator.yahryouareherobrinereborn.item.NecronomiconTomoIVItem;
import net.mcreator.yahryouareherobrinereborn.item.NecronomiconTomoIIItem;
import net.mcreator.yahryouareherobrinereborn.item.NecronomiconTomoIIIItem;
import net.mcreator.yahryouareherobrinereborn.item.NecronomiconItem;
import net.mcreator.yahryouareherobrinereborn.item.InvisibleDustItem;
import net.mcreator.yahryouareherobrinereborn.item.FleshStickItem;
import net.mcreator.yahryouareherobrinereborn.item.EvilSwordItem;
import net.mcreator.yahryouareherobrinereborn.item.EvilShovelItem;
import net.mcreator.yahryouareherobrinereborn.item.EvilPickaxeItem;
import net.mcreator.yahryouareherobrinereborn.item.EvilHoeItem;
import net.mcreator.yahryouareherobrinereborn.item.EvilFleshStickItem;
import net.mcreator.yahryouareherobrinereborn.item.EvilDiamondMatterItem;
import net.mcreator.yahryouareherobrinereborn.item.EvilDiamondItem;
import net.mcreator.yahryouareherobrinereborn.item.EvilAxeItem;
import net.mcreator.yahryouareherobrinereborn.item.CorazonToolsSwordItem;
import net.mcreator.yahryouareherobrinereborn.item.CorazonToolsShovelItem;
import net.mcreator.yahryouareherobrinereborn.item.CorazonToolsPickaxeItem;
import net.mcreator.yahryouareherobrinereborn.item.CorazonToolsHoeItem;
import net.mcreator.yahryouareherobrinereborn.item.CorazonToolsAxeItem;
import net.mcreator.yahryouareherobrinereborn.item.CorazonItem;
import net.mcreator.yahryouareherobrinereborn.item.CorazonIngotItem;
import net.mcreator.yahryouareherobrinereborn.item.CorazonArmorArmorItem;
import net.mcreator.yahryouareherobrinereborn.item.BoyIngotItem;
import net.mcreator.yahryouareherobrinereborn.item.BoyArmorItem;
import net.mcreator.yahryouareherobrinereborn.YahrYouAreHerobrineRebornMod;

public class YahrYouAreHerobrineRebornModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, YahrYouAreHerobrineRebornMod.MODID);
	public static final RegistryObject<Item> STEVE_SPAWN_EGG = REGISTRY.register("steve_spawn_egg",
			() -> new ForgeSpawnEggItem(YahrYouAreHerobrineRebornModEntities.STEVE, -13108, -13108, new Item.Properties().tab(YahrYouAreHerobrineRebornModTabs.TAB_YAH)));
	public static final RegistryObject<Item> NECRONOMICON = REGISTRY.register("necronomicon", () -> new NecronomiconItem());
	public static final RegistryObject<Item> STEVE_SOUL = REGISTRY.register("steve_soul", () -> new SteveSoulItem());
	public static final RegistryObject<Item> CORAZON = REGISTRY.register("corazon", () -> new CorazonItem());
	public static final RegistryObject<Item> CORAZON_INGOT = REGISTRY.register("corazon_ingot", () -> new CorazonIngotItem());
	public static final RegistryObject<Item> BOY_INGOT = REGISTRY.register("boy_ingot", () -> new BoyIngotItem());
	public static final RegistryObject<Item> ICE_RUBY_ORE = block(YahrYouAreHerobrineRebornModBlocks.ICE_RUBY_ORE, YahrYouAreHerobrineRebornModTabs.TAB_YAH);
	public static final RegistryObject<Item> BOY_ARMOR_HELMET = REGISTRY.register("boy_armor_helmet", () -> new BoyArmorItem.Helmet());
	public static final RegistryObject<Item> BOY_ARMOR_CHESTPLATE = REGISTRY.register("boy_armor_chestplate", () -> new BoyArmorItem.Chestplate());
	public static final RegistryObject<Item> BOY_ARMOR_LEGGINGS = REGISTRY.register("boy_armor_leggings", () -> new BoyArmorItem.Leggings());
	public static final RegistryObject<Item> BOY_ARMOR_BOOTS = REGISTRY.register("boy_armor_boots", () -> new BoyArmorItem.Boots());
	public static final RegistryObject<Item> CORAZON_ARMOR_ARMOR_HELMET = REGISTRY.register("corazon_armor_armor_helmet", () -> new CorazonArmorArmorItem.Helmet());
	public static final RegistryObject<Item> CORAZON_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("corazon_armor_armor_chestplate", () -> new CorazonArmorArmorItem.Chestplate());
	public static final RegistryObject<Item> CORAZON_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("corazon_armor_armor_leggings", () -> new CorazonArmorArmorItem.Leggings());
	public static final RegistryObject<Item> CORAZON_ARMOR_ARMOR_BOOTS = REGISTRY.register("corazon_armor_armor_boots", () -> new CorazonArmorArmorItem.Boots());
	public static final RegistryObject<Item> CORAZON_TOOLS_AXE = REGISTRY.register("corazon_tools_axe", () -> new CorazonToolsAxeItem());
	public static final RegistryObject<Item> CORAZON_TOOLS_PICKAXE = REGISTRY.register("corazon_tools_pickaxe", () -> new CorazonToolsPickaxeItem());
	public static final RegistryObject<Item> CORAZON_TOOLS_SWORD = REGISTRY.register("corazon_tools_sword", () -> new CorazonToolsSwordItem());
	public static final RegistryObject<Item> CORAZON_TOOLS_SHOVEL = REGISTRY.register("corazon_tools_shovel", () -> new CorazonToolsShovelItem());
	public static final RegistryObject<Item> CORAZON_TOOLS_HOE = REGISTRY.register("corazon_tools_hoe", () -> new CorazonToolsHoeItem());
	public static final RegistryObject<Item> FLESH_STICK = REGISTRY.register("flesh_stick", () -> new FleshStickItem());
	public static final RegistryObject<Item> EVIL_FLESH_STICK = REGISTRY.register("evil_flesh_stick", () -> new EvilFleshStickItem());
	public static final RegistryObject<Item> SKIN_BOOK = REGISTRY.register("skin_book", () -> new SkinBookItem());
	public static final RegistryObject<Item> INVISIBLE_ORE = block(YahrYouAreHerobrineRebornModBlocks.INVISIBLE_ORE, YahrYouAreHerobrineRebornModTabs.TAB_YAH);
	public static final RegistryObject<Item> INVISIBLE_DUST = REGISTRY.register("invisible_dust", () -> new InvisibleDustItem());
	public static final RegistryObject<Item> EVIL_DIAMOND = REGISTRY.register("evil_diamond", () -> new EvilDiamondItem());
	public static final RegistryObject<Item> EVIL_DIAMOND_MATTER = REGISTRY.register("evil_diamond_matter", () -> new EvilDiamondMatterItem());
	public static final RegistryObject<Item> NECRONOMICON_TOMO_II = REGISTRY.register("necronomicon_tomo_ii", () -> new NecronomiconTomoIIItem());
	public static final RegistryObject<Item> EVIL_PICKAXE = REGISTRY.register("evil_pickaxe", () -> new EvilPickaxeItem());
	public static final RegistryObject<Item> EVIL_AXE = REGISTRY.register("evil_axe", () -> new EvilAxeItem());
	public static final RegistryObject<Item> EVIL_SWORD = REGISTRY.register("evil_sword", () -> new EvilSwordItem());
	public static final RegistryObject<Item> EVIL_SHOVEL = REGISTRY.register("evil_shovel", () -> new EvilShovelItem());
	public static final RegistryObject<Item> EVIL_HOE = REGISTRY.register("evil_hoe", () -> new EvilHoeItem());
	public static final RegistryObject<Item> NECRONOMICON_TOMO_III = REGISTRY.register("necronomicon_tomo_iii", () -> new NecronomiconTomoIIIItem());
	public static final RegistryObject<Item> HUNTER_SPAWN_EGG = REGISTRY.register("hunter_spawn_egg",
			() -> new ForgeSpawnEggItem(YahrYouAreHerobrineRebornModEntities.HUNTER, -3407872, -3407872, new Item.Properties().tab(YahrYouAreHerobrineRebornModTabs.TAB_YAH)));
	public static final RegistryObject<Item> SPIDER_SPAWN_EGG = REGISTRY.register("spider_spawn_egg",
			() -> new ForgeSpawnEggItem(YahrYouAreHerobrineRebornModEntities.SPIDER, -16777216, -16777216, new Item.Properties().tab(YahrYouAreHerobrineRebornModTabs.TAB_YAH)));
	public static final RegistryObject<Item> NECRONOMICON_TOMO_IV = REGISTRY.register("necronomicon_tomo_iv", () -> new NecronomiconTomoIVItem());
	public static final RegistryObject<Item> NECRONOMICON_TOMO_V = REGISTRY.register("necronomicon_tomo_v", () -> new NecronomiconTomoVItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
