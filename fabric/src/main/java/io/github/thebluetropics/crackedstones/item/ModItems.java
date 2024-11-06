package io.github.thebluetropics.crackedstones.item;

import io.github.thebluetropics.crackedstones.CrackedStonesMod;
import io.github.thebluetropics.crackedstones.block.ModBlocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
  public static final BlockItem CRACKED_STONE = register("cracked_stone", new BlockItem(ModBlocks.CRACKED_STONE, new Item.Settings()));
  public static final Item SMALL_RAW_IRON = register(
    "small_raw_iron",
    new Item(
      new Item.Settings()
    )
  );

  public static <T extends Item> T register(String id, T item) {
    return Registry.register(Registries.ITEM, new Identifier(CrackedStonesMod.ID, id), item);
  }

  public static void initialize() { /* ... */ }
}
