
package net.mcreator.yahryouareherobrinereborn.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SpiderModel;

import net.mcreator.yahryouareherobrinereborn.entity.SpiderEntity;

public class SpiderRenderer extends MobRenderer<SpiderEntity, SpiderModel<SpiderEntity>> {
	public SpiderRenderer(EntityRendererProvider.Context context) {
		super(context, new SpiderModel(context.bakeLayer(ModelLayers.SPIDER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SpiderEntity entity) {
		return new ResourceLocation("yahr_you_are_herobrine_reborn:textures/entities/cavespider.png");
	}
}
