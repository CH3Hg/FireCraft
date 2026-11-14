package com.firecraft.registry;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ToolMaterial;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.firecraft.FireCraft.MODID;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);
    public static void init(){}
    public static final DeferredItem<Item> FIRE_AXE = ITEMS.registerItem(
            "fire_axe",
            props -> new Item(
                    props.axe(
                            ToolMaterial.DIAMOND,60,-3f
                    )
            )
    );
}
