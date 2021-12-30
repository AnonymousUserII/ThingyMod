package io.github.anonymoususerii.thingymod.util;

import io.github.anonymoususerii.thingymod.block.ModBlocks;
import io.github.anonymoususerii.thingymod.item.ModItems;

public class Register {
	public static void registerModStuff() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
