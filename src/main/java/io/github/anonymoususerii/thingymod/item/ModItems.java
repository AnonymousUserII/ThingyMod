package io.github.anonymoususerii.thingymod.item;

import io.github.anonymoususerii.thingymod.ThingyMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {
    private static void registerItem(String name, Item item) {
        Registry.register(Registry.ITEM, new Identifier(ThingyMod.MOD_ID, name), item);
    }
    
    public static final Item DERP_DUCK = new Item(new FabricItemSettings().rarity(Rarity.EPIC).maxCount(0));
    
    public static final Item COMPRESSED_SUGAR = new Item(new FabricItemSettings()
            .group(ModItemGroup.THINGAMABOBS)
            .rarity(Rarity.COMMON));
    
    public static final Item DOUBLE_COMPRESSED_SUGAR = new Item(new FabricItemSettings()
            .group(ModItemGroup.THINGAMABOBS)
            .rarity(Rarity.COMMON));
    
    public static final Item CAVITY_ON_STICK = new Item(new FabricItemSettings()
            .group(ModItemGroup.THINGAMABOBS)
            .rarity(Rarity.COMMON)
            .food(new FoodComponent.Builder()
                    .alwaysEdible().snack().hunger(1)
                    .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 80, 1), 1.0f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 80, 2), 1.0f)
                    .build()
            ));
    
    public static final Item RUBBER_DUCK = new RubberDuckItem(new FabricItemSettings()
            .group(ModItemGroup.THINGAMABOBS)
            .rarity(Rarity.EPIC)
            .recipeRemainder(CAVITY_ON_STICK)
            .fireproof());
    
    public static void registerModItems() {
        ThingyMod.LOGGER.info("Registering Items for " + ThingyMod.MOD_ID);
        
        registerItem("derp_duck", DERP_DUCK);
        registerItem("rubber_duck", RUBBER_DUCK);
        registerItem("compressed_sugar", COMPRESSED_SUGAR);
        registerItem("double_compressed_sugar", DOUBLE_COMPRESSED_SUGAR);
        registerItem("cavity_on_stick", CAVITY_ON_STICK);
    }
}
