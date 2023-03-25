package net.mcreator.yahryouareherobrinereborn.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.AdvancementEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.Advancement;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SwitchTimeCycleProcedure {
	@SubscribeEvent
	public static void onAdvancement(AdvancementEvent event) {
		execute(event, event.getEntity().level, event.getAdvancement());
	}

	public static void execute(LevelAccessor world, Advancement advancement) {
		execute(null, world, advancement);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Advancement advancement) {
		if (advancement == null)
			return;
		if (world instanceof Level _lvl && _lvl.getServer() != null ? _lvl.getServer().getAdvancements().getAdvancement(new ResourceLocation("yahr_you_are_herobrine_reborn:you_are_herobrine")).equals(advancement) : false) {
			if (world instanceof ServerLevel _level)
				_level.setDayTime(13000);
		}
	}
}
