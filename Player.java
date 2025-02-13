import greenfoot.*;
public class Player extends Actor
{
    private int GRAVITY = 1;
    private final int ULT_GAIN_SMALL = 5;
    private final int ULT_GAIN_LARGE = 10;
    private int MOVE_SPEED = 5;
    private int PLAYER_HEIGHT = 300;
    private int PLAYER_WIDTH = 100;
    private final int GRAVITY = 1;
    private int CAN_JUMP = 0;
    private int VELOCITY

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

    private void moveLeft(){
        if(Greenfoot.isKeyDown("a")){
            setLocation(getX()-1,getY());
        }
    }

    private void moveRight(){
        if(Greenfoot.isKeyDown("d")){
            setLocation(getX()+1,getY());
        }
    }

    public void act()
    {
        
    }
}
