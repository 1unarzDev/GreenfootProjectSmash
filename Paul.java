import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Paul extends Player
{
    public Paul(int health, int ultimateCharge)
    {
        super.health = health;
        super.ultimateCharge = ultimateCharge;
        
        GreenfootImage image = new GreenfootImage("aipaul.png");
        image.scale(image.getWidth() / 2, image.getHeight() / 2);
        setImage(image);
    }
    
    public void act()
    {
        
    }
}
