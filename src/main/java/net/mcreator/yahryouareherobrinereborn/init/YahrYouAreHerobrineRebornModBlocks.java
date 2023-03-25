
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yahryouareherobrinereborn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.yahryouareherobrinereborn.block.InvisibleOreBlock;
import net.mcreator.yahryouareherobrinereborn.block.IceRubyOreBlock;
import net.mcreator.yahryouareherobrinereborn.YahrYouAreHerobrineRebornMod;

public class YahrYouAreHerobrineRebornModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, YahrYouAreHerobrineRebornMod.MODID);
	public static final RegistryObject<Block> ICE_RUBY_ORE = REGISTRY.register("ice_ruby_ore", () -> new IceRubyOreBlock());
	public static final RegistryObject<Block> INVISIBLE_ORE = REGISTRY.register("invisible_ore", () -> new InvisibleOreBlock());
}
