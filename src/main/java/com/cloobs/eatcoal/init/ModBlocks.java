package com.cloobs.eatcoal.init;

import com.cloobs.eatcoal.block.BlockEatCoal;
import com.cloobs.eatcoal.block.BlockTastyCoal;
import com.cloobs.eatcoal.block.blockTeef;
import com.cloobs.eatcoal.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockEatCoal blockTastyCoal = new BlockTastyCoal();
    public static final BlockEatCoal blockTeef = new blockTeef();

    public static void init()
    {
        GameRegistry.registerBlock(blockTastyCoal, "blockTastyCoal");
        GameRegistry.registerBlock(blockTeef, "blockTeef");
    }
}
