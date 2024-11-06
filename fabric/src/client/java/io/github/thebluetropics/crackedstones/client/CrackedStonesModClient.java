package io.github.thebluetropics.crackedstones.client;

import io.github.thebluetropics.crackedstones.CrackedStonesMod;
import net.fabricmc.api.ClientModInitializer;

public class CrackedStonesModClient implements ClientModInitializer {
  @Override
  public void onInitializeClient() {
    CrackedStonesMod.LOGGER.info("Hello, World! (Client initialize)");
  }
}
