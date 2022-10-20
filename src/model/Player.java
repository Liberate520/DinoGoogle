package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Player extends Actor {
    private Image image;
    private double speedX, speedY;
    private boolean canJump;

    public Player(String path) {
        this(new Image(path));
    }

    public Player(Image image) {
        this.image = image;
        x = 10000;
        y = 100;
        speedX = 10;
        speedY = 0;
        canJump = true;
    }

    @Override
    public void draw(GraphicsContext context) {
        context.drawImage(image, x, y);
    }

    @Override
    public void update() {
        x += speedX;
        y += speedY;
    }

    public void jump(){
        if (canJump){
            speedY = -20;
        }
    }
}
