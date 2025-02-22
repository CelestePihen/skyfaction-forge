package fr.cel.skyfaction.entity;

import fr.cel.skyfaction.SkyFaction;
import fr.cel.skyfaction.entity.custom.DynamiteEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SkyFaction.MOD_ID);

    public static final RegistryObject<EntityType<DynamiteEntity>> DYNAMITE = ENTITY_TYPES.register("dynamite", () ->
            EntityType.Builder.<DynamiteEntity>of(DynamiteEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).build("dynamite"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

}
