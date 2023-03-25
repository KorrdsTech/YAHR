
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yahryouareherobrinereborn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.yahryouareherobrinereborn.entity.SteveEntity;
import net.mcreator.yahryouareherobrinereborn.entity.SpiderEntity;
import net.mcreator.yahryouareherobrinereborn.entity.HunterEntity;
import net.mcreator.yahryouareherobrinereborn.YahrYouAreHerobrineRebornMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class YahrYouAreHerobrineRebornModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, YahrYouAreHerobrineRebornMod.MODID);
	public static final RegistryObject<EntityType<SteveEntity>> STEVE = register("steve",
			EntityType.Builder.<SteveEntity>of(SteveEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SteveEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HunterEntity>> HUNTER = register("hunter",
			EntityType.Builder.<HunterEntity>of(HunterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HunterEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SpiderEntity>> SPIDER = register("spider",
			EntityType.Builder.<SpiderEntity>of(SpiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpiderEntity::new)

					.sized(1.4f, 0.9f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SteveEntity.init();
			HunterEntity.init();
			SpiderEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(STEVE.get(), SteveEntity.createAttributes().build());
		event.put(HUNTER.get(), HunterEntity.createAttributes().build());
		event.put(SPIDER.get(), SpiderEntity.createAttributes().build());
	}
}
