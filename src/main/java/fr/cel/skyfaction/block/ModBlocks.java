package fr.cel.skyfaction.block;

import fr.cel.skyfaction.SkyFactionMod;
import fr.cel.skyfaction.block.custom.XPBerryBlock;
import fr.cel.skyfaction.fluid.ModFluids;
import fr.cel.skyfaction.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SkyFactionMod.MOD_ID);

    /* BLOCKS */

    // Ore (Normal and Deepstone)
    public static final RegistryObject<Block> NITRITE_ORE = registerBlock("nitrite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> DEEPSLATE_NITRITE_ORE = registerBlock("deepslate_nitrite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));

    public static final RegistryObject<Block> ARTRITE_ORE = registerBlock("artrite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> DEEPSLATE_ARTRITE_ORE = registerBlock("deepslate_artrite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));

    public static final RegistryObject<Block> TERRALIUM_ORE = registerBlock("terralium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> DEEPSLATE_TERRALIUM_ORE = registerBlock("deepslate_terralium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));

    public static final RegistryObject<Block> HORIUM_ORE = registerBlock("horium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> DEEPSLATE_HORIUM_ORE = registerBlock("deepslate_horium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));

    public static final RegistryObject<Block> KOZALIUM_ORE = registerBlock("kozalium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> DEEPSLATE_KOZALIUM_ORE = registerBlock("deepslate_kozalium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));

    public static final RegistryObject<Block> XRAY_ORE = registerBlock("xray_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).noOcclusion()));

    public static final RegistryObject<Block> DEEPSLATE_XRAY_ORE = registerBlock("deepslate_xray_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).noOcclusion()));

    // Mineral Blocks
    public static final RegistryObject<Block> NITRITE_BLOCK = registerBlock("nitrite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> ARTRITE_BLOCK = registerBlock("artrite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> TERRALIUM_BLOCK = registerBlock("terralium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> HORIUM_BLOCK = registerBlock("horium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> KOZALIUM_BLOCK = registerBlock("kozalium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    // Color Block
    public static final RegistryObject<Block> WHITE_COLORBLOCK = registerColorBlock("white");

    public static final RegistryObject<Block> ORANGE_COLORBLOCK = registerColorBlock("orange");

    public static final RegistryObject<Block> MAGENTA_COLORBLOCK = registerColorBlock("magenta");

    public static final RegistryObject<Block> LIGHT_BLUE_COLORBLOCK = registerColorBlock("light_blue");

    public static final RegistryObject<Block> YELLOW_COLORBLOCK = registerColorBlock("yellow");

    public static final RegistryObject<Block> LIME_COLORBLOCK = registerColorBlock("lime");

    public static final RegistryObject<Block> PINK_COLORBLOCK = registerColorBlock("pink");

    public static final RegistryObject<Block> GRAY_COLORBLOCK = registerColorBlock("gray");

    public static final RegistryObject<Block> LIGHT_GRAY_COLORBLOCK = registerColorBlock("light_gray");

    public static final RegistryObject<Block> CYAN_COLORBLOCK = registerColorBlock("cyan");

    public static final RegistryObject<Block> PURPLE_COLORBLOCK = registerColorBlock("purple");

    public static final RegistryObject<Block> BLUE_COLORBLOCK = registerColorBlock("blue");

    public static final RegistryObject<Block> BROWN_COLORBLOCK = registerColorBlock("brown");

    public static final RegistryObject<Block> GREEN_COLORBLOCK = registerColorBlock("green");

    public static final RegistryObject<Block> RED_COLORBLOCK = registerColorBlock("red");

    public static final RegistryObject<Block> BLACK_COLORBLOCK = registerColorBlock("black");

    public static final RegistryObject<Block> CAVE_BLOCK = registerBlock("cave_block",
            () -> new Block(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.HAT).strength(0.3F).sound(SoundType.GLASS).forceSolidOn()));

    public static final RegistryObject<Block> OBSIDIAN_STAIRS = registerBlock("obsidian_stairs",
            () -> new StairBlock(Blocks.OBSIDIAN::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)));

    public static final RegistryObject<Block> OBSIDIAN_SLAB = registerBlock("obsidian_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)));

    public static final RegistryObject<Block> OBSIDIAN_DOOR = registerBlock("obsidian_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).noOcclusion(), BlockSetType.OAK));

    public static final RegistryObject<Block> OBSIDIAN_TRAPDOOR = registerBlock("obsidian_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).noOcclusion(), BlockSetType.OAK));

    public static final RegistryObject<Block> COMPRESSED_TNT = registerBlock("compressed_tnt",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).instabreak().sound(SoundType.GRASS)));

    public static final RegistryObject<Block> RENFORCED_COBBLESTONE = registerBlock("renforced_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of().strength(30.0F)));

    public static final RegistryObject<LiquidBlock> FAKE_WATER = registerBlockWithoutBlockItem("fake_water_fluid",
            () -> new LiquidBlock(ModFluids.SOURCE_FAKE_WATER, BlockBehaviour.Properties.copy(Blocks.WATER).noLootTable()));

    public static final RegistryObject<Block> XP_BUSH = registerBlock("xp_bush", XPBerryBlock::new);


    /* FUNCTIONS */

    /**
     * Permet de créer un bloc
     * @param name Le nom du bloc
     * @param block La classe du bloc (qui extends de la classe Block)
     * @return Retourne la classe du bloc
     */
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    /**
     * Permet de créer un bloc sans item (utile pour les liquides)
     * @param name Le nom du bloc
     * @param block La classe du bloc (qui extends de la classe Block)
     * @return Retourne la classe du bloc
     */
    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    /**
     * Raccourci pour créer les blocs de couleur
     * @param color La couleur du colorblock
     * @return Retourne la classe du bloc
     */
    private static RegistryObject<Block> registerColorBlock(String color) {
        return registerBlock(color + "_colorblock", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    }

    /**
     * Permet de créer l'item du bloc
     * @param name Le nom du bloc
     * @param block Le bloc
     * @return Retourne l'item du bloc
     */
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    /**
     * Permet d'enregistrer tous les blocs de la classe
     * @param eventBus Interface qui permet d'enregistrer les blocs
     */
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}