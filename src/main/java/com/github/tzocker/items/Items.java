package com.github.tzocker.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Items {
    public static final Item LITHIUM_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item RAW_LITHIUM= new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item LITHIUM_NUGGET = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static void register(String name, Item item) {
        Registry.register(Registry.ITEM, new Identifier("lithium", name), item);
    }

    public static void init() {
        register("lithium_ingot", LITHIUM_INGOT);
        register("raw_lithium", RAW_LITHIUM);
        register("lithium_nugget", LITHIUM_NUGGET);
    }
}
