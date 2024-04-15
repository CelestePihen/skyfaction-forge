package fr.cel.skyfaction.item;

import fr.cel.skyfaction.SkyFactionMod;
import fr.cel.skyfaction.utils.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {

    public static final Tier NITRITE = TierSortingRegistry.registerTier(new ForgeTier(4, 2100, 8.0F, 4.0F, 12,
            ModTags.Blocks.NEEDS_NITRITE_TOOL, () -> Ingredient.of(ModItems.NITRITE_INGOT.get())),
            new ResourceLocation(SkyFactionMod.MOD_ID, "nitrite"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier ARTRITE = TierSortingRegistry.registerTier(new ForgeTier(5, 2500, 10.0F, 5.0F, 14,
                    ModTags.Blocks.NEEDS_ARTRITE_TOOL, () -> Ingredient.of(ModItems.ARTRITE_INGOT.get())),
            new ResourceLocation(SkyFactionMod.MOD_ID, "artrite"), List.of(ModToolTiers.NITRITE), List.of());

    public static final Tier TERRALIUM = TierSortingRegistry.registerTier(new ForgeTier(6, 3000, 12.0F, 6.0F, 16,
                    ModTags.Blocks.NEEDS_TERRALIUM_TOOL, () -> Ingredient.of(ModItems.TERRALIUM_INGOT.get())),
            new ResourceLocation(SkyFactionMod.MOD_ID, "terralium"), List.of(ModToolTiers.ARTRITE), List.of());

    public static final Tier HORIUM = TierSortingRegistry.registerTier(new ForgeTier(7, 3500, 14.0F, 7.0F, 18,
                    ModTags.Blocks.NEEDS_HORIUM_TOOL, () -> Ingredient.of(ModItems.HORIUM_INGOT.get())),
            new ResourceLocation(SkyFactionMod.MOD_ID, "horium"), List.of(ModToolTiers.TERRALIUM), List.of());

    public static final Tier KOZALIUM = TierSortingRegistry.registerTier(new ForgeTier(8, 40000, 20.0F, 8.0F, 20,
                    ModTags.Blocks.NEEDS_KOZALIUM_TOOL, () -> Ingredient.of(ModItems.KOZALIUM_INGOT.get())),
            new ResourceLocation(SkyFactionMod.MOD_ID, "kozalium"), List.of(ModToolTiers.HORIUM), List.of());

}
