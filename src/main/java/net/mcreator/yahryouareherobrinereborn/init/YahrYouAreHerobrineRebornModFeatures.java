
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yahryouareherobrinereborn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.yahryouareherobrinereborn.world.features.ores.IceRubyOreFeature;
import net.mcreator.yahryouareherobrinereborn.world.features.SteveHouseFeature;
import net.mcreator.yahryouareherobrinereborn.YahrYouAreHerobrineRebornMod;

@Mod.EventBusSubscriber
public class YahrYouAreHerobrineRebornModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, YahrYouAreHerobrineRebornMod.MODID);
	public static final RegistryObject<Feature<?>> ICE_RUBY_ORE = REGISTRY.register("ice_ruby_ore", IceRubyOreFeature::feature);
	public static final RegistryObject<Feature<?>> STEVE_HOUSE = REGISTRY.register("steve_house", SteveHouseFeature::feature);
}
