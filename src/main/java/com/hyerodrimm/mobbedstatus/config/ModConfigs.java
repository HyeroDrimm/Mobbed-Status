package com.hyerodrimm.mobbedstatus.config;

import com.hyerodrimm.mobbedstatus.MobbedStatus;
import com.mojang.datafixers.util.Pair;

public class ModConfigs {
    public static SimpleConfig CONFIG;
    private static ModConfigProvider configs;

    public static int BEE_SPAWN_MAX_NUMBER;
    public static int CREEPER_SPAWN_MAX_NUMBER;
    public static int GOAT_SPAWN_MAX_NUMBER;
    public static int LLAMA_SPAWN_MAX_NUMBER;
    public static int RABBIT_SPAWN_MAX_NUMBER;
    public static int RAVAGER_SPAWN_MAX_NUMBER;
    public static int SQUID_SPAWN_MAX_NUMBER;
    public static int VEX_SPAWN_MAX_NUMBER;
    public static int WITHER_SPAWN_MAX_NUMBER;
    public static float BEE_SPAWN_CHANCE;
    public static float CREEPER_SPAWN_CHANCE;
    public static float GOAT_SPAWN_CHANCE;
    public static float LLAMA_SPAWN_CHANCE;
    public static float RABBIT_SPAWN_CHANCE;
    public static float RAVAGER_SPAWN_CHANCE;
    public static float SQUID_SPAWN_CHANCE;
    public static float VEX_SPAWN_CHANCE;
    public static float WITHER_SPAWN_CHANCE;


    public static void registerConfigs() {
        configs = new ModConfigProvider();
        createConfigs();

        CONFIG = SimpleConfig.of(MobbedStatus.MOD_ID + "config").provider(configs).request();

        assignConfigs();
    }

    private static void createConfigs() {
        configs.addKeyValuePair(new Pair<>("bee.spawn.number.max", 3), "Upper limit of bees that will spawn from potion");
        configs.addKeyValuePair(new Pair<>("ravager.spawn.number.max", 1), "Upper limit of ravagers that will spawn from potion");
        configs.addKeyValuePair(new Pair<>("creeper.spawn.number.max", 2), "Upper limit of creepers that will spawn from potion");
        configs.addKeyValuePair(new Pair<>("goat.spawn.number.max", 2), "Upper limit of goats that will spawn from potion");
        configs.addKeyValuePair(new Pair<>("llama.spawn.number.max", 2), "Upper limit of llamas that will spawn from potion");
        configs.addKeyValuePair(new Pair<>("rabbit.spawn.number.max", 4), "Upper limit of rabbits that will spawn from potion");
        configs.addKeyValuePair(new Pair<>("squid.spawn.number.max", 4), "Upper limit of squids that will spawn from potion");
        configs.addKeyValuePair(new Pair<>("vex.spawn.number.max", 3), "Upper limit of vexes that will spawn from potion");
        configs.addKeyValuePair(new Pair<>("wither.spawn.number.max", 1), "Upper limit of withers that will spawn from potion");

        configs.addKeyValuePair(new Pair<>("bee.spawn.change", 0.1f), "Chance that any bees will spawn from potion");
        configs.addKeyValuePair(new Pair<>("ravager.spawn.change", 0.1f), "Chance that any ravagers will spawn from potion");
        configs.addKeyValuePair(new Pair<>("creeper.spawn.change", 0.1f), "Chance that any creepers will spawn from potion");
        configs.addKeyValuePair(new Pair<>("goat.spawn.change", 0.1f), "Chance that any goats will spawn from potion");
        configs.addKeyValuePair(new Pair<>("llama.spawn.change", 0.1f), "Chance that any llamas will spawn from potion");
        configs.addKeyValuePair(new Pair<>("rabbit.spawn.change", 0.1f), "Chance that any rabbits will spawn from potion");
        configs.addKeyValuePair(new Pair<>("squid.spawn.change", 0.1f), "Chance that any squids will spawn from potion");
        configs.addKeyValuePair(new Pair<>("vex.spawn.change", 0.1f), "Chance that any vexs will spawn from potion");
        configs.addKeyValuePair(new Pair<>("wither.spawn.change", 0.1f), "Chance that any withers will spawn from potion");

    }

    private static void assignConfigs() {
        BEE_SPAWN_MAX_NUMBER = CONFIG.getOrDefault("bee.spawn.number.max", 3);
        CREEPER_SPAWN_MAX_NUMBER = CONFIG.getOrDefault("ravager.spawn.number.max", 1);
        GOAT_SPAWN_MAX_NUMBER = CONFIG.getOrDefault("creeper.spawn.number.max", 2);
        LLAMA_SPAWN_MAX_NUMBER = CONFIG.getOrDefault("goat.spawn.number.max", 2);
        RABBIT_SPAWN_MAX_NUMBER = CONFIG.getOrDefault("llama.spawn.number.max", 2);
        RAVAGER_SPAWN_MAX_NUMBER = CONFIG.getOrDefault("rabbit.spawn.number.max", 4);
        SQUID_SPAWN_MAX_NUMBER = CONFIG.getOrDefault("squid.spawn.number.max", 4);
        VEX_SPAWN_MAX_NUMBER = CONFIG.getOrDefault("vex.spawn.number.max", 3);
        WITHER_SPAWN_MAX_NUMBER = CONFIG.getOrDefault("wither.spawn.number.max", 1);


        BEE_SPAWN_CHANCE = (float) CONFIG.getOrDefault("bee.spawn.change", 0.1f);
        CREEPER_SPAWN_CHANCE = (float) CONFIG.getOrDefault("ravager.spawn.change", 0.1f);
        GOAT_SPAWN_CHANCE = (float) CONFIG.getOrDefault("creeper.spawn.change", 0.1f);
        LLAMA_SPAWN_CHANCE = (float) CONFIG.getOrDefault("goat.spawn.change", 0.1f);
        RABBIT_SPAWN_CHANCE = (float) CONFIG.getOrDefault("llama.spawn.change", 0.1f);
        RAVAGER_SPAWN_CHANCE = (float) CONFIG.getOrDefault("rabbit.spawn.change", 0.1f);
        SQUID_SPAWN_CHANCE = (float) CONFIG.getOrDefault("squid.spawn.change", 0.1f);
        VEX_SPAWN_CHANCE = (float) CONFIG.getOrDefault("vex.spawn.change", 0.1f);
        WITHER_SPAWN_CHANCE = (float) CONFIG.getOrDefault("wither.spawn.change", 0.1f);


        System.out.println("All " + configs.getConfigsList().size() + " have been set properly");
    }
}