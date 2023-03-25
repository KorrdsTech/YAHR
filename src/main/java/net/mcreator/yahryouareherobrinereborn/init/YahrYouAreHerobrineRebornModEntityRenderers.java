
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yahryouareherobrinereborn.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.yahryouareherobrinereborn.client.renderer.SteveRenderer;
import net.mcreator.yahryouareherobrinereborn.client.renderer.SpiderRenderer;
import net.mcreator.yahryouareherobrinereborn.client.renderer.HunterRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class YahrYouAreHerobrineRebornModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(YahrYouAreHerobrineRebornModEntities.STEVE.get(), SteveRenderer::new);
		event.registerEntityRenderer(YahrYouAreHerobrineRebornModEntities.HUNTER.get(), HunterRenderer::new);
		event.registerEntityRenderer(YahrYouAreHerobrineRebornModEntities.SPIDER.get(), SpiderRenderer::new);
	}
}
