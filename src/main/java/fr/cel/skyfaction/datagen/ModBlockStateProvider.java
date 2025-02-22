package fr.cel.skyfaction.datagen;

import fr.cel.skyfaction.SkyFaction;
import fr.cel.skyfaction.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, SkyFaction.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // Mineral blocks
        blockWithItem(ModBlocks.NITRITE_BLOCK);
        blockWithItem(ModBlocks.ARTRITE_BLOCK);
        blockWithItem(ModBlocks.TERRALIUM_BLOCK);
        blockWithItem(ModBlocks.HORIUM_BLOCK);
        blockWithItem(ModBlocks.KOZALIUM_BLOCK);

        // Ores
        blockWithItem(ModBlocks.NITRITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_NITRITE_ORE);

        blockWithItem(ModBlocks.ARTRITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_ARTRITE_ORE);

        blockWithItem(ModBlocks.TERRALIUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_TERRALIUM_ORE);

        blockWithItem(ModBlocks.HORIUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_HORIUM_ORE);

        blockWithItem(ModBlocks.KOZALIUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_KOZALIUM_ORE);

        // Color Blocks
        blockWithItem(ModBlocks.WHITE_COLORBLOCK);
        blockWithItem(ModBlocks.ORANGE_COLORBLOCK);
        blockWithItem(ModBlocks.MAGENTA_COLORBLOCK);
        blockWithItem(ModBlocks.LIGHT_BLUE_COLORBLOCK);
        blockWithItem(ModBlocks.YELLOW_COLORBLOCK);
        blockWithItem(ModBlocks.LIME_COLORBLOCK);
        blockWithItem(ModBlocks.PINK_COLORBLOCK);
        blockWithItem(ModBlocks.GRAY_COLORBLOCK);
        blockWithItem(ModBlocks.LIGHT_GRAY_COLORBLOCK);
        blockWithItem(ModBlocks.CYAN_COLORBLOCK);
        blockWithItem(ModBlocks.PURPLE_COLORBLOCK);
        blockWithItem(ModBlocks.BLUE_COLORBLOCK);
        blockWithItem(ModBlocks.BROWN_COLORBLOCK);
        blockWithItem(ModBlocks.GREEN_COLORBLOCK);
        blockWithItem(ModBlocks.RED_COLORBLOCK);
        blockWithItem(ModBlocks.BLACK_COLORBLOCK);

        // Obsidian
        stairsBlock(((StairBlock) ModBlocks.OBSIDIAN_STAIRS.get()), blockTexture(Blocks.OBSIDIAN));
        slabBlock(((SlabBlock) ModBlocks.OBSIDIAN_SLAB.get()), blockTexture(Blocks.OBSIDIAN), blockTexture(Blocks.OBSIDIAN));
        doorBlockWithRenderType(((DoorBlock) ModBlocks.OBSIDIAN_DOOR.get()), modLoc("block/obsidian_door_bottom"), modLoc("block/obsidian_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.OBSIDIAN_TRAPDOOR.get()), modLoc("block/obsidian_trapdoor"), true, "cutout");

        // Other
        blockWithItem(ModBlocks.RENFORCED_COBBLESTONE);

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}