package com.jbkgraphics.camolights.block.stone;

import com.jbkgraphics.camolights.block.BlockCamoLights;
import com.jbkgraphics.camolights.creativetab.CreativeTabCL;
import net.minecraft.block.material.Material;



public class StoneBrickCamo extends BlockCamoLights
{
    public StoneBrickCamo()
    {
        super(Material.rock);
        this.setBlockName("stoneBrickCamo");
        this.setLightLevel(1.0F);
        this.setHardness(2.0F);
        this.setStepSound(soundTypeStone);
        this.setCreativeTab(CreativeTabCL.CL_TAB);
    }
}