import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MalevolentShrine extends Domain
{
    public MalevolentShrine()
    {    
        Paul paulPlayer = new Paul(100, 0);
        Hitbox paulHB = new Hitbox(paulPlayer);
        
        super.addObject(paulPlayer, 0, 0);
        super.addObject(paulHB, 0, 0);
        
        GreenfootImage bg = new GreenfootImage("malevolentShrine.jpg");
        bg.scale(this.getWidth(), this.getHeight());
        setBackground(bg);
    }
}
