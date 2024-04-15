package fr.cel.skyfaction.item;

import fr.cel.skyfaction.SkyFactionMod;
import fr.cel.skyfaction.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SkyFactionMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SKYFACTION = CREATIVE_MODE_TABS.register(
            "skyfaction",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.NITRITE_BLOCK.get()))
                    .title(Component.translatable("itemGroup.skyfaction"))
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.NITRITE_ORE.get());
                        pOutput.accept(ModBlocks.ARTRITE_ORE.get());
                        pOutput.accept(ModBlocks.TERRALIUM_ORE.get());
                        pOutput.accept(ModBlocks.HORIUM_ORE.get());
                        pOutput.accept(ModBlocks.KOZALIUM_ORE.get());
                        pOutput.accept(ModBlocks.XRAY_ORE.get());

                        pOutput.accept(ModBlocks.DEEPSLATE_NITRITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_ARTRITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_TERRALIUM_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_HORIUM_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_KOZALIUM_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_XRAY_ORE.get());

                        pOutput.accept(ModBlocks.NITRITE_BLOCK.get());
                        pOutput.accept(ModBlocks.ARTRITE_BLOCK.get());
                        pOutput.accept(ModBlocks.TERRALIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.HORIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.KOZALIUM_BLOCK.get());

                        pOutput.accept(ModItems.NITRITE_FRAGMENT.get());
                        pOutput.accept(ModItems.ARTRITE_FRAGMENT.get());
                        pOutput.accept(ModItems.TERRALIUM_FRAGMENT.get());
                        pOutput.accept(ModItems.HORIUM_FRAGMENT.get());
                        pOutput.accept(ModItems.KOZALIUM_FRAGMENT.get());
                        pOutput.accept(ModItems.XRAY_FRAGMENT.get());

                        pOutput.accept(ModItems.NITRITE_INGOT.get());
                        pOutput.accept(ModItems.ARTRITE_INGOT.get());
                        pOutput.accept(ModItems.TERRALIUM_INGOT.get());
                        pOutput.accept(ModItems.HORIUM_INGOT.get());
                        pOutput.accept(ModItems.KOZALIUM_INGOT.get());

                        // Colorblock
                        pOutput.accept(ModBlocks.WHITE_COLORBLOCK.get());
                        pOutput.accept(ModBlocks.ORANGE_COLORBLOCK.get());
                        pOutput.accept(ModBlocks.MAGENTA_COLORBLOCK.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_COLORBLOCK.get());
                        pOutput.accept(ModBlocks.YELLOW_COLORBLOCK.get());
                        pOutput.accept(ModBlocks.LIME_COLORBLOCK.get());
                        pOutput.accept(ModBlocks.PINK_COLORBLOCK.get());
                        pOutput.accept(ModBlocks.GRAY_COLORBLOCK.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_COLORBLOCK.get());
                        pOutput.accept(ModBlocks.CYAN_COLORBLOCK.get());
                        pOutput.accept(ModBlocks.PURPLE_COLORBLOCK.get());
                        pOutput.accept(ModBlocks.BLUE_COLORBLOCK.get());
                        pOutput.accept(ModBlocks.BROWN_COLORBLOCK.get());
                        pOutput.accept(ModBlocks.GREEN_COLORBLOCK.get());
                        pOutput.accept(ModBlocks.RED_COLORBLOCK.get());
                        pOutput.accept(ModBlocks.BLACK_COLORBLOCK.get());

                        pOutput.accept(ModBlocks.CAVE_BLOCK.get());

                        // Obsidian
                        pOutput.accept(ModBlocks.OBSIDIAN_DOOR.get());
                        pOutput.accept(ModBlocks.OBSIDIAN_SLAB.get());
                        pOutput.accept(ModBlocks.OBSIDIAN_STAIRS.get());
                        pOutput.accept(ModBlocks.OBSIDIAN_TRAPDOOR.get());

                        pOutput.accept(ModBlocks.COMPRESSED_TNT.get());
                        pOutput.accept(ModBlocks.RENFORCED_COBBLESTONE.get());

                        // Tools
                        pOutput.accept(ModItems.NITRITE_SWORD.get());
                        pOutput.accept(ModItems.NITRITE_PICKAXE.get());
                        pOutput.accept(ModItems.NITRITE_AXE.get());
                        pOutput.accept(ModItems.NITRITE_SHOVEL.get());
                        pOutput.accept(ModItems.NITRITE_HOE.get());

                        pOutput.accept(ModItems.ARTRITE_SWORD.get());
                        pOutput.accept(ModItems.ARTRITE_PICKAXE.get());
                        pOutput.accept(ModItems.ARTRITE_AXE.get());
                        pOutput.accept(ModItems.ARTRITE_SHOVEL.get());
                        pOutput.accept(ModItems.ARTRITE_HOE.get());

                        pOutput.accept(ModItems.TERRALIUM_SWORD.get());
                        pOutput.accept(ModItems.TERRALIUM_PICKAXE.get());
                        pOutput.accept(ModItems.TERRALIUM_AXE.get());
                        pOutput.accept(ModItems.TERRALIUM_SHOVEL.get());
                        pOutput.accept(ModItems.TERRALIUM_HOE.get());

                        pOutput.accept(ModItems.HORIUM_SWORD.get());
                        pOutput.accept(ModItems.HORIUM_PICKAXE.get());
                        pOutput.accept(ModItems.HORIUM_AXE.get());
                        pOutput.accept(ModItems.HORIUM_SHOVEL.get());
                        pOutput.accept(ModItems.HORIUM_HOE.get());

                        pOutput.accept(ModItems.KOZALIUM_SWORD.get());
                        pOutput.accept(ModItems.KOZALIUM_PICKAXE.get());
                        pOutput.accept(ModItems.KOZALIUM_AXE.get());
                        pOutput.accept(ModItems.KOZALIUM_SHOVEL.get());
                        pOutput.accept(ModItems.KOZALIUM_HOE.get());

                        // Armors
                        pOutput.accept(ModItems.NITRITE_HELMET.get());
                        pOutput.accept(ModItems.NITRITE_CHESTPLATE.get());
                        pOutput.accept(ModItems.NITRITE_LEGGINGS.get());
                        pOutput.accept(ModItems.NITRITE_BOOTS.get());

                        pOutput.accept(ModItems.ARTRITE_HELMET.get());
                        pOutput.accept(ModItems.ARTRITE_CHESTPLATE.get());
                        pOutput.accept(ModItems.ARTRITE_LEGGINGS.get());
                        pOutput.accept(ModItems.ARTRITE_BOOTS.get());

                        pOutput.accept(ModItems.TERRALIUM_HELMET.get());
                        pOutput.accept(ModItems.TERRALIUM_CHESTPLATE.get());
                        pOutput.accept(ModItems.TERRALIUM_LEGGINGS.get());
                        pOutput.accept(ModItems.TERRALIUM_BOOTS.get());

                        pOutput.accept(ModItems.HORIUM_HELMET.get());
                        pOutput.accept(ModItems.HORIUM_CHESTPLATE.get());
                        pOutput.accept(ModItems.HORIUM_LEGGINGS.get());
                        pOutput.accept(ModItems.HORIUM_BOOTS.get());

                        pOutput.accept(ModItems.KOZALIUM_HELMET.get());
                        pOutput.accept(ModItems.KOZALIUM_CHESTPLATE.get());
                        pOutput.accept(ModItems.KOZALIUM_LEGGINGS.get());
                        pOutput.accept(ModItems.KOZALIUM_BOOTS.get());

                        // Sticks
                        pOutput.accept(ModItems.HEAL_STICK.get());
                        pOutput.accept(ModItems.STRENGHT_STICK.get());
                        pOutput.accept(ModItems.SPEED_STICK.get());
                        pOutput.accept(ModItems.FOOD_STICK.get());

                        // Mineral sticks
                        pOutput.accept(ModItems.NITRITE_STICK.get());
                        pOutput.accept(ModItems.ARTRITE_STICK.get());
                        pOutput.accept(ModItems.TERRALIUM_STICK.get());
                        pOutput.accept(ModItems.HORIUM_STICK.get());
                        pOutput.accept(ModItems.KOZALIUM_STICK.get());

                        // Orbs
                        pOutput.accept(ModItems.NITRITE_ORB.get());
                        pOutput.accept(ModItems.ARTRITE_ORB.get());
                        pOutput.accept(ModItems.TERRALIUM_ORB.get());
                        pOutput.accept(ModItems.HORIUM_ORB.get());
                        pOutput.accept(ModItems.KOZALIUM_ORB.get());

                        pOutput.accept(ModItems.FAKE_WATER_BUCKET.get());

                        // XP
                        pOutput.accept(ModBlocks.XP_BUSH.get());
                        pOutput.accept(ModItems.XP_BERRY.get());

                        pOutput.accept(ModItems.DETECTOR_EYE.get());

                        pOutput.accept(ModItems.DYNAMITE.get());
                    }))
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
