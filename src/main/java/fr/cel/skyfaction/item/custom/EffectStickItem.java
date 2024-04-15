package fr.cel.skyfaction.item.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class EffectStickItem extends Item {

    private final MobEffect effect;
    private final int durationTicks;
    private final int amplifier;

    public EffectStickItem(MobEffect effect, int durationTicks, int amplifier) {
        super(new Properties().durability(64).setNoRepair());

        this.effect = effect;
        this.durationTicks = durationTicks;
        this.amplifier = amplifier;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand pUsedHand) {
        player.getCooldowns().addCooldown(this, 90*20);

        if (!level.isClientSide()) player.addEffect(new MobEffectInstance(effect, durationTicks, amplifier));

        return InteractionResultHolder.consume(player.getItemInHand(pUsedHand));
    }

}