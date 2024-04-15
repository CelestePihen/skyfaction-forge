package fr.cel.skyfaction.event;

import fr.cel.skyfaction.SkyFactionMod;
import fr.cel.skyfaction.fluid.ModFluidTypes;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SkyFactionMod.MOD_ID)
public class ServerEvents {

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        Player player = event.player;
        if (event.side == LogicalSide.SERVER) {
            if (player.isInFluidType(ModFluidTypes.FAKE_WATER_FLUID_TYPE.get())) {
                player.hurt(player.damageSources().generic(), 1.0f);
            }
        }
    }

}
