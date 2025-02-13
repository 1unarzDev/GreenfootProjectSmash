import greenfoot.*;

public class Bchan extends Player
{
    public void act()
    {   
        super.fall();
        super.moveRight();
        super.moveLeft();

        if (Greenfoot.isKeyDown("w")&&(canJump<=0)){
            jump();
            canJump = 50;
        }
        canJump = canJump-1;
    }

    public Bryan(int health, int ultimateCharge)
    {
        this.health = health;
        this.ultimageCharge = ultimateCharge;
        canJump = 0;
    }
}
