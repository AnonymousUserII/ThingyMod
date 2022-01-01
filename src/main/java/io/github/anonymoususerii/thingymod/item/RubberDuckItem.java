package io.github.anonymoususerii.thingymod.item;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RubberDuckItem extends Item {
	public RubberDuckItem(Settings settings) { super(settings); }
	
	@Override
	public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
		if (Screen.hasShiftDown()) {
			tooltip.add(new TranslatableText("tooltip.thingymod.rubber_duck_shift"));
		} else {
			tooltip.add(new TranslatableText("tooltip.thingymod.rubber_duck"));
		}
		
		super.appendTooltip(stack, world, tooltip, context);
	}
}
