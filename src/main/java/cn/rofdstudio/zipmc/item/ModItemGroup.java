package cn.rofdstudio.zipmc.item;

import cn.rofdstudio.zipmc.ZipMc;
import cn.rofdstudio.zipmc.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ZIPMC_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ZipMc.MOD_ID,"zipmc_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.zipmc_group"))
                    .icon(()-> new ItemStack(ModItems.ZIP_IRON_I)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ZIP_IRON_I);
                        entries.add(ModItems.ZIP_IRON_II);
                        entries.add(ModItems.ZIP_IRON_III);
                        entries.add(ModItems.ZIP_IRON_IV);
                        entries.add(ModItems.ZIP_IRON_V);
                        entries.add(ModItems.ZIP_IRON_VI);
                        entries.add(ModItems.ZIP_IRON_VII);
                        entries.add(ModItems.ZIP_IRON_VIII);
                        entries.add(ModItems.ZIP_IRON_VIIII);
                        entries.add(ModItems.ZIP_GOLD_I);
                        entries.add(ModItems.ZIP_GOLD_II);
                        entries.add(ModItems.ZIP_GOLD_III);
                        entries.add(ModItems.ZIP_GOLD_IV);
                        entries.add(ModItems.ZIP_GOLD_V);
                        entries.add(ModItems.ZIP_GOLD_VI);
                        entries.add(ModItems.ZIP_GOLD_VII);
                        entries.add(ModItems.ZIP_GOLD_VIII);
                        entries.add(ModItems.ZIP_GOLD_VIIII);
                        entries.add(ModItems.ZIP_DIAMOND_I);
                        entries.add(ModItems.ZIP_DIAMOND_II);
                        entries.add(ModItems.ZIP_DIAMOND_III);
                        entries.add(ModItems.ZIP_DIAMOND_IV);
                        entries.add(ModItems.ZIP_DIAMOND_V);
                        entries.add(ModItems.ZIP_DIAMOND_VI);
                        entries.add(ModItems.ZIP_DIAMOND_VII);
                        entries.add(ModItems.ZIP_DIAMOND_VIII);
                        entries.add(ModItems.ZIP_DIAMOND_VIIII);
                        entries.add(ModItems.ZIP_EMERALD_I);
                        entries.add(ModItems.ZIP_EMERALD_II);
                        entries.add(ModItems.ZIP_EMERALD_III);
                        entries.add(ModItems.ZIP_EMERALD_IV);
                        entries.add(ModItems.ZIP_EMERALD_V);
                        entries.add(ModItems.ZIP_EMERALD_VI);
                        entries.add(ModItems.ZIP_EMERALD_VII);
                        entries.add(ModItems.ZIP_EMERALD_VIII);
                        entries.add(ModItems.ZIP_EMERALD_VIIII);
                        entries.add(ModItems.ZIP_NETHERITE_I);
                        entries.add(ModItems.ZIP_NETHERITE_II);
                        entries.add(ModItems.ZIP_NETHERITE_III);
                        entries.add(ModItems.ZIP_NETHERITE_IV);
                        entries.add(ModItems.ZIP_NETHERITE_V);
                        entries.add(ModItems.ZIP_NETHERITE_VI);
                        entries.add(ModItems.ZIP_NETHERITE_VII);
                        entries.add(ModItems.ZIP_NETHERITE_VIII);
                        entries.add(ModItems.ZIP_NETHERITE_VIIII);
                        entries.add(ModBlocks.ZIP_STONE_I);
                        entries.add(ModBlocks.ZIP_STONE_II);
                        entries.add(ModBlocks.ZIP_STONE_III);
                        entries.add(ModBlocks.ZIP_STONE_IV);
                        entries.add(ModBlocks.ZIP_STONE_V);
                        entries.add(ModBlocks.ZIP_STONE_VI);
                        entries.add(ModBlocks.ZIP_STONE_VII);
                        entries.add(ModBlocks.ZIP_STONE_VIII);
                        entries.add(ModBlocks.ZIP_STONE_VIIII);
                        entries.add(ModBlocks.ZIP_COBBLESTONE_I);
                        entries.add(ModBlocks.ZIP_COBBLESTONE_II);
                        entries.add(ModBlocks.ZIP_COBBLESTONE_III);
                        entries.add(ModBlocks.ZIP_COBBLESTONE_IV);
                        entries.add(ModBlocks.ZIP_COBBLESTONE_V);
                        entries.add(ModBlocks.ZIP_COBBLESTONE_VI);
                        entries.add(ModBlocks.ZIP_COBBLESTONE_VII);
                        entries.add(ModBlocks.ZIP_COBBLESTONE_VIII);
                        entries.add(ModBlocks.ZIP_COBBLESTONE_VIIII);
                    }).build());
    public static void registerModItemGroup(){

    }
}
