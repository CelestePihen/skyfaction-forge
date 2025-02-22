package fr.cel.skyfaction;

import com.mojang.logging.LogUtils;
import fr.cel.skyfaction.block.ModBlocks;
import fr.cel.skyfaction.entity.ModEntities;
import fr.cel.skyfaction.fluid.ModFluidTypes;
import fr.cel.skyfaction.fluid.ModFluids;
import fr.cel.skyfaction.item.ModCreativeModeTabs;
import fr.cel.skyfaction.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(SkyFaction.MOD_ID)
public class SkyFaction {

    public static final String MOD_ID = "skyfaction";
    public static final Logger LOGGER = LogUtils.getLogger();

    public SkyFaction() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModEntities.register(modEventBus);

        ModFluidTypes.register(modEventBus);
        ModFluids.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

}