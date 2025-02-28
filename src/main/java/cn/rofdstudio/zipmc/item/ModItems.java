package cn.rofdstudio.zipmc.item;

import cn.rofdstudio.zipmc.ZipMc;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ZIP_IRON_I = registerItems("zip_iron_i", new Item(new FabricItemSettings()));
    public static final Item ZIP_IRON_II = registerItems("zip_iron_ii", new Item(new FabricItemSettings()));
    public static final Item ZIP_IRON_III = registerItems("zip_iron_iii", new Item(new FabricItemSettings()));
    public static final Item ZIP_GOLD_I = registerItems("zip_gold_i", new Item(new FabricItemSettings()));
    public static final Item ZIP_GOLD_II = registerItems("zip_gold_ii", new Item(new FabricItemSettings()));
    public static final Item ZIP_GOLD_III = registerItems("zip_gold_iii", new Item(new FabricItemSettings()));
    public static final Item ZIP_DIAMOND_I = registerItems("zip_diamond_i", new Item(new FabricItemSettings()));
    public static final Item ZIP_DIAMOND_II = registerItems("zip_diamond_ii", new Item(new FabricItemSettings()));
    public static final Item ZIP_DIAMOND_III = registerItems("zip_diamond_iii", new Item(new FabricItemSettings()));
    public static final Item ZIP_EMERALD_I = registerItems("zip_emerald_i", new Item(new FabricItemSettings()));
    public static final Item ZIP_EMERALD_II = registerItems("zip_emerald_ii", new Item(new FabricItemSettings()));
    public static final Item ZIP_EMERALD_III = registerItems("zip_emerald_iii", new Item(new FabricItemSettings()));
    public static final Item ZIP_NETHERITE_I = registerItems("zip_netherite_i", new Item(new FabricItemSettings()));
    public static final Item ZIP_NETHERITE_II = registerItems("zip_netherite_ii", new Item(new FabricItemSettings()));
    public static final Item ZIP_NETHERITE_III = registerItems("zip_netherite_iii", new Item(new FabricItemSettings()));
    public static final Item IRON_PLATE = registerItems("iron_plate", new Item(new FabricItemSettings()));//此单行为物品item注册语句，注册物品为zip_stone_I

    private static void addItemsToItemGroup(FabricItemGroupEntries fabricItemGroupEntries) {
        fabricItemGroupEntries.add(ZIP_IRON_I);
        fabricItemGroupEntries.add(ZIP_IRON_II);
        fabricItemGroupEntries.add(ZIP_IRON_III);
        fabricItemGroupEntries.add(ZIP_GOLD_I);
        fabricItemGroupEntries.add(ZIP_GOLD_II);
        fabricItemGroupEntries.add(ZIP_GOLD_III);
        fabricItemGroupEntries.add(ZIP_DIAMOND_I);
        fabricItemGroupEntries.add(ZIP_DIAMOND_II);
        fabricItemGroupEntries.add(ZIP_DIAMOND_III);
        fabricItemGroupEntries.add(ZIP_EMERALD_I);
        fabricItemGroupEntries.add(ZIP_EMERALD_II);
        fabricItemGroupEntries.add(ZIP_EMERALD_III);
        fabricItemGroupEntries.add(ZIP_NETHERITE_I);
        fabricItemGroupEntries.add(ZIP_NETHERITE_II);
        fabricItemGroupEntries.add(ZIP_NETHERITE_III);
        fabricItemGroupEntries.add(IRON_PLATE);
    }
    private static Item registerItems(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ZipMc.MOD_ID, name), item);
    }
    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INVENTORY).register(ModItems::addItemsToItemGroup);
    }
}