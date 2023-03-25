
package net.mcreator.yahryouareherobrinereborn.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.yahryouareherobrinereborn.procedures.NecronomiconTomoIVRightclickedProcedure;
import net.mcreator.yahryouareherobrinereborn.init.YahrYouAreHerobrineRebornModTabs;

public class NecronomiconTomoIVItem extends Item {
	public NecronomiconTomoIVItem() {
		super(new Item.Properties().tab(YahrYouAreHerobrineRebornModTabs.TAB_YAH).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		NecronomiconTomoIVRightclickedProcedure.execute(entity);
		return ar;
	}
}
