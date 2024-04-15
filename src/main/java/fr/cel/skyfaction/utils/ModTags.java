package fr.cel.skyfaction.utils;

import fr.cel.skyfaction.SkyFactionMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Blocks {
        public static final TagKey<Block> NEEDS_NITRITE_TOOL = tag("needs_nitrite_tool");
        public static final TagKey<Block> NEEDS_ARTRITE_TOOL = tag("needs_artrite_tool");
        public static final TagKey<Block> NEEDS_TERRALIUM_TOOL = tag("needs_terralium_tool");
        public static final TagKey<Block> NEEDS_HORIUM_TOOL = tag("needs_horium_tool");
        public static final TagKey<Block> NEEDS_KOZALIUM_TOOL = tag("needs_kozalium_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(SkyFactionMod.MOD_ID, name));
        }
    }

    public static class Items {
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(SkyFactionMod.MOD_ID, name));
        }
    }

}
