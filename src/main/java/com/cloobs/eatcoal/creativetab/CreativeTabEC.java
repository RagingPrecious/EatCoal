package com.cloobs.eatcoal.creativetab;

import com.cloobs.eatcoal.init.ModItems;
import com.cloobs.eatcoal.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabEC
{
    public static final CreativeTabs EatCoalTab =new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem() {
            return ModItems.oldTeef;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "Eat Coal";
        }
    };
}
