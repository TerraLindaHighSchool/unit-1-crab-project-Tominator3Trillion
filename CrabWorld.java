import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Worm worm = new Worm();
        addObject(worm,284,219);
        Worm worm2 = new Worm();
        addObject(worm2,376,342);
        Worm worm3 = new Worm();
        addObject(worm3,44,381);
        Worm worm4 = new Worm();
        addObject(worm4,376,131);
        Worm worm5 = new Worm();
        addObject(worm5,68,111);
        Worm worm6 = new Worm();
        addObject(worm6,183,433);
        Worm worm7 = new Worm();
        addObject(worm7,251,65);
        Worm worm8 = new Worm();
        addObject(worm8,436,465);
        Crab crab = new Crab();
        addObject(crab,164,259);
        Lobster lobster = new Lobster();
        addObject(lobster,448,221);
    }
}