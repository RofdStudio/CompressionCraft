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
    public static final Block ZIP_COBBLESTONE_I = registerBlocks("zip_cobblestone_i",
                new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block ZIP_COBBLESTONE_II = registerBlocks("zip_cobblestone_ii",
                new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block ZIP_COBBLESTONE_III = registerBlocks("zip_cobblestone_iii",
                new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
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
