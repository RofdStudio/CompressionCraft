package cn.rofdstudio.zipmc.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    COMPRESSED_TOOL_MATERIALS( 4, 2999, 12.0F, 4.0F, 20,
            ()-> Ingredient.ofItems(ModItems.COMPRESSED_TOOL_MATERIALS)),
    DOUBLE_COMPRESSED_TOOL_MATERIALS( 4, 4999, 15.0F, 8.0F, 30,
            ()-> Ingredient.ofItems(ModItems.DOUBLE_COMPRESSED_TOOL_MATERIALS)),
    TRIPLE_COMPRESSED_TOOL_MATERIALS( 4, 7499, 20.0F, 16.0F, 50,
            ()-> Ingredient.ofItems(ModItems.TRIPLE_COMPRESSED_TOOL_MATERIALS));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}

