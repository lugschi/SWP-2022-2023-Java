package at.grl.games.firstgame;

import org.newdawn.slick.*;

public class ObjectsGames extends BasicGame {
    private float xRec;
    private float yRec;
    private float xOv;
    private float yOv;
    private float speed;
    private boolean left;
    private float xCi;
    private float yCi;



    public ObjectsGames(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.xRec = 100;
        this.yRec = 100;
        this.xOv = 0;
        this.yOv = 0;
        this.speed = 5.0F;
        this.left = false;
        this.xCi = 0;
        this.yCi = 0;

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

        //Rectangle circle
        if (this.xRec <=500 && this.yRec <=100){
            this.xRec += (float)delta/this.speed;
        } else if (this.xRec >= 500 && this.yRec <=400){
            this.yRec += (float)delta/this.speed;
        } else if (this.xRec >= 100 && this.yRec >= 400){
            this.xRec -= (float)delta/this.speed;
        } else if (this.xRec <=100 && this.yRec >=100){
            this.yRec -= (float)delta/this.speed;
        }


        //x Oval
        if ((int)xOv ==700){
            this.left = true;
        } else if ((int)xOv==0){
            this.left = false;
        }
        if (left){
            this.xOv -= (float)delta/this.speed;
        } else if (!left){
            this.xOv += (float)delta/this.speed;
        }

        //y Circle
        if ((int)yCi ==500){
            this.left = true;
        } else if ((int)yCi==0){
            this.left = false;
        }
        if (left){
            this.yCi -= (float)delta/this.speed;
        } else if (!left){
            this.yCi += (float)delta/this.speed;
        }




    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.xRec, this.yRec, 100, 100);
        graphics.drawString("Hello you!", 50, 50);
        graphics.drawOval(this.xOv, this.yOv, 50, 20, 100);
        graphics.drawOval(this.xCi, this.yCi, 100, 100);
    }

    public static void main(String[] argv) {
        try{
        AppGameContainer container = new AppGameContainer(new ObjectsGames("Rectangles"));
        container.setDisplayMode(800, 600, false);
        container.start();
    }  catch (SlickException e) {
            e.printStackTrace();
        }

    }
}
