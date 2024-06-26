package net.thenoshoeprince.newuniverse.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.thenoshoeprince.newuniverse.NewUniverse;

public class ModBlocks {
    public static final Block ALUMINIUM_BLOCK = registerBlock("aluminium_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block ALUMINIUM_ORE = registerBlock("aluminium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.copy(Blocks.STONE).strength(2f)));
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(NewUniverse.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(NewUniverse.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerBlocks(){

    }
}
