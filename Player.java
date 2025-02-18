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
    public final int jumpTimer = 0;
    public int health = 100;
    public int ultimateCharge = 0;
    public int canJump = 0;
    
    public Player(){
        Controller controller = new Controller(this);
        this.getWorld().addObject(controller, this.getX(), this.getY());
    }
    
    public void act()
    {
        fall();
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
