package cn.rofdstudio.zipmc.item;

import cn.rofdstudio.zipmc.ZipMc;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ZIP_IRON_I = registerItems("zip_iron_i", new Item(new FabricItemSettings()));
    public static final Item ZIP_IRON_II = registerItems("zip_iron_ii", new Item(new FabricItemSettings()));
    public static final Item ZIP_IRON_III = registerItems("zip_iron_iii", new Item(new FabricItemSettings()));
    public static final Item ZIP_IRON_IV = registerItems("zip_iron_iv", new Item(new FabricItemSettings()));
    public static final Item ZIP_IRON_V = registerItems("zip_iron_v", new Item(new FabricItemSettings()));
    public static final Item ZIP_IRON_VI = registerItems("zip_iron_vi", new Item(new FabricItemSettings()));
    public static final Item ZIP_IRON_VII = registerItems("zip_iron_vii", new Item(new FabricItemSettings()));
    public static final Item ZIP_IRON_VIII = registerItems("zip_iron_viii", new Item(new FabricItemSettings()));
    public static final Item ZIP_IRON_VIIII = registerItems("zip_iron_viiii", new Item(new FabricItemSettings()));
    public static final Item ZIP_GOLD_I = registerItems("zip_gold_i", new Item(new FabricItemSettings()));
    public static final Item ZIP_GOLD_II = registerItems("zip_gold_ii", new Item(new FabricItemSettings()));
    public static final Item ZIP_GOLD_III = registerItems("zip_gold_iii", new Item(new FabricItemSettings()));
    public static final Item ZIP_GOLD_IV = registerItems("zip_gold_iv", new Item(new FabricItemSettings()));
    public static final Item ZIP_GOLD_V = registerItems("zip_gold_v", new Item(new FabricItemSettings()));
    public static final Item ZIP_GOLD_VI = registerItems("zip_gold_vi", new Item(new FabricItemSettings()));
    public static final Item ZIP_GOLD_VII = registerItems("zip_gold_vii", new Item(new FabricItemSettings()));
    public static final Item ZIP_GOLD_VIII = registerItems("zip_gold_viii", new Item(new FabricItemSettings()));
    public static final Item ZIP_GOLD_VIIII = registerItems("zip_gold_viiii", new Item(new FabricItemSettings()));
    public static final Item ZIP_DIAMOND_I = registerItems("zip_diamond_i", new Item(new FabricItemSettings()));
    public static final Item ZIP_DIAMOND_II = registerItems("zip_diamond_ii", new Item(new FabricItemSettings()));
    public static final Item ZIP_DIAMOND_III = registerItems("zip_diamond_iii", new Item(new FabricItemSettings()));
    public static final Item ZIP_DIAMOND_IV = registerItems("zip_diamond_iv", new Item(new FabricItemSettings()));
    public static final Item ZIP_DIAMOND_V = registerItems("zip_diamond_v", new Item(new FabricItemSettings()));
    public static final Item ZIP_DIAMOND_VI = registerItems("zip_diamond_vi", new Item(new FabricItemSettings()));
    public static final Item ZIP_DIAMOND_VII = registerItems("zip_diamond_vii", new Item(new FabricItemSettings()));
    public static final Item ZIP_DIAMOND_VIII = registerItems("zip_diamond_viii", new Item(new FabricItemSettings()));
    public static final Item ZIP_DIAMOND_VIIII = registerItems("zip_diamond_viiii", new Item(new FabricItemSettings()));
    public static final Item ZIP_EMERALD_I = registerItems("zip_emerald_i", new Item(new FabricItemSettings()));
    public static final Item ZIP_EMERALD_II = registerItems("zip_emerald_ii", new Item(new FabricItemSettings()));
    public static final Item ZIP_EMERALD_III = registerItems("zip_emerald_iii", new Item(new FabricItemSettings()));
    public static final Item ZIP_EMERALD_IV = registerItems("zip_emerald_iv", new Item(new FabricItemSettings()));
    public static final Item ZIP_EMERALD_VI = registerItems("zip_emerald_vi", new Item(new FabricItemSettings()));
    public static final Item ZIP_EMERALD_V = registerItems("zip_emerald_v", new Item(new FabricItemSettings()));
    public static final Item ZIP_EMERALD_VII = registerItems("zip_emerald_vii", new Item(new FabricItemSettings()));
    public static final Item ZIP_EMERALD_VIII = registerItems("zip_emerald_viii", new Item(new FabricItemSettings()));
    public static final Item ZIP_EMERALD_VIIII = registerItems("zip_emerald_viiii", new Item(new FabricItemSettings()));
    public static final Item ZIP_NETHERITE_I = registerItems("zip_netherite_i", new Item(new FabricItemSettings()));
    public static final Item ZIP_NETHERITE_II = registerItems("zip_netherite_ii", new Item(new FabricItemSettings()));
    public static final Item ZIP_NETHERITE_III = registerItems("zip_netherite_iii", new Item(new FabricItemSettings()));
    public static final Item ZIP_NETHERITE_IV = registerItems("zip_netherite_iv", new Item(new FabricItemSettings()));
    public static final Item ZIP_NETHERITE_V = registerItems("zip_netherite_v", new Item(new FabricItemSettings()));
    public static final Item ZIP_NETHERITE_VI = registerItems("zip_netherite_vi", new Item(new FabricItemSettings()));
    public static final Item ZIP_NETHERITE_VII = registerItems("zip_netherite_vii", new Item(new FabricItemSettings()));
    public static final Item ZIP_NETHERITE_VIII = registerItems("zip_netherite_viii", new Item(new FabricItemSettings()));
    public static final Item ZIP_NETHERITE_VIIII = registerItems("zip_netherite_viiii", new Item(new FabricItemSettings()));
    public static final Item ZIP_REDSTONE_I = registerItems("zip_redstone_i", new Item(new FabricItemSettings()));
    public static final Item ZIP_REDSTONE_II = registerItems("zip_redstone_ii", new Item(new FabricItemSettings()));
    public static final Item ZIP_REDSTONE_III = registerItems("zip_redstone_iii", new Item(new FabricItemSettings()));
    public static final Item ZIP_REDSTONE_IV = registerItems("zip_redstone_iv", new Item(new FabricItemSettings()));
    public static final Item ZIP_REDSTONE_V = registerItems("zip_redstone_v", new Item(new FabricItemSettings()));
    public static final Item ZIP_REDSTONE_VI = registerItems("zip_redstone_vi", new Item(new FabricItemSettings()));
    public static final Item ZIP_REDSTONE_VII = registerItems("zip_redstone_vii", new Item(new FabricItemSettings()));
    public static final Item ZIP_REDSTONE_VIII = registerItems("zip_redstone_viii", new Item(new FabricItemSettings()));
    public static final Item ZIP_REDSTONE_VIIII = registerItems("zip_redstone_viiii", new Item(new FabricItemSettings()));
    public static final Item ZIP_UPGRADE = registerItems("zip_upgrade", new Item(new FabricItemSettings()));
    public static final Item IRON_PLATE = registerItems("iron_plate", new Item(new FabricItemSettings()));//此单行为物品item注册语句，注册物品为zip_stone_I
    public static final Item COMPRESSED_TOOL_MATERIALS = registerItems( "compressed_tool_materials",new Item(new FabricItemSettings()));
    public static final Item DOUBLE_COMPRESSED_TOOL_MATERIALS = registerItems( "double_compressed_tool_materials",new Item(new FabricItemSettings()));
    public static final Item TRIPLE_COMPRESSED_TOOL_MATERIALS = registerItems( "triple_compressed_tool_materials",new Item(new FabricItemSettings()));
    public static final Item COMPRESSED_SWORD = registerItems("compressed_sword",new SwordItem(ModToolMaterials.COMPRESSED_TOOL_MATERIALS,
            15,-2.5F,new Item.Settings()));
    public static final Item COMPRESSED_SHOVEL = registerItems("compressed_shovel",new ShovelItem(ModToolMaterials.COMPRESSED_TOOL_MATERIALS,
            3,-2.0F,new Item.Settings()));
    public static final Item COMPRESSED_PICKAXE = registerItems("compressed_pickaxe",new PickaxeItem(ModToolMaterials.COMPRESSED_TOOL_MATERIALS,
            5,-2.0F,new Item.Settings()));
    public static final Item COMPRESSED_AXE = registerItems("compressed_axe",new AxeItem(ModToolMaterials.COMPRESSED_TOOL_MATERIALS,
            18,-1.5F,new Item.Settings()));
    public static final Item COMPRESSED_HOE = registerItems("compressed_hoe",new HoeItem(ModToolMaterials.COMPRESSED_TOOL_MATERIALS,
            3,-2.0F,new Item.Settings()));

    private static void addItemsToItemGroup(FabricItemGroupEntries fabricItemGroupEntries) {
        fabricItemGroupEntries.add(ZIP_IRON_I);
        fabricItemGroupEntries.add(ZIP_IRON_II);
        fabricItemGroupEntries.add(ZIP_IRON_III);
        fabricItemGroupEntries.add(ZIP_IRON_IV);
        fabricItemGroupEntries.add(ZIP_IRON_V);
        fabricItemGroupEntries.add(ZIP_IRON_VI);
        fabricItemGroupEntries.add(ZIP_IRON_VII);
        fabricItemGroupEntries.add(ZIP_IRON_VIII);
        fabricItemGroupEntries.add(ZIP_IRON_VIIII);
        fabricItemGroupEntries.add(ZIP_GOLD_I);
        fabricItemGroupEntries.add(ZIP_GOLD_II);
        fabricItemGroupEntries.add(ZIP_GOLD_III);
        fabricItemGroupEntries.add(ZIP_GOLD_IV);
        fabricItemGroupEntries.add(ZIP_GOLD_V);
        fabricItemGroupEntries.add(ZIP_GOLD_VI);
        fabricItemGroupEntries.add(ZIP_GOLD_VII);
        fabricItemGroupEntries.add(ZIP_GOLD_VIII);
        fabricItemGroupEntries.add(ZIP_GOLD_VIIII);
        fabricItemGroupEntries.add(ZIP_DIAMOND_I);
        fabricItemGroupEntries.add(ZIP_DIAMOND_II);
        fabricItemGroupEntries.add(ZIP_DIAMOND_III);
        fabricItemGroupEntries.add(ZIP_DIAMOND_IV);
        fabricItemGroupEntries.add(ZIP_DIAMOND_V);
        fabricItemGroupEntries.add(ZIP_DIAMOND_VI);
        fabricItemGroupEntries.add(ZIP_DIAMOND_VII);
        fabricItemGroupEntries.add(ZIP_DIAMOND_VIII);
        fabricItemGroupEntries.add(ZIP_DIAMOND_VIIII);
        fabricItemGroupEntries.add(ZIP_EMERALD_I);
        fabricItemGroupEntries.add(ZIP_EMERALD_II);
        fabricItemGroupEntries.add(ZIP_EMERALD_III);
        fabricItemGroupEntries.add(ZIP_EMERALD_IV);
        fabricItemGroupEntries.add(ZIP_EMERALD_V);
        fabricItemGroupEntries.add(ZIP_EMERALD_VI);
        fabricItemGroupEntries.add(ZIP_EMERALD_VII);
        fabricItemGroupEntries.add(ZIP_EMERALD_VIII);
        fabricItemGroupEntries.add(ZIP_EMERALD_VIIII);
        fabricItemGroupEntries.add(ZIP_NETHERITE_I);
        fabricItemGroupEntries.add(ZIP_NETHERITE_II);
        fabricItemGroupEntries.add(ZIP_NETHERITE_III);
        fabricItemGroupEntries.add(ZIP_NETHERITE_IV);
        fabricItemGroupEntries.add(ZIP_NETHERITE_V);
        fabricItemGroupEntries.add(ZIP_NETHERITE_VI);
        fabricItemGroupEntries.add(ZIP_NETHERITE_VII);
        fabricItemGroupEntries.add(ZIP_NETHERITE_VIII);
        fabricItemGroupEntries.add(ZIP_NETHERITE_VIIII);
        fabricItemGroupEntries.add(ZIP_REDSTONE_I);
        fabricItemGroupEntries.add(ZIP_REDSTONE_II);
        fabricItemGroupEntries.add(ZIP_REDSTONE_III);
        fabricItemGroupEntries.add(ZIP_REDSTONE_IV);
        fabricItemGroupEntries.add(ZIP_REDSTONE_V);
        fabricItemGroupEntries.add(ZIP_REDSTONE_VI);
        fabricItemGroupEntries.add(ZIP_REDSTONE_VII);
        fabricItemGroupEntries.add(ZIP_REDSTONE_VIII);
        fabricItemGroupEntries.add(ZIP_REDSTONE_VIIII);
        fabricItemGroupEntries.add(ZIP_UPGRADE);
        fabricItemGroupEntries.add(IRON_PLATE);
    }
    private static Item registerItems(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ZipMc.MOD_ID, name), item);
    }
    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INVENTORY).register(ModItems::addItemsToItemGroup);
    }
}