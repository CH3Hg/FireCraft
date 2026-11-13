package com.firecraft.registry;

import com.firecraft.FireCraft;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;

public class ModItems {
    public static void init(){}
    public static DeferredItem<Item> FIRE_AXE=
            FireCraft.ITEMS.registerSimpleItem("fireaxe");
}
