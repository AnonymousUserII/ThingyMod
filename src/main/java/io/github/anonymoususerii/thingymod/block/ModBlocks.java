package io.github.anonymoususerii.thingymod.block;

import io.github.anonymoususerii.thingymod.ThingyMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
	private static void registerBlock(String name, Block block, ItemGroup itemGroup) {
		Registry.register(Registry.BLOCK, new Identifier(ThingyMod.MOD_ID, name), block);
		registerBlockItem(name, block, itemGroup);
	}
	
	private static void registerBlockItem(String name, Block block, ItemGroup itemGroup) {
		Registry.register(Registry.ITEM, new Identifier(ThingyMod.MOD_ID, name),
				new BlockItem(block, new FabricItemSettings().group(itemGroup)));
	}
	
	public static final Block CRATE = new Block(FabricBlockSettings.of(Material.WOOD)
			.strength(2.0f, 8.0f)
			.sounds(BlockSoundGroup.DEEPSLATE));
	
	public static final Block CHECKERBOARD_TILE = new Block(FabricBlockSettings.of(Material.STONE)
			.strength(4.0f, 4.0f)
			.requiresTool());
	
	public static void registerModBlocks() {
		ThingyMod.LOGGER.info("Registering Blocks for: " + ThingyMod.MOD_ID);
		
		registerBlock("crate", CRATE, ItemGroup.DECORATIONS);
		registerBlock("checkerboard_tile", CHECKERBOARD_TILE, ItemGroup.DECORATIONS);
	}
}
