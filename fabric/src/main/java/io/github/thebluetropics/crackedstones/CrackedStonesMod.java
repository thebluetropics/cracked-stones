package io.github.thebluetropics.crackedstones;

import io.github.thebluetropics.crackedstones.block.ModBlocks;
import io.github.thebluetropics.crackedstones.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrackedStonesMod implements ModInitializer {
  public static final String ID = "crackedstones";
  public static final Logger LOGGER = LoggerFactory.getLogger(ID);

  @Override
  public void onInitialize() {
    ModBlocks.initialize();
    ModItems.initialize();
  }
}
