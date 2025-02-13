import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hitbox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hitbox extends Actor
{
    public Hitbox(Player player){
        GreenfootImage Hitbox = getImage(   );
        Hitbox.scale(player.getImage().getHeight(), player.getImage().getHeight());
        setImage(Hitbox);
    }
    public void act()
    {
        
    }
}
