package net.thenoshoeprince.newuniverse.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.thenoshoeprince.newuniverse.NewUniverse;
import net.thenoshoeprince.newuniverse.block.ModBlocks;

public class ModItemGroup {
    public static final ItemGroup MOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(NewUniverse.MOD_ID, "copper-sheet"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.modpack"))
                    .icon(() -> new ItemStack(ModItems.COPPER_SHEET)).entries((displayContext, entries) -> {
                        entries.add(ModItems.COPPER_SHEET);
                        entries.add(ModItems.COPPER_WIRE);
                        entries.add(ModItems.RAW_ALUMINIUM);
                        entries.add(ModItems.ALUMINIUM_INGOT);
                        entries.add(ModBlocks.ALUMINIUM_BLOCK);
                        entries.add(ModBlocks.ALUMINIUM_ORE);
                    }).build());
    public static void registerItemGroup() {

    }
}
