package cn.rofdstudio.zipmc;

import cn.rofdstudio.zipmc.block.ModBlocks;
import cn.rofdstudio.zipmc.item.ModItemGroup;
import cn.rofdstudio.zipmc.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Modifier;

public class ZipMc implements ModInitializer {
	public static final String MOD_ID = "zipmc";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItems();
		ModItemGroup.registerModItemGroup();
		ModBlocks.registerModBlocks();
	}
}