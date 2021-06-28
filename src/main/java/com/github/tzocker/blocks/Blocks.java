package com.github.tzocker.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Blocks {
    public static final Block LITHIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).requiresTool()
            .strength(3.0F, 3.0F).breakByTool(FabricToolTags.PICKAXES,1));

    public static void init() {
        Registry.register(Registry.BLOCK, new Identifier("lithium", "lithium_ore"), LITHIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier("lithium", "lithium_ore"),
                new BlockItem(LITHIUM_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    }
}
