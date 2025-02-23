import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Controller extends Actor
{
    private Player player;
    
    public Controller(Player player){
        this.player = player;
    }
    
    public void act(){
        moveLeft();
        moveRight();
        jump();
    }
    
    private void moveLeft(){
        if(Greenfoot.isKeyDown("a")){
            setLocation(getX() - 1,getY());
        }
    }

    private void moveRight(){
        if(Greenfoot.isKeyDown("d")){
            setLocation(getX() + 1,getY());
        }
    }
    
    private void jump(){
        if (Greenfoot.isKeyDown("w")&&(player.canJump <= 0)){
            jump();
            player.canJump = 50;
        }
        player.canJump = player.canJump-1;
    }
}
