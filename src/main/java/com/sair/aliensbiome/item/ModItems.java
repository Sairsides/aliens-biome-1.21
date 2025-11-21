package com.sair.aliensbiome.item;

import com.sair.aliensbiome.AliensBiome;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item STELLARIUM_ORE = registerItem ("stellarium_ore", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AliensBiome.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AliensBiome.LOGGER.info("Registering Mod Items for " + AliensBiome.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
           entries.add(STELLARIUM_ORE);
        });
    }
}
