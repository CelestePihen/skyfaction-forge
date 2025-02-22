package fr.cel.skyfaction.datagen;

import fr.cel.skyfaction.SkyFaction;
import fr.cel.skyfaction.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {

    public ModItemTagGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, SkyFaction.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR).add(
                ModItems.NITRITE_HELMET.get(), ModItems.NITRITE_CHESTPLATE.get(), ModItems.NITRITE_LEGGINGS.get(), ModItems.NITRITE_BOOTS.get(),
                ModItems.ARTRITE_HELMET.get(), ModItems.ARTRITE_CHESTPLATE.get(), ModItems.ARTRITE_LEGGINGS.get(), ModItems.ARTRITE_BOOTS.get(),
                ModItems.TERRALIUM_HELMET.get(), ModItems.TERRALIUM_HELMET.get(), ModItems.TERRALIUM_LEGGINGS.get(), ModItems.TERRALIUM_BOOTS.get(),
                ModItems.HORIUM_HELMET.get(), ModItems.HORIUM_CHESTPLATE.get(), ModItems.HORIUM_LEGGINGS.get(), ModItems.HORIUM_BOOTS.get(),
                ModItems.KOZALIUM_HELMET.get(), ModItems.KOZALIUM_CHESTPLATE.get(), ModItems.KOZALIUM_LEGGINGS.get(), ModItems.KOZALIUM_BOOTS.get());

        this.tag(ItemTags.BEACON_PAYMENT_ITEMS).add(
                ModItems.NITRITE_INGOT.get(),
                ModItems.ARTRITE_INGOT.get(),
                ModItems.TERRALIUM_INGOT.get(),
                ModItems.HORIUM_INGOT.get(),
                ModItems.KOZALIUM_INGOT.get());
    }

}
