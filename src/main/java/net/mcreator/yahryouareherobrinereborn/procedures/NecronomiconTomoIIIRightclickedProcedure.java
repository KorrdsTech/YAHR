package net.mcreator.yahryouareherobrinereborn.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class NecronomiconTomoIIIRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3(0, 1, 0));
	}
}
