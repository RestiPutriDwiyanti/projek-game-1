import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level1 extends World
{

    /**
     * Constructor for objects of class level1.
     * 
     */
    public level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        turtle turtle = new turtle();
        addObject(turtle,75,209);
        banana banana = new banana();
        addObject(banana,353,100);
        banana banana2 = new banana();
        addObject(banana2,501,207);
        banana banana3 = new banana();
        addObject(banana3,364,307);

        turtle.setLocation(29,210);
        bola bola = new bola();
        addObject(bola,97,25);
        bola.setRotation(90);
        score score = new score();
        addObject(score,298,19);
    }
}
