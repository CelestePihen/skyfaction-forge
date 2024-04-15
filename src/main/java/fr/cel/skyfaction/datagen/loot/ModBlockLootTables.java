package fr.cel.skyfaction.datagen.loot;

import fr.cel.skyfaction.block.ModBlocks;
import fr.cel.skyfaction.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {

    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        // Mineral Blocks
        this.dropSelf(ModBlocks.NITRITE_BLOCK.get());
        this.dropSelf(ModBlocks.ARTRITE_BLOCK.get());
        this.dropSelf(ModBlocks.TERRALIUM_BLOCK.get());
        this.dropSelf(ModBlocks.HORIUM_BLOCK.get());
        this.dropSelf(ModBlocks.KOZALIUM_BLOCK.get());

        // Ores
        this.add(ModBlocks.NITRITE_ORE.get(), block -> createCopperLikeOreDrops(ModBlocks.NITRITE_ORE.get(), ModItems.NITRITE_FRAGMENT.get()));
        this.add(ModBlocks.ARTRITE_ORE.get(), block -> createCopperLikeOreDrops(ModBlocks.ARTRITE_ORE.get(), ModItems.ARTRITE_FRAGMENT.get()));
        this.add(ModBlocks.TERRALIUM_ORE.get(), block -> createCopperLikeOreDrops(ModBlocks.TERRALIUM_ORE.get(), ModItems.TERRALIUM_FRAGMENT.get()));
        this.add(ModBlocks.HORIUM_ORE.get(), block -> createCopperLikeOreDrops(ModBlocks.HORIUM_ORE.get(), ModItems.HORIUM_FRAGMENT.get()));
        this.add(ModBlocks.KOZALIUM_ORE.get(), block -> createCopperLikeOreDrops(ModBlocks.KOZALIUM_ORE.get(), ModItems.KOZALIUM_FRAGMENT.get()));
        this.add(ModBlocks.XRAY_ORE.get(), block -> createCopperLikeOreDrops(ModBlocks.XRAY_ORE.get(), ModItems.XRAY_FRAGMENT.get()));

        this.add(ModBlocks.DEEPSLATE_NITRITE_ORE.get(), block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_NITRITE_ORE.get(), ModItems.NITRITE_FRAGMENT.get()));
        this.add(ModBlocks.DEEPSLATE_ARTRITE_ORE.get(), block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_ARTRITE_ORE.get(), ModItems.ARTRITE_FRAGMENT.get()));
        this.add(ModBlocks.DEEPSLATE_TERRALIUM_ORE.get(), block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_TERRALIUM_ORE.get(), ModItems.TERRALIUM_FRAGMENT.get()));
        this.add(ModBlocks.DEEPSLATE_HORIUM_ORE.get(), block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_HORIUM_ORE.get(), ModItems.HORIUM_FRAGMENT.get()));
        this.add(ModBlocks.DEEPSLATE_KOZALIUM_ORE.get(), block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_KOZALIUM_ORE.get(), ModItems.KOZALIUM_FRAGMENT.get()));
        this.add(ModBlocks.DEEPSLATE_XRAY_ORE.get(), block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_XRAY_ORE.get(), ModItems.XRAY_FRAGMENT.get()));

        // Color Blocks
        this.dropSelf(ModBlocks.WHITE_COLORBLOCK.get());
        this.dropSelf(ModBlocks.ORANGE_COLORBLOCK.get());
        this.dropSelf(ModBlocks.MAGENTA_COLORBLOCK.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORBLOCK.get());
        this.dropSelf(ModBlocks.YELLOW_COLORBLOCK.get());
        this.dropSelf(ModBlocks.LIME_COLORBLOCK.get());
        this.dropSelf(ModBlocks.PINK_COLORBLOCK.get());
        this.dropSelf(ModBlocks.GRAY_COLORBLOCK.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_COLORBLOCK.get());
        this.dropSelf(ModBlocks.CYAN_COLORBLOCK.get());
        this.dropSelf(ModBlocks.PURPLE_COLORBLOCK.get());
        this.dropSelf(ModBlocks.BLUE_COLORBLOCK.get());
        this.dropSelf(ModBlocks.BROWN_COLORBLOCK.get());
        this.dropSelf(ModBlocks.GREEN_COLORBLOCK.get());
        this.dropSelf(ModBlocks.RED_COLORBLOCK.get());
        this.dropSelf(ModBlocks.BLACK_COLORBLOCK.get());

        // Obsidian
        this.dropSelf(ModBlocks.OBSIDIAN_TRAPDOOR.get());
        this.dropSelf(ModBlocks.OBSIDIAN_STAIRS.get());
        this.add(ModBlocks.OBSIDIAN_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.OBSIDIAN_SLAB.get()));
        this.add(ModBlocks.OBSIDIAN_DOOR.get(),
                block -> createDoorTable(ModBlocks.OBSIDIAN_DOOR.get()));

        // Other
        this.dropSelf(ModBlocks.CAVE_BLOCK.get());
        this.dropSelf(ModBlocks.COMPRESSED_TNT.get());
        this.dropSelf(ModBlocks.RENFORCED_COBBLESTONE.get());

        this.dropSelf(ModBlocks.XP_BUSH.get());
    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

}