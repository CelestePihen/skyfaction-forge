package fr.cel.skyfaction.datagen;

import fr.cel.skyfaction.SkyFactionMod;
import fr.cel.skyfaction.block.ModBlocks;
import fr.cel.skyfaction.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {

    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();

    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SkyFactionMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.NITRITE_FRAGMENT);
        simpleItem(ModItems.ARTRITE_FRAGMENT);
        simpleItem(ModItems.TERRALIUM_FRAGMENT);
        simpleItem(ModItems.HORIUM_FRAGMENT);
        simpleItem(ModItems.KOZALIUM_FRAGMENT);
        simpleItem(ModItems.XRAY_FRAGMENT);

        simpleItem(ModItems.NITRITE_INGOT);
        simpleItem(ModItems.ARTRITE_INGOT);
        simpleItem(ModItems.TERRALIUM_INGOT);
        simpleItem(ModItems.HORIUM_INGOT);
        simpleItem(ModItems.KOZALIUM_INGOT);

        simpleBlockItem(ModBlocks.OBSIDIAN_DOOR);
        evenSimplerBlockItem(ModBlocks.OBSIDIAN_SLAB);
        evenSimplerBlockItem(ModBlocks.OBSIDIAN_STAIRS);
        trapdoorItem(ModBlocks.OBSIDIAN_TRAPDOOR);

        // Tools
        handheldItem(ModItems.NITRITE_SWORD);
        handheldItem(ModItems.NITRITE_PICKAXE);
        handheldItem(ModItems.NITRITE_AXE);
        handheldItem(ModItems.NITRITE_SHOVEL);
        handheldItem(ModItems.NITRITE_HOE);

        handheldItem(ModItems.ARTRITE_SWORD);
        handheldItem(ModItems.ARTRITE_PICKAXE);
        handheldItem(ModItems.ARTRITE_AXE);
        handheldItem(ModItems.ARTRITE_SHOVEL);
        handheldItem(ModItems.ARTRITE_HOE);

        handheldItem(ModItems.TERRALIUM_SWORD);
        handheldItem(ModItems.TERRALIUM_PICKAXE);
        handheldItem(ModItems.TERRALIUM_AXE);
        handheldItem(ModItems.TERRALIUM_SHOVEL);
        handheldItem(ModItems.TERRALIUM_HOE);

        handheldItem(ModItems.HORIUM_SWORD);
        handheldItem(ModItems.HORIUM_PICKAXE);
        handheldItem(ModItems.HORIUM_AXE);
        handheldItem(ModItems.HORIUM_SHOVEL);
        handheldItem(ModItems.HORIUM_HOE);

        handheldItem(ModItems.KOZALIUM_SWORD);
        handheldItem(ModItems.KOZALIUM_PICKAXE);
        handheldItem(ModItems.KOZALIUM_AXE);
        handheldItem(ModItems.KOZALIUM_SHOVEL);
        handheldItem(ModItems.KOZALIUM_HOE);

        // Armors
        trimmedArmorItem(ModItems.NITRITE_HELMET);
        trimmedArmorItem(ModItems.NITRITE_CHESTPLATE);
        trimmedArmorItem(ModItems.NITRITE_LEGGINGS);
        trimmedArmorItem(ModItems.NITRITE_BOOTS);

        trimmedArmorItem(ModItems.ARTRITE_HELMET);
        trimmedArmorItem(ModItems.ARTRITE_CHESTPLATE);
        trimmedArmorItem(ModItems.ARTRITE_LEGGINGS);
        trimmedArmorItem(ModItems.ARTRITE_BOOTS);

        trimmedArmorItem(ModItems.TERRALIUM_HELMET);
        trimmedArmorItem(ModItems.TERRALIUM_CHESTPLATE);
        trimmedArmorItem(ModItems.TERRALIUM_LEGGINGS);
        trimmedArmorItem(ModItems.TERRALIUM_BOOTS);

        trimmedArmorItem(ModItems.HORIUM_HELMET);
        trimmedArmorItem(ModItems.HORIUM_CHESTPLATE);
        trimmedArmorItem(ModItems.HORIUM_LEGGINGS);
        trimmedArmorItem(ModItems.HORIUM_BOOTS);

        trimmedArmorItem(ModItems.KOZALIUM_HELMET);
        trimmedArmorItem(ModItems.KOZALIUM_CHESTPLATE);
        trimmedArmorItem(ModItems.KOZALIUM_LEGGINGS);
        trimmedArmorItem(ModItems.KOZALIUM_BOOTS);

        simpleItem(ModItems.HEAL_STICK);
        simpleItem(ModItems.STRENGHT_STICK);
        simpleItem(ModItems.SPEED_STICK);
        simpleItem(ModItems.FOOD_STICK);

        simpleItem(ModItems.NITRITE_STICK);
        simpleItem(ModItems.ARTRITE_STICK);
        simpleItem(ModItems.TERRALIUM_STICK);
        simpleItem(ModItems.HORIUM_STICK);
        simpleItem(ModItems.KOZALIUM_STICK);

        simpleItem(ModItems.NITRITE_ORB);
        simpleItem(ModItems.ARTRITE_ORB);
        simpleItem(ModItems.TERRALIUM_ORB);
        simpleItem(ModItems.HORIUM_ORB);
        simpleItem(ModItems.KOZALIUM_ORB);

        simpleItem(ModItems.FAKE_WATER_BUCKET);
        simpleItem(ModItems.XP_BERRY);
        simpleItem(ModItems.DETECTOR_EYE);
        simpleItem(ModItems.DYNAMITE);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(SkyFactionMod.MOD_ID, "item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(SkyFactionMod.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(SkyFactionMod.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(SkyFactionMod.MOD_ID, "item/" + item.getId().getPath()));
    }

    // Shoutout to El_Redstoniano for making this
    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = SkyFactionMod.MOD_ID; // Change this to your mod id

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = new ResourceLocation(MOD_ID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = new ResourceLocation(MOD_ID, currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                new ResourceLocation(MOD_ID,
                                        "item/" + itemRegistryObject.getId().getPath()));
            });
        }
    }

}
