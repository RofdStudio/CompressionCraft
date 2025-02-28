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
                        entries.add(ModItems.ZIP_GOLD_I);
                        entries.add(ModItems.ZIP_GOLD_II);
                        entries.add(ModItems.ZIP_GOLD_III);
                        entries.add(ModItems.ZIP_DIAMOND_I);
                        entries.add(ModItems.ZIP_DIAMOND_II);
                        entries.add(ModItems.ZIP_DIAMOND_III);
                        entries.add(ModItems.ZIP_EMERALD_I);
                        entries.add(ModItems.ZIP_EMERALD_II);
                        entries.add(ModItems.ZIP_EMERALD_III);
                        entries.add(ModItems.ZIP_NETHERITE_I);
                        entries.add(ModItems.ZIP_NETHERITE_II);
                        entries.add(ModItems.ZIP_NETHERITE_III);
                        entries.add(ModBlocks.ZIP_STONE_I);
                        entries.add(ModBlocks.ZIP_STONE_II);
                        entries.add(ModBlocks.ZIP_STONE_III);
                        entries.add(ModBlocks.ZIP_COBBLESTONE_I);
                        entries.add(ModBlocks.ZIP_COBBLESTONE_II);
                        entries.add(ModBlocks.ZIP_COBBLESTONE_III);
                    }).build());
    public static void registerModItemGroup(){

    }
}
