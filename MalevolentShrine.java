import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MalevolentShrine extends Domain
{
    public MalevolentShrine()
    {    
        Paul paul_player = new Paul(100, 0);
        Hitbox paul_hb = new Hitbox(paul_player);
        
        GreenfootImage bg = new GreenfootImage("malevolentShrine.jpg");
        
        super.addObject(paul_player, 0, 0);
        super.addObject(paul_hb, 0, 0);
    }
}
