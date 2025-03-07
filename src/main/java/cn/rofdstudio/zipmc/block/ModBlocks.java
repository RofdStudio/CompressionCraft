package cn.rofdstudio.zipmc.block;

import cn.rofdstudio.zipmc.ZipMc;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block ZIP_STONE_I = registerBlocks("zip_stone_i",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block ZIP_STONE_II = registerBlocks("zip_stone_ii",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block ZIP_STONE_III = registerBlocks("zip_stone_iii",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block ZIP_STONE_IV = registerBlocks("zip_stone_iv",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block ZIP_STONE_V = registerBlocks("zip_stone_v",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block ZIP_STONE_VI = registerBlocks("zip_stone_vi",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block ZIP_STONE_VII = registerBlocks("zip_stone_vii",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block ZIP_STONE_VIII = registerBlocks("zip_stone_viii",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block ZIP_STONE_VIIII = registerBlocks("zip_stone_viiii",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block ZIP_COBBLESTONE_I = registerBlocks("zip_cobblestone_i",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block ZIP_COBBLESTONE_II = registerBlocks("zip_cobblestone_ii",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block ZIP_COBBLESTONE_III = registerBlocks("zip_cobblestone_iii",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block ZIP_COBBLESTONE_IV = registerBlocks("zip_cobblestone_iv",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block ZIP_COBBLESTONE_V = registerBlocks("zip_cobblestone_v",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block ZIP_COBBLESTONE_VI = registerBlocks("zip_cobblestone_vi",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block ZIP_COBBLESTONE_VII = registerBlocks("zip_cobblestone_vii",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block ZIP_COBBLESTONE_VIII = registerBlocks("zip_cobblestone_viii",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block ZIP_COBBLESTONE_VIIII = registerBlocks("zip_cobblestone_viiii",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block ZIP_IRON_BLOCK_I = registerBlocks("zip_iron_block_i",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block ZIP_IRON_BLOCK_II = registerBlocks("zip_iron_block_ii",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block ZIP_IRON_BLOCK_III = registerBlocks("zip_iron_block_iii",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block ZIP_IRON_BLOCK_IV = registerBlocks("zip_iron_block_iv",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block ZIP_IRON_BLOCK_V = registerBlocks("zip_iron_block_v",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block ZIP_IRON_BLOCK_VI = registerBlocks("zip_iron_block_vi",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block ZIP_IRON_BLOCK_VII = registerBlocks("zip_iron_block_vii",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block ZIP_IRON_BLOCK_VIII = registerBlocks("zip_iron_block_viii",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block ZIP_IRON_BLOCK_VIIII = registerBlocks("zip_iron_block_viiii",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block ZIP_GOLD_BLOCK_I = registerBlocks("zip_gold_block_i",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block ZIP_GOLD_BLOCK_II = registerBlocks("zip_gold_block_ii",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block ZIP_GOLD_BLOCK_III = registerBlocks("zip_gold_block_iii",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block ZIP_GOLD_BLOCK_IV = registerBlocks("zip_gold_block_iv",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block ZIP_GOLD_BLOCK_V = registerBlocks("zip_gold_block_v",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block ZIP_GOLD_BLOCK_VI = registerBlocks("zip_gold_block_vi",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block ZIP_GOLD_BLOCK_VII = registerBlocks("zip_gold_block_vii",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block ZIP_GOLD_BLOCK_VIII = registerBlocks("zip_gold_block_viii",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block ZIP_GOLD_BLOCK_VIIII = registerBlocks("zip_gold_block_viiii",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block ZIP_DIAMOND_BLOCK_I = registerBlocks("zip_diamond_block_i",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block ZIP_DIAMOND_BLOCK_II = registerBlocks("zip_diamond_block_ii",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block ZIP_DIAMOND_BLOCK_III = registerBlocks("zip_diamond_block_iii",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block ZIP_DIAMOND_BLOCK_IV = registerBlocks("zip_diamond_block_iv",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block ZIP_DIAMOND_BLOCK_V = registerBlocks("zip_diamond_block_v",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block ZIP_DIAMOND_BLOCK_VI = registerBlocks("zip_diamond_block_vi",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block ZIP_DIAMOND_BLOCK_VII = registerBlocks("zip_diamond_block_vii",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block ZIP_DIAMOND_BLOCK_VIII = registerBlocks("zip_diamond_block_viii",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block ZIP_DIAMOND_BLOCK_VIIII = registerBlocks("zip_diamond_block_viiii",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block ZIP_EMERALD_BLOCK_I = registerBlocks("zip_emerald_block_i",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));
    public static final Block ZIP_EMERALD_BLOCK_II = registerBlocks("zip_emerald_block_ii",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));
    public static final Block ZIP_EMERALD_BLOCK_III = registerBlocks("zip_emerald_block_iii",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));
    public static final Block ZIP_EMERALD_BLOCK_IV = registerBlocks("zip_emerald_block_iv",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));
    public static final Block ZIP_EMERALD_BLOCK_V = registerBlocks("zip_emerald_block_v",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));
    public static final Block ZIP_EMERALD_BLOCK_VI = registerBlocks("zip_emerald_block_vi",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));
    public static final Block ZIP_EMERALD_BLOCK_VII = registerBlocks("zip_emerald_block_vii",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));
    public static final Block ZIP_EMERALD_BLOCK_VIII = registerBlocks("zip_emerald_block_viii",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));
    public static final Block ZIP_EMERALD_BLOCK_VIIII = registerBlocks("zip_emerald_block_viiii",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));
    public static final Block ZIP_NETHERITE_BLOCK_I = registerBlocks("zip_netherite_block_i",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static final Block ZIP_NETHERITE_BLOCK_II = registerBlocks("zip_netherite_block_ii",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static final Block ZIP_NETHERITE_BLOCK_III = registerBlocks("zip_netherite_block_iii",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static final Block ZIP_NETHERITE_BLOCK_IV = registerBlocks("zip_netherite_block_iv",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static final Block ZIP_NETHERITE_BLOCK_V = registerBlocks("zip_netherite_block_v",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static final Block ZIP_NETHERITE_BLOCK_VI = registerBlocks("zip_netherite_block_vi",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static final Block ZIP_NETHERITE_BLOCK_VII = registerBlocks("zip_netherite_block_vii",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static final Block ZIP_NETHERITE_BLOCK_VIII = registerBlocks("zip_netherite_block_viii",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static final Block ZIP_NETHERITE_BLOCK_VIIII = registerBlocks("zip_netherite_block_viiii",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static final Block ZIP_REDSTONE_BLOCK_I = registerBlocks("zip_redstone_block_i",
            new Block(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK)));
    public static final Block ZIP_REDSTONE_BLOCK_II = registerBlocks("zip_redstone_block_ii",
            new Block(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK)));
    public static final Block ZIP_REDSTONE_BLOCK_III = registerBlocks("zip_redstone_block_iii",
            new Block(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK)));
    public static final Block ZIP_REDSTONE_BLOCK_IV = registerBlocks("zip_redstone_block_iv",
            new Block(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK)));
    public static final Block ZIP_REDSTONE_BLOCK_V = registerBlocks("zip_redstone_block_v",
            new Block(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK)));
    public static final Block ZIP_REDSTONE_BLOCK_VI = registerBlocks("zip_redstone_block_vi",
            new Block(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK)));
    public static final Block ZIP_REDSTONE_BLOCK_VII = registerBlocks("zip_redstone_block_vii",
            new Block(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK)));
    public static final Block ZIP_REDSTONE_BLOCK_VIII = registerBlocks("zip_redstone_block_viii",
            new Block(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK)));
    public static final Block ZIP_REDSTONE_BLOCK_VIIII = registerBlocks("zip_redstone_block_viiii",
            new Block(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK)));

    private static Block registerBlocks(String name,Block block){
        registerBlockItems(name,block);
        return Registry.register(Registries.BLOCK,new Identifier(ZipMc.MOD_ID,name),block);
    }
    private static Item registerBlockItems(String name, Block block){
        return Registry.register(Registries.ITEM,new Identifier(ZipMc.MOD_ID,name),
                new BlockItem(block,new FabricItemSettings()));
    }
    public static void registerModBlocks(){

    }
}
