package io.sandbox.trades.configs;

public class SandboxTradesConfig {
  public CostConfig[] defaultLevelCost;
  public VillagerConfig[] villagerConfigs;

  public VillagerConfig getVillagerConfig(String profession) {
    if (this.villagerConfigs != null) {
      for (VillagerConfig config : this.villagerConfigs) {
        if (config.type.equals(profession)) {
          return config;
        }
      }
    }

    return null;
  }
}
