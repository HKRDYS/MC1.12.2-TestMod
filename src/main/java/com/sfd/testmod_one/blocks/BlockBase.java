package com.sfd.testmod_one.blocks;

import com.sfd.testmod_one.handlers.RegisterHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockBase extends Block{


    public BlockBase(Material blockMaterialIn, MapColor blockMapColorIn) {
        super(blockMaterialIn, blockMapColorIn);
    }

    public BlockBase(Material materialIn) {
        super(materialIn);
    }

}
