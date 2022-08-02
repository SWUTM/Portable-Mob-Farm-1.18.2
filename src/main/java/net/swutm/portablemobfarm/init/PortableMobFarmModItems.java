
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.swutm.portablemobfarm.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.swutm.portablemobfarm.item.ChickenFarmItem;
import net.swutm.portablemobfarm.item.IronGolemFarmItem;
import net.swutm.portablemobfarm.item.MobFarmItem;
import net.swutm.portablemobfarm.portablemobfarm;

public class PortableMobFarmModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, portablemobfarm.MOD_ID);
	public static final RegistryObject<Item> MOB_FARM = REGISTRY.register("mob_farm", () -> new MobFarmItem());
	public static final RegistryObject<Item> IRON_GOLEM_FARM = REGISTRY.register("iron_golem_farm", () -> new IronGolemFarmItem());
	public static final RegistryObject<Item> CHICKEN_FARM = REGISTRY.register("chicken_farm", () -> new ChickenFarmItem());
	public static final RegistryObject<Item> MOB_FARM_BLOCK = block(PortableMobFarmModBlocks.MOB_FARM_BLOCK, null);
	public static final RegistryObject<Item> IRON_FARM_BLOCK = block(PortableMobFarmModBlocks.IRON_FARM_BLOCK, null);
	public static final RegistryObject<Item> CHICKEN_FARM_BLOCK = block(PortableMobFarmModBlocks.CHICKEN_FARM_BLOCK, null);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
