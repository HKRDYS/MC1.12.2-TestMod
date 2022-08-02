package com.sfd.testmod_one.blocks;

import com.sfd.testmod_one.ModInfo;
import com.sfd.testmod_one.ModMain;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class Block_New_Test extends Block {


    public Block_New_Test(Material blockMaterialIn, MapColor blockMapColorIn) {
        super(blockMaterialIn, blockMapColorIn);
        //初始化
        this.setUnlocalizedName(ModInfo.MOD_ID+"new_test_block");
        //物品名
        this.setRegistryName("new_test_block");
        //工具 挖掘等级
        this.setHarvestLevel("pickaxe",2);
        //硬度
        this.setHardness(100F);



    }

    private Block_New_Test(Material materialIn) {
        //初始化材质类型
        super(Material.GROUND);
    }


}
