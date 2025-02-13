import greenfoot.*;
public class Player extends Actor
{
    private final int ULT_GAIN_SMALL = 5;
    private final int ULT_GAIN_LARGE = 10;
    private final int MOVE_SPEED = 5;
    private final int PLAYER_HEIGHT = 300;
    private final int PLAYER_WIDTH = 100;
    private final double GRAVITY = 1;
    private int velocity;
    private final int jumpTimer = 0;

    public void act()
    {
        
    }

    public void fall(){
        setLocation(getX(),getY() + velocity);
        if(getY()> getWorld().getHeight() - 50){
            velocity = 0;
        }
        else{
            velocity += GRAVITY;
        }
    }

    public void jump(){
        velocity = -20;
    }
}
