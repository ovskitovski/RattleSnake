package ch.c3000;

import java.awt.*;
import java.util.Random;

public class Square extends GameObject {
    private final int size;
    private final Random random = new Random();
    private final Color randomColor;

    public Square(int x, int y, ID id) {
        super(x, y, id);

        speedX = random.nextInt(-5,5);
        speedY = random.nextInt(-5,5);
        size = 32;
        randomColor = new Color(
                random.nextInt(255),
                random.nextInt(255),
                random.nextInt(255));
    }

    public void tick() {
        x += speedX;
        y += speedY;
        if (x > Game.WIDTH + size) {
            x = 0;
        }

        if (x < -size) {
            x = Game.WIDTH;
        }

        if (y > Game.HEIGHT + size) {
            y = 0;
        }

        if (y < -size) {
            y = Game.HEIGHT;
        }

    }

    public void render(Graphics g) {


        g.setColor(randomColor);
        g.fillRect(x, y, size, size);
    }



}


