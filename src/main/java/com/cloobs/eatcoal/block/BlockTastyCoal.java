package com.cloobs.eatcoal.block;

import com.cloobs.eatcoal.creativetab.CreativeTabEC;

public class BlockTastyCoal extends BlockEatCoal
{
    public BlockTastyCoal()
    {
        super();
        this.setBlockName("blockTastyCoal");
        this.setBlockTextureName("blockTastyCoal");
        this.blockHardness=(2.5F);
        this.getHarvestTool(1);
        this.getHarvestLevel(2);
    }
}