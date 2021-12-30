package io.github.anonymoususerii.thingymod.item;

import io.github.anonymoususerii.thingymod.ThingyMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
	public static final ItemGroup THINGAMABOBS = FabricItemGroupBuilder.build(
			new Identifier(ThingyMod.MOD_ID, "thingamabobs"),
			() -> new ItemStack(ModItems.DERP_DUCK));
}
