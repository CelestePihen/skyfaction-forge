package fr.cel.skyfaction.block.custom;

import fr.cel.skyfaction.SkyFactionMod;
import fr.cel.skyfaction.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class XPBerryBlock extends Block {

    public static final VoxelShape[] SHAPE = new VoxelShape[] {
            Block.box(7, 0, 7, 9, 2, 9),
            Block.box(6, 0, 6, 10, 4, 10),
            Block.box(5, 0, 5, 11, 6, 11),
            Block.box(4, 0, 4, 12, 8, 12),
            Block.box(3, 0, 3, 13, 10, 13),
            Block.box(2, 0, 2, 14, 12, 14),
    };

    public static final IntegerProperty AGE = IntegerProperty.create("age", 0, 5);

    public XPBerryBlock() {
        super(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).noOcclusion().randomTicks());
        this.registerDefaultState(this.getStateDefinition().any().setValue(AGE, 0));
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE[pState.getValue(AGE)];
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        ItemStack itemStack = new ItemStack(ModItems.XP_BERRY.get());
        ItemEntity itemEntity = new ItemEntity(pLevel, pPos.getX(), pPos.getY(), pPos.getZ(), itemStack);

        if (!pLevel.isClientSide() && pState.getValue(AGE) == 5) {
            // TODO pas sûr du flag
            pLevel.setBlock(pPos, pState.setValue(AGE, 0), 3);

            pLevel.addFreshEntity(itemEntity);
        }

        return InteractionResult.SUCCESS;
    }

    @Override
    public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        int age = pState.getValue(AGE);
        if (!pLevel.isClientSide()) {
            if (age < 5) {
                pLevel.setBlockAndUpdate(pPos, pState);
                // TODO pas sûr du flag
                pLevel.setBlock(pPos, pState.setValue(AGE, age + 1), 3);
            }
        }

        super.randomTick(pState, pLevel, pPos, pRandom);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(AGE);
    }

}