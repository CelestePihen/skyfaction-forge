package fr.cel.skyfaction.fluid;

import fr.cel.skyfaction.SkyFactionMod;
import fr.cel.skyfaction.block.ModBlocks;
import fr.cel.skyfaction.item.ModItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {

    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, SkyFactionMod.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_FAKE_WATER = FLUIDS.register("fake_water_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.FAKE_WATER_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> FLOWING_FAKE_WATER = FLUIDS.register("flowing_fake_water",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.FAKE_WATER_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties FAKE_WATER_FLUID_PROPERTIES =
            new ForgeFlowingFluid.Properties(ModFluidTypes.FAKE_WATER_FLUID_TYPE, SOURCE_FAKE_WATER, FLOWING_FAKE_WATER)
                    .slopeFindDistance(4).block(ModBlocks.FAKE_WATER).bucket(ModItems.FAKE_WATER_BUCKET);


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }

}
