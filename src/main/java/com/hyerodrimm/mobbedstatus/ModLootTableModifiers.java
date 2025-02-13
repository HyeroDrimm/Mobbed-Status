package com.hyerodrimm.mobbedstatus;


import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.item.PotionItem;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.potion.Potions;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
    private static final Identifier JUNGLE_TEMPLE_LOOT_TABLE_ID = Identifier.of("minecraft", "chests/jungle_temple");

    public static void ModifyLootTables(){
//        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
//            // Let's only modify built-in loot tables and leave data pack loot tables untouched by checking the source.
//            // We also check that the loot table ID is equal to the ID we want.
//            if (source.isBuiltin() && JUNGLE_TEMPLE_LOOT_TABLE_ID.equals(key)) {
//                LootPool.Builder poolBuilder = LootPool.builder().with(PotionItem.);
//                tableBuilder.pool(poolBuilder);
//            }
//        });
    }
}
