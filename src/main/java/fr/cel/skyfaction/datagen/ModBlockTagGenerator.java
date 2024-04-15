package fr.cel.skyfaction.datagen;

import fr.cel.skyfaction.SkyFactionMod;
import fr.cel.skyfaction.block.ModBlocks;
import fr.cel.skyfaction.utils.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, SkyFactionMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                ModBlocks.NITRITE_ORE.get(),
                ModBlocks.ARTRITE_ORE.get(),
                ModBlocks.TERRALIUM_ORE.get(),
                ModBlocks.HORIUM_ORE.get(),
                ModBlocks.KOZALIUM_ORE.get(),
                ModBlocks.XRAY_ORE.get(),

                ModBlocks.DEEPSLATE_NITRITE_ORE.get(),
                ModBlocks.DEEPSLATE_ARTRITE_ORE.get(),
                ModBlocks.DEEPSLATE_TERRALIUM_ORE.get(),
                ModBlocks.DEEPSLATE_HORIUM_ORE.get(),
                ModBlocks.DEEPSLATE_KOZALIUM_ORE.get(),
                ModBlocks.DEEPSLATE_XRAY_ORE.get(),

                ModBlocks.OBSIDIAN_DOOR.get(),
                ModBlocks.OBSIDIAN_SLAB.get(),
                ModBlocks.OBSIDIAN_STAIRS.get(),
                ModBlocks.OBSIDIAN_TRAPDOOR.get(),

                ModBlocks.RENFORCED_COBBLESTONE.get()
        );

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(
                ModBlocks.NITRITE_ORE.get(),
                ModBlocks.DEEPSLATE_NITRITE_ORE.get(),

                ModBlocks.XRAY_ORE.get(),
                ModBlocks.DEEPSLATE_XRAY_ORE.get(),

                ModBlocks.OBSIDIAN_DOOR.get(),
                ModBlocks.OBSIDIAN_SLAB.get(),
                ModBlocks.OBSIDIAN_STAIRS.get(),
                ModBlocks.OBSIDIAN_TRAPDOOR.get()
        );

        this.tag(BlockTags.MINEABLE_WITH_HOE).add(
                ModBlocks.XP_BUSH.get()
        );

        this.tag(ModTags.Blocks.NEEDS_NITRITE_TOOL).add(
                ModBlocks.ARTRITE_ORE.get(),
                ModBlocks.DEEPSLATE_ARTRITE_ORE.get()
        );

        this.tag(ModTags.Blocks.NEEDS_ARTRITE_TOOL).add(
                ModBlocks.TERRALIUM_ORE.get(),
                ModBlocks.DEEPSLATE_TERRALIUM_ORE.get()
        );

        this.tag(ModTags.Blocks.NEEDS_TERRALIUM_TOOL).add(
                ModBlocks.HORIUM_ORE.get(),
                ModBlocks.DEEPSLATE_HORIUM_ORE.get()
        );

        this.tag(ModTags.Blocks.NEEDS_HORIUM_TOOL).add(
                ModBlocks.KOZALIUM_ORE.get(),
                ModBlocks.DEEPSLATE_KOZALIUM_ORE.get()
        );

        this.tag(BlockTags.STAIRS).add(ModBlocks.OBSIDIAN_STAIRS.get());
        this.tag(BlockTags.SLABS).add(ModBlocks.OBSIDIAN_SLAB.get());
        this.tag(BlockTags.DOORS).add(ModBlocks.OBSIDIAN_DOOR.get());
        this.tag(BlockTags.TRAPDOORS).add(ModBlocks.OBSIDIAN_TRAPDOOR.get());
    }

}