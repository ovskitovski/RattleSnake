package ch.c3000;

import java.awt.*;

public class Snake extends GameObject {
    public Snake(int x, int y, ID id) {
        super(x, y, id);

        speedX = 2;
    }

    public void tick() {
        x += speedX;
        y += speedY;
        if (Game.WIDTH < x) {
            x = 0;
        }

    }

    public void render(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(x, y, 32, 32);
    }



}


