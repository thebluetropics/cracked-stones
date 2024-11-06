package io.github.thebluetropics.crackedstones.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import io.github.thebluetropics.crackedstones.CrackedStonesMod;
import io.github.thebluetropics.crackedstones.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.LavaFluid;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Objects;

@Mixin(LavaFluid.class)
public class LavaFluidMixin {
  @ModifyArg(
    method = "flow",
    at = @At(
      value = "INVOKE",
      target = "Lnet/minecraft/world/WorldAccess;setBlockState(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/BlockState;I)Z"
    ),
    index = 1
  )
  private BlockState setBlockState(BlockState blockState, @Local(ordinal = 0) WorldAccess worldAccess) {
    return Objects.equals(worldAccess.getRandom().nextInt(16), 0) ? ModBlocks.CRACKED_STONE.getDefaultState() : Blocks.STONE.getDefaultState();
  }
}
