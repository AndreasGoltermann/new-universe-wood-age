package net.thenoshoeprince.newuniverse.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.thenoshoeprince.newuniverse.NewUniverse;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item COPPER_SHEET = registerItem("copper-sheet", new Item(new Item.Settings()));
    public static final Item COPPER_WIRE = registerItem("copper-wire", new Item(new Item.Settings()));
    public static final Item RAW_ALUMINIUM = registerItem("raw-aluminium", new Item(new Item.Settings()));
    public static final Item ALUMINIUM_INGOT = registerItem("aluminium-ingot", new Item(new Item.Settings()));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(NewUniverse.MOD_ID, name), item);
    }
    public static void registerItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS);
    }
}
