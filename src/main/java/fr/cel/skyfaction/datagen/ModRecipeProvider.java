package fr.cel.skyfaction.datagen;

import fr.cel.skyfaction.SkyFactionMod;
import fr.cel.skyfaction.block.ModBlocks;
import fr.cel.skyfaction.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    private static final List<ItemLike> NITRITE_SMELTABLES = List.of(ModItems.NITRITE_FRAGMENT.get(), ModBlocks.NITRITE_ORE.get(), ModBlocks.DEEPSLATE_NITRITE_ORE.get());
    private static final List<ItemLike> ARTRITE_SMELTABLES = List.of(ModItems.ARTRITE_FRAGMENT.get(), ModBlocks.ARTRITE_ORE.get(), ModBlocks.DEEPSLATE_ARTRITE_ORE.get());
    private static final List<ItemLike> TERRALIUM_SMELTABLES = List.of(ModItems.TERRALIUM_FRAGMENT.get(), ModBlocks.TERRALIUM_ORE.get(), ModBlocks.DEEPSLATE_TERRALIUM_ORE.get());
    private static final List<ItemLike> HORIUM_SMELTABLES = List.of(ModItems.HORIUM_FRAGMENT.get(), ModBlocks.HORIUM_ORE.get(), ModBlocks.DEEPSLATE_HORIUM_ORE.get());
    private static final List<ItemLike> KOZALIUM_SMELTABLES = List.of(ModItems.KOZALIUM_FRAGMENT.get(), ModBlocks.KOZALIUM_ORE.get(), ModBlocks.DEEPSLATE_KOZALIUM_ORE.get());

    private final List<RegistryObject<Item>> NITRITE_ARMOR = List.of(ModItems.NITRITE_HELMET, ModItems.NITRITE_CHESTPLATE, ModItems.NITRITE_LEGGINGS, ModItems.NITRITE_BOOTS);
    private final List<RegistryObject<Item>> ARTRITE_ARMOR = List.of(ModItems.ARTRITE_HELMET, ModItems.ARTRITE_CHESTPLATE, ModItems.ARTRITE_LEGGINGS, ModItems.ARTRITE_BOOTS);
    private final List<RegistryObject<Item>> TERRALIUM_ARMOR = List.of(ModItems.TERRALIUM_HELMET, ModItems.TERRALIUM_CHESTPLATE, ModItems.TERRALIUM_LEGGINGS, ModItems.TERRALIUM_BOOTS);
    private final List<RegistryObject<Item>> HORIUM_ARMOR = List.of(ModItems.HORIUM_HELMET, ModItems.HORIUM_CHESTPLATE, ModItems.HORIUM_LEGGINGS, ModItems.HORIUM_BOOTS);
    private final List<RegistryObject<Item>> KOZALIUM_ARMOR = List.of(ModItems.KOZALIUM_HELMET, ModItems.KOZALIUM_CHESTPLATE, ModItems.KOZALIUM_LEGGINGS, ModItems.KOZALIUM_BOOTS);

    private final List<RegistryObject<Item>> NITRITE_TOOLS = List.of(ModItems.NITRITE_SWORD, ModItems.NITRITE_PICKAXE, ModItems.NITRITE_AXE, ModItems.NITRITE_SHOVEL, ModItems.NITRITE_HOE);
    private final List<RegistryObject<Item>> ARTRITE_TOOLS = List.of(ModItems.ARTRITE_SWORD, ModItems.ARTRITE_PICKAXE, ModItems.ARTRITE_AXE, ModItems.ARTRITE_SHOVEL, ModItems.ARTRITE_HOE);
    private final List<RegistryObject<Item>> TERRALIUM_TOOLS = List.of(ModItems.TERRALIUM_SWORD, ModItems.TERRALIUM_PICKAXE, ModItems.TERRALIUM_AXE, ModItems.TERRALIUM_SHOVEL, ModItems.TERRALIUM_HOE);
    private final List<RegistryObject<Item>> HORIUM_TOOLS = List.of(ModItems.HORIUM_SWORD, ModItems.HORIUM_PICKAXE, ModItems.HORIUM_AXE, ModItems.HORIUM_SHOVEL, ModItems.HORIUM_HOE);
    private final List<RegistryObject<Item>> KOZALIUM_TOOLS = List.of(ModItems.KOZALIUM_SWORD, ModItems.KOZALIUM_PICKAXE, ModItems.KOZALIUM_AXE, ModItems.KOZALIUM_SHOVEL, ModItems.KOZALIUM_HOE);

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        // Ingot to Block
        allToSomething(ModItems.NITRITE_INGOT.get(), ModBlocks.NITRITE_BLOCK.get(), pWriter);
        allToSomething(ModItems.ARTRITE_INGOT.get(), ModBlocks.ARTRITE_BLOCK.get(), pWriter);
        allToSomething(ModItems.TERRALIUM_INGOT.get(), ModBlocks.TERRALIUM_BLOCK.get(), pWriter);
        allToSomething(ModItems.HORIUM_INGOT.get(), ModBlocks.HORIUM_BLOCK.get(), pWriter);
        allToSomething(ModItems.KOZALIUM_INGOT.get(), ModBlocks.KOZALIUM_BLOCK.get(), pWriter);

        // Block to Ingot
        blockToItem(ModBlocks.NITRITE_BLOCK, ModItems.NITRITE_INGOT, pWriter);
        blockToItem(ModBlocks.ARTRITE_BLOCK, ModItems.ARTRITE_INGOT, pWriter);
        blockToItem(ModBlocks.TERRALIUM_BLOCK, ModItems.TERRALIUM_INGOT, pWriter);
        blockToItem(ModBlocks.HORIUM_BLOCK, ModItems.HORIUM_INGOT, pWriter);
        blockToItem(ModBlocks.KOZALIUM_BLOCK, ModItems.KOZALIUM_INGOT, pWriter);

        // Burn Ores
        oreSmelting(pWriter, NITRITE_SMELTABLES, RecipeCategory.MISC, ModItems.NITRITE_INGOT.get(), 0.25f, 200, "nitrite");
        oreBlasting(pWriter, NITRITE_SMELTABLES, RecipeCategory.MISC, ModItems.NITRITE_INGOT.get(), 0.25f, 100, "nitrite");

        oreSmelting(pWriter, ARTRITE_SMELTABLES, RecipeCategory.MISC, ModItems.ARTRITE_INGOT.get(), 0.25f, 200, "artrite");
        oreBlasting(pWriter, ARTRITE_SMELTABLES, RecipeCategory.MISC, ModItems.ARTRITE_INGOT.get(), 0.25f, 100, "artrite");

        oreSmelting(pWriter, TERRALIUM_SMELTABLES, RecipeCategory.MISC, ModItems.TERRALIUM_INGOT.get(), 0.25f, 200, "terralium");
        oreBlasting(pWriter, TERRALIUM_SMELTABLES, RecipeCategory.MISC, ModItems.TERRALIUM_INGOT.get(), 0.25f, 100, "terralium");

        oreSmelting(pWriter, HORIUM_SMELTABLES, RecipeCategory.MISC, ModItems.HORIUM_INGOT.get(), 0.25f, 200, "horium");
        oreBlasting(pWriter, HORIUM_SMELTABLES, RecipeCategory.MISC, ModItems.HORIUM_INGOT.get(), 0.25f, 100, "horium");

        oreSmelting(pWriter, KOZALIUM_SMELTABLES, RecipeCategory.MISC, ModItems.KOZALIUM_INGOT.get(), 0.25f, 200, "kozalium");
        oreBlasting(pWriter, KOZALIUM_SMELTABLES, RecipeCategory.MISC, ModItems.KOZALIUM_INGOT.get(), 0.25f, 100, "kozalium");

        // Color Blocks
        colorBlock(Items.WHITE_DYE, ModBlocks.WHITE_COLORBLOCK, pWriter);
        colorBlock(Items.ORANGE_DYE, ModBlocks.ORANGE_COLORBLOCK, pWriter);
        colorBlock(Items.MAGENTA_DYE, ModBlocks.MAGENTA_COLORBLOCK, pWriter);
        colorBlock(Items.LIGHT_BLUE_DYE, ModBlocks.LIGHT_BLUE_COLORBLOCK, pWriter);
        colorBlock(Items.YELLOW_DYE, ModBlocks.YELLOW_COLORBLOCK, pWriter);
        colorBlock(Items.LIME_DYE, ModBlocks.LIME_COLORBLOCK, pWriter);
        colorBlock(Items.PINK_DYE, ModBlocks.PINK_COLORBLOCK, pWriter);
        colorBlock(Items.GRAY_DYE, ModBlocks.GRAY_COLORBLOCK, pWriter);
        colorBlock(Items.LIGHT_GRAY_DYE, ModBlocks.LIGHT_GRAY_COLORBLOCK, pWriter);
        colorBlock(Items.CYAN_DYE, ModBlocks.CYAN_COLORBLOCK, pWriter);
        colorBlock(Items.PURPLE_DYE, ModBlocks.PURPLE_COLORBLOCK, pWriter);
        colorBlock(Items.BLUE_DYE, ModBlocks.BLUE_COLORBLOCK, pWriter);
        colorBlock(Items.BROWN_DYE, ModBlocks.BROWN_COLORBLOCK, pWriter);
        colorBlock(Items.GREEN_DYE, ModBlocks.GREEN_COLORBLOCK, pWriter);
        colorBlock(Items.RED_DYE, ModBlocks.RED_COLORBLOCK, pWriter);
        colorBlock(Items.BLACK_DYE, ModBlocks.BLACK_COLORBLOCK, pWriter);

        // Cave Block
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModBlocks.CAVE_BLOCK.get())
                .pattern("GXG")
                .pattern("XEX")
                .pattern("GXG")
                .define('G', Blocks.GLASS)
                .define('X', ModItems.XRAY_FRAGMENT.get())
                .define('E', ModItems.DETECTOR_EYE.get())
                .unlockedBy(getHasName(ModItems.XRAY_FRAGMENT.get()), has(ModItems.XRAY_FRAGMENT.get()))
                .save(pWriter);

        // Obsidian Stairs / Door / Slab / Trapdoor
        stairBuilder(ModBlocks.OBSIDIAN_STAIRS.get(), Ingredient.of(Blocks.OBSIDIAN)).unlockedBy(getHasName(Blocks.OBSIDIAN), has(Blocks.OBSIDIAN)).save(pWriter);
        doorBuilder(ModBlocks.OBSIDIAN_DOOR.get(), Ingredient.of(Blocks.OBSIDIAN)).unlockedBy(getHasName(Blocks.OBSIDIAN), has(Blocks.OBSIDIAN)).save(pWriter);
        slab(pWriter, RecipeCategory.MISC, ModBlocks.OBSIDIAN_SLAB.get(), Blocks.OBSIDIAN);
        trapdoorBuilder(ModBlocks.OBSIDIAN_TRAPDOOR.get(), Ingredient.of(Blocks.OBSIDIAN)).unlockedBy(getHasName(Blocks.OBSIDIAN), has(Blocks.OBSIDIAN)).save(pWriter);

        // Orbs
        orb(ModItems.NITRITE_FRAGMENT, ModItems.NITRITE_INGOT, ModBlocks.NITRITE_BLOCK, ModItems.NITRITE_ORB, pWriter);
        orb(ModItems.ARTRITE_FRAGMENT, ModItems.ARTRITE_INGOT, ModBlocks.ARTRITE_BLOCK, ModItems.ARTRITE_ORB, pWriter);
        orb(ModItems.TERRALIUM_FRAGMENT, ModItems.TERRALIUM_INGOT, ModBlocks.TERRALIUM_BLOCK, ModItems.TERRALIUM_ORB, pWriter);
        orb(ModItems.HORIUM_FRAGMENT, ModItems.HORIUM_INGOT, ModBlocks.HORIUM_BLOCK, ModItems.HORIUM_ORB, pWriter);
        orb(ModItems.KOZALIUM_FRAGMENT, ModItems.KOZALIUM_INGOT, ModBlocks.KOZALIUM_BLOCK, ModItems.KOZALIUM_ORB, pWriter);

        // Armor
        armor(ModItems.NITRITE_INGOT, ModItems.NITRITE_ORB, NITRITE_ARMOR, pWriter);
        armor(ModItems.ARTRITE_INGOT, ModItems.ARTRITE_ORB, ARTRITE_ARMOR, pWriter);
        armor(ModItems.TERRALIUM_INGOT, ModItems.TERRALIUM_ORB, TERRALIUM_ARMOR, pWriter);
        armor(ModItems.HORIUM_INGOT, ModItems.HORIUM_ORB, HORIUM_ARMOR, pWriter);
        armor(ModItems.KOZALIUM_INGOT, ModItems.KOZALIUM_ORB, KOZALIUM_ARMOR, pWriter);

        // Stuff
        stuff(ModItems.NITRITE_INGOT, ModItems.NITRITE_ORB, NITRITE_TOOLS, pWriter);
        stuff(ModItems.ARTRITE_INGOT, ModItems.ARTRITE_ORB, ARTRITE_TOOLS, pWriter);
        stuff(ModItems.TERRALIUM_INGOT, ModItems.TERRALIUM_ORB, TERRALIUM_TOOLS, pWriter);
        stuff(ModItems.HORIUM_INGOT, ModItems.HORIUM_ORB, HORIUM_TOOLS, pWriter);
        stuff(ModItems.KOZALIUM_INGOT, ModItems.KOZALIUM_ORB, KOZALIUM_TOOLS, pWriter);

        // Fake Water Bucket
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.FAKE_WATER_BUCKET.get())
                .pattern(" L ")
                .pattern("CSC")
                .pattern(" W ")
                .define('L', Items.LAVA_BUCKET)
                .define('C', Blocks.CACTUS)
                .define('S', ModItems.KOZALIUM_STICK.get())
                .define('W', Items.WATER_BUCKET)
                .unlockedBy(getHasName(ModItems.KOZALIUM_STICK.get()), has(ModItems.KOZALIUM_STICK.get()))
                .save(pWriter);

        // Compressed TNT
        allToSomething(Items.TNT, ModBlocks.COMPRESSED_TNT.get(), pWriter);

        // Renforced Cobblestone
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RENFORCED_COBBLESTONE.get())
                .pattern("CCC")
                .pattern("COC")
                .pattern("CCC")
                .define('C', Blocks.COBBLESTONE)
                .define('O', Blocks.OBSIDIAN)
                .unlockedBy(getHasName(Blocks.OBSIDIAN), has(Blocks.OBSIDIAN))
                .save(pWriter);

        // Mineral Sticks
        mineralStick(ModItems.NITRITE_INGOT, ModItems.NITRITE_STICK, pWriter);
        mineralStick(ModItems.ARTRITE_INGOT, ModItems.ARTRITE_STICK, pWriter);
        mineralStick(ModItems.TERRALIUM_INGOT, ModItems.TERRALIUM_STICK, pWriter);
        mineralStick(ModItems.HORIUM_INGOT, ModItems.HORIUM_STICK, pWriter);
        mineralStick(ModItems.KOZALIUM_INGOT, ModItems.KOZALIUM_STICK, pWriter);

        // Effect Sticks
        effectStick(Items.FEATHER, ModItems.SPEED_STICK, pWriter);
        effectStick(Items.COOKED_BEEF, ModItems.FOOD_STICK, pWriter);
        effectStick(Items.BLAZE_POWDER, ModItems.STRENGHT_STICK, pWriter);
        effectStick(Items.NETHER_STAR, ModItems.HEAL_STICK, pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DETECTOR_EYE.get())
                .pattern("PHP")
                .pattern("AEK")
                .pattern("PTP")
                .define('P', Items.ENDER_PEARL)
                .define('H', ModItems.HORIUM_FRAGMENT.get())
                .define('A', ModItems.ARTRITE_FRAGMENT.get())
                .define('E', Items.ENDER_EYE)
                .define('K', ModItems.KOZALIUM_FRAGMENT.get())
                .define('T', ModItems.TERRALIUM_FRAGMENT.get())
                .unlockedBy(getHasName(ModItems.ARTRITE_FRAGMENT.get()), has(ModItems.ARTRITE_FRAGMENT.get()))
                .save(pWriter);
    }

    private void orb(RegistryObject<Item> fragment, RegistryObject<Item> ingot, RegistryObject<Block> block, RegistryObject<Item> orb, Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, orb.get())
                .pattern("FIF")
                .pattern("IBI")
                .pattern("FIF")
                .define('F', fragment.get())
                .define('I', ingot.get())
                .define('B', block.get())
                .unlockedBy(getHasName(ingot.get()), has(ingot.get()))
                .save(pWriter);
    }

    private void effectStick(ItemLike item, RegistryObject<Item> stick, Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, stick.get())
                .pattern("  I")
                .pattern(" S ")
                .pattern("O  ")
                .define('I', item)
                .define('S', ModItems.KOZALIUM_STICK.get())
                .define('O', ModItems.TERRALIUM_ORB.get())
                .unlockedBy(getHasName(ModItems.KOZALIUM_STICK.get()), has(ModItems.KOZALIUM_STICK.get()))
                .save(pWriter);
    }

    private void mineralStick(RegistryObject<Item> mineral, RegistryObject<Item> stick, Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, stick.get(), 2)
                .pattern("M")
                .pattern("M")
                .define('M', mineral.get())
                .unlockedBy(getHasName(mineral.get()), has(mineral.get()))
                .save(pWriter);
    }

    private void stuff(RegistryObject<Item> mineral, RegistryObject<Item> orb, List<RegistryObject<Item>> tools, Consumer<FinishedRecipe> pWriter) {
        sword(mineral, orb, tools.get(0), pWriter);
        pickaxe(mineral, orb, tools.get(1), pWriter);
        axe(mineral, orb, tools.get(2), pWriter);
        shovel(orb, tools.get(3), pWriter);
        hoe(mineral, orb, tools.get(4), pWriter);
    }

    private void sword(RegistryObject<Item> mineral, RegistryObject<Item> orb, RegistryObject<Item> sword, Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, sword.get())
                .pattern("M")
                .pattern("O")
                .pattern("S")
                .define('M', mineral.get())
                .define('O', orb.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(mineral.get()), has(mineral.get()))
                .save(pWriter);
    }

    private void pickaxe(RegistryObject<Item> item, RegistryObject<Item> orb, RegistryObject<Item> pickaxe, Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pickaxe.get())
                .pattern("MOM")
                .pattern(" S ")
                .pattern(" S ")
                .define('M', item.get())
                .define('O', orb.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(item.get()), has(item.get()))
                .save(pWriter);
    }

    private void axe(RegistryObject<Item> item, RegistryObject<Item> orb, RegistryObject<Item> axe, Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, axe.get())
                .pattern("MO")
                .pattern("MS")
                .pattern(" S")
                .define('M', item.get())
                .define('O', orb.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(item.get()), has(item.get()))
                .save(pWriter);
    }

    private void shovel(RegistryObject<Item> item, RegistryObject<Item> shovel, Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, shovel.get())
                .pattern("M")
                .pattern("S")
                .pattern("S")
                .define('M', item.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(item.get()), has(item.get()))
                .save(pWriter);
    }

    private void hoe(RegistryObject<Item> item, RegistryObject<Item> orb, RegistryObject<Item> hoe, Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, hoe.get())
                .pattern("MO")
                .pattern(" S")
                .pattern(" S")
                .define('M', item.get())
                .define('O', orb.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(item.get()), has(item.get()))
                .save(pWriter);
    }

    private void armor(RegistryObject<Item> mineral, RegistryObject<Item> orb, List<RegistryObject<Item>> armors, Consumer<FinishedRecipe> pWriter) {
        helmet(mineral, orb, armors.get(0), pWriter);
        chestplate(mineral, orb, armors.get(1), pWriter);
        leggings(mineral, orb, armors.get(2), pWriter);
        boots(mineral, orb, armors.get(3), pWriter);
    }

    private void helmet(RegistryObject<Item> mineral, RegistryObject<Item> orb, RegistryObject<Item> armor, Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, armor.get())
                .pattern("IOI")
                .pattern("I I")
                .define('I', mineral.get())
                .define('O', orb.get())
                .unlockedBy(getHasName(mineral.get()), has(mineral.get()))
                .save(pWriter);
    }

    private void chestplate(RegistryObject<Item> mineral, RegistryObject<Item> orb, RegistryObject<Item> armor, Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, armor.get())
                .pattern("I I")
                .pattern("IOI")
                .pattern("III")
                .define('I', mineral.get())
                .define('O', orb.get())
                .unlockedBy(getHasName(mineral.get()), has(mineral.get()))
                .save(pWriter);
    }

    private void leggings(RegistryObject<Item> mineral, RegistryObject<Item> orb, RegistryObject<Item> armor, Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, armor.get())
                .pattern("IOI")
                .pattern("I I")
                .pattern("I I")
                .define('I', mineral.get())
                .define('O', orb.get())
                .unlockedBy(getHasName(mineral.get()), has(mineral.get()))
                .save(pWriter);
    }

    private void boots(RegistryObject<Item> mineral, RegistryObject<Item> orb, RegistryObject<Item> armor, Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, armor.get())
                .pattern("I I")
                .pattern("IOI")
                .define('I', mineral.get())
                .define('O', orb.get())
                .unlockedBy(getHasName(mineral.get()), has(mineral.get()))
                .save(pWriter);
    }

    private void colorBlock(ItemLike item, RegistryObject<Block> block, Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, block.get())
                .pattern("DDD")
                .pattern("DGD")
                .pattern("DDD")
                .define('D', item)
                .define('G', Items.GLOWSTONE)
                .unlockedBy(getHasName(item), has(item))
                .save(pWriter);
    }

    private void allToSomething(ItemLike item, ItemLike itemLike, Consumer<FinishedRecipe> pWriter) {
        allToSomething(item, itemLike, pWriter, RecipeCategory.MISC);
    }

    private void allToSomething(ItemLike item, ItemLike itemLike, Consumer<FinishedRecipe> pWriter, RecipeCategory recipeCategory) {
        ShapedRecipeBuilder.shaped(recipeCategory, itemLike)
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .define('I', item)
                .unlockedBy(getHasName(item), has(item))
                .save(pWriter);
    }

    private void blockToItem(RegistryObject<Block> block, RegistryObject<Item> item, Consumer<FinishedRecipe> pWriter) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, item.get(), 9)
                .requires(block.get())
                .unlockedBy(getHasName(block.get()), has(block.get()))
                .save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike),
                    has(itemlike)).save(pFinishedRecipeConsumer, SkyFactionMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }

}