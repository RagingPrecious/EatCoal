package com.cloobs.eatcoal.init;

import com.cloobs.eatcoal.item.ItemEatCoal;
import com.cloobs.eatcoal.item.ItemOldTeef;
import com.cloobs.eatcoal.item.ItemTastyCoal;
import com.cloobs.eatcoal.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemEatCoal tastyCoal = new ItemTastyCoal();
    public static final ItemEatCoal oldTeef = new ItemOldTeef();

    public static void init()
    {
        GameRegistry.registerItem(tastyCoal, "tastyCoal");
        GameRegistry.registerItem(oldTeef, "oldTeef");
    }
}
