package com.sair.aliensbiome;

import com.sair.aliensbiome.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AliensBiome implements ModInitializer {
	public static final String MOD_ID = "aliens-biome";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
	}
}