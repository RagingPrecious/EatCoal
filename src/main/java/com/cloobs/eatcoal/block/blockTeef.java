package com.cloobs.eatcoal.block;

import com.cloobs.eatcoal.creativetab.CreativeTabEC;

public class blockTeef extends BlockEatCoal
{
    public blockTeef()
    {
        super();
        this.setBlockName("blockTeef");
        this.setBlockTextureName("blockTeef");
        this.blockHardness = (10.0F);
        this.getHarvestTool(1);
        this.getHarvestLevel(10);
    }
}
