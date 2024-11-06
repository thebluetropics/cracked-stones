package io.github.thebluetropics.crackedstones.block;

import io.github.thebluetropics.crackedstones.CrackedStonesMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
  public static final Block CRACKED_STONE = register(
    "cracked_stone",
    new Block(
      AbstractBlock.Settings.create()
        .mapColor(MapColor.STONE_GRAY)
        .instrument(Instrument.BASEDRUM)
        .requiresTool()
        .strength(1.5F, 6.0F)
    )
  );

  public static <T extends Block> T register(String id, T block) {
    return Registry.register(Registries.BLOCK, new Identifier(CrackedStonesMod.ID, id), block);
  }

  public static void initialize() { /* ... */ }
}
