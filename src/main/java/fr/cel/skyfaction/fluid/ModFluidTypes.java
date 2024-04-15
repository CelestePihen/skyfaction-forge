package fr.cel.skyfaction.fluid;

import fr.cel.skyfaction.SkyFactionMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;

public class ModFluidTypes {

    public static final ResourceLocation FAKE_WATER_STILL = new ResourceLocation("block/water_still");
    public static final ResourceLocation FAKE_WATER_FLOWING = new ResourceLocation("block/water_flow");
    public static final ResourceLocation FAKE_WATER_OVERLAY = new ResourceLocation("block/water_overlay");
    public static final ResourceLocation UNDERWATER_LOCATION = new ResourceLocation("textures/misc/underwater.png");

    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, SkyFactionMod.MOD_ID);

    public static final RegistryObject<FluidType> FAKE_WATER_FLUID_TYPE = register("fake_water_fluid",
            FluidType.Properties.create().fallDistanceModifier(0F).canExtinguish(true).canHydrate(true));

    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(FAKE_WATER_STILL, FAKE_WATER_FLOWING, FAKE_WATER_OVERLAY, UNDERWATER_LOCATION,
                0xFF3F76E4, new Vector3f(0f, 0f, 0f), properties));
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }

}
