
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.swutm.portablemobfarm.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.swutm.portablemobfarm.block.ChickenFarmBlockBlock;
import net.swutm.portablemobfarm.block.IronFarmBlockBlock;
import net.swutm.portablemobfarm.block.MobFarmBlockBlock;
import net.swutm.portablemobfarm.portablemobfarm;


public class PortableMobFarmModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, portablemobfarm.MOD_ID);
	public static final RegistryObject<Block> MOB_FARM_BLOCK = REGISTRY.register("mob_farm_block", () -> new MobFarmBlockBlock());
	public static final RegistryObject<Block> IRON_FARM_BLOCK = REGISTRY.register("iron_farm_block", () -> new IronFarmBlockBlock());
	public static final RegistryObject<Block> CHICKEN_FARM_BLOCK = REGISTRY.register("chicken_farm_block", () -> new ChickenFarmBlockBlock());
}
