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
        GreenfootImage hbShape = new GreenfootImage("hitbox.png");
        hbShape.setTransparency(0);
        hbShape.scale(player.getImage().getWidth(), player.getImage().getHeight());
        setImage(hbShape);
    }
    
    public void act()
    {
        
    }

    public boolean checkProjectileCollision(){
        if(isTouching(Attack.class)){
            System.out.print("Hit");
            return true;
        }
        return false;
    }
}
