package fr.cel.skyfaction.item;

import fr.cel.skyfaction.SkyFaction;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {

    NITRITE("nitrite", 35, new int[]{ 3, 8, 6, 3 }, 12,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, 0.1F, () -> Ingredient.of(ModItems.NITRITE_INGOT.get())),

    ARTRITE("artrite", 40, new int[]{ 3, 8, 7, 3 }, 14,
        SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, 0.1F, () -> Ingredient.of(ModItems.ARTRITE_INGOT.get())),

    TERRALIUM("terralium", 45, new int[]{ 3, 9, 7, 3 }, 16,
        SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, 0.1F, () -> Ingredient.of(ModItems.TERRALIUM_INGOT.get())),

    HORIUM("horium", 50, new int[]{ 4, 9, 8, 3 }, 18,
        SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, 0.1F, () -> Ingredient.of(ModItems.HORIUM_INGOT.get())),

    KOZALIUM("kozalium", 55, new int[]{ 6, 9, 9, 6 }, 20,
        SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, 0.1F, () -> Ingredient.of(ModItems.KOZALIUM_INGOT.get()));

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = { 11, 16, 16, 13 };

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantmentValue, SoundEvent equipSound,
                      float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type pType) {
        return BASE_DURABILITY[pType.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type pType) {
        return this.protectionAmounts[pType.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return SkyFaction.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

}