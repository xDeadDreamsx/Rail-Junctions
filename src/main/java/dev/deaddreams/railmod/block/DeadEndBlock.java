package dev.deaddreams.railmod.block;

import com.mojang.serialization.MapCodec;

import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseRailBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.RailShape;
import net.minecraft.world.level.material.Fluids;

public final class DeadEndBlock extends BaseRailBlock {
    public static final MapCodec<DeadEndBlock> CODEC = simpleCodec(DeadEndBlock::new);
    public static final EnumProperty<RailShape> SHAPE = BlockStateProperties.RAIL_SHAPE_STRAIGHT;
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public DeadEndBlock(BlockBehaviour.Properties properties) {
        super(true, properties);
        registerDefaultState(defaultBlockState()
                .setValue(SHAPE, RailShape.NORTH_SOUTH)
                .setValue(FACING, Direction.NORTH)
                .setValue(WATERLOGGED, false));
    }

    @Override
    protected MapCodec<? extends BaseRailBlock> codec() {
        return CODEC;
    }

    @Deprecated
    @Override
    public Property<RailShape> getShapeProperty() {
        return SHAPE;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Direction facing = context.getHorizontalDirection().getOpposite();
        RailShape shape = facing.getAxis() == Direction.Axis.X ? RailShape.EAST_WEST : RailShape.NORTH_SOUTH;
        boolean waterlogged = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;

        return defaultBlockState()
                .setValue(FACING, facing)
                .setValue(SHAPE, shape)
                .setValue(WATERLOGGED, waterlogged);
    }

    @Override
    protected BlockState updateState(BlockState state, Level level, net.minecraft.core.BlockPos pos, boolean movedByPiston) {
        return state;
    }

    @Override
    protected BlockState updateDir(Level level, net.minecraft.core.BlockPos pos, BlockState state, boolean first) {
        return state;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(SHAPE, FACING, WATERLOGGED);
    }
}
