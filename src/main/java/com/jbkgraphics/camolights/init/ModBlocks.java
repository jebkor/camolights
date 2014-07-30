package com.jbkgraphics.camolights.init;


import com.jbkgraphics.camolights.block.wood.*;
import com.jbkgraphics.camolights.block.stone.StoneBrickCamo;
import com.jbkgraphics.camolights.block.stone.StoneCamo;
import com.jbkgraphics.camolights.block.wool.WhiteWoolCamo;
import cpw.mods.fml.common.registry.GameRegistry;


public class ModBlocks
{
    //An instance of the block.
    //Stone Blocks
    public static final StoneCamo stoneCamo = new StoneCamo();
    public static final StoneBrickCamo stoneBrickCamo = new StoneBrickCamo();


    //Wood Blocks
    public static final OakPlanksCamo oakPlanksCamo= new OakPlanksCamo();
    public static final SprucePlanksCamo sprucePlanksCamo = new SprucePlanksCamo();
    public static final BirchPlanksCamo birchPlanksCamo = new BirchPlanksCamo();
    public static final JunglePlanksCamo junglePlanksCamo = new JunglePlanksCamo();
    public static final AcaciaPlanksCamo acaciaPlanksCamo = new AcaciaPlanksCamo();
    public static final DarkPlanksCamo darkPlanksCamo = new DarkPlanksCamo();


    //Wool Blocks
    public static final WhiteWoolCamo whiteWoolCamo = new WhiteWoolCamo();




    //Registering the block.
    public static void init()
    {
        //Stone Blocks
        GameRegistry.registerBlock(stoneCamo, "stoneCamo");
        GameRegistry.registerBlock(stoneBrickCamo, "stoneBrickCamo");


        //Wood Blocks
        GameRegistry.registerBlock(oakPlanksCamo, "oakPlanksCamo");
        GameRegistry.registerBlock(sprucePlanksCamo, "sprucePlanksCamo");
        GameRegistry.registerBlock(birchPlanksCamo, "birchPlanksCamo");
        GameRegistry.registerBlock(junglePlanksCamo, "junglePlanksCamo");
        GameRegistry.registerBlock(acaciaPlanksCamo, "acaciaPlanksCamo");
        GameRegistry.registerBlock(darkPlanksCamo, "darkPlanksCamo");


        //Wool Blocks
        GameRegistry.registerBlock(whiteWoolCamo, "whiteWoolCamo");
    }
}
