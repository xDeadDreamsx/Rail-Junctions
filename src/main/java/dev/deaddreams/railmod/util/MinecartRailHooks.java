package dev.deaddreams.railmod.util;

import dev.deaddreams.railmod.ModBlocks;
import dev.deaddreams.railmod.block.RailCrossBlock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.vehicle.minecart.AbstractMinecart;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.RailShape;
import net.minecraft.world.phys.Vec3;

public final class MinecartRailHooks {
    private static final double MIN_MOTION = 1.0E-4;

    private MinecartRailHooks() {
    }

    public static void prepareRail(ServerLevel level, AbstractMinecart cart) {
        Vec3 motion = cart.getDeltaMovement();
        if (Math.abs(motion.x()) < MIN_MOTION && Math.abs(motion.z()) < MIN_MOTION) {
            return;
        }

        RailShape desired = Math.abs(motion.x()) > Math.abs(motion.z())
                ? RailShape.EAST_WEST
                : RailShape.NORTH_SOUTH;

        BlockPos current = cart.blockPosition();
        prepareCross(level, current, desired);
        prepareCross(level, current.below(), desired);

        Direction travel = dominantDirection(motion);
        if (travel != null) {
            prepareCross(level, current.relative(travel), desired);
            prepareCross(level, current.relative(travel).below(), desired);
        }
    }

    public static void stopAtDeadEnd(ServerLevel level, AbstractMinecart cart) {
        BlockPos current = cart.blockPosition();
        if (isDeadEnd(level.getBlockState(current)) || isDeadEnd(level.getBlockState(current.below()))) {
            cart.setDeltaMovement(Vec3.ZERO);
        }
    }

    private static void prepareCross(ServerLevel level, BlockPos pos, RailShape desired) {
        BlockState state = level.getBlockState(pos);
        if (state.is(ModBlocks.RAIL_CROSS) && state.getValue(RailCrossBlock.SHAPE) != desired) {
            level.setBlock(pos, state.setValue(RailCrossBlock.SHAPE, desired), Block.UPDATE_CLIENTS);
        }
    }

    private static boolean isDeadEnd(BlockState state) {
        return state.is(ModBlocks.DEAD_END);
    }

    private static Direction dominantDirection(Vec3 motion) {
        if (Math.abs(motion.x()) > Math.abs(motion.z())) {
            if (Math.abs(motion.x()) < MIN_MOTION) {
                return null;
            }
            return motion.x() > 0 ? Direction.EAST : Direction.WEST;
        }

        if (Math.abs(motion.z()) < MIN_MOTION) {
            return null;
        }
        return motion.z() > 0 ? Direction.SOUTH : Direction.NORTH;
    }
}
