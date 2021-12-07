package ch.c3000;

import javax.swing.*;
import java.awt.*;
import java.io.Serial;

public class Window extends Canvas {

    @Serial
    private static final long serialVersionUID = 8011267231084830466L;

    public Window(int width, int height, String title, Game game) {
        JFrame frame = new JFrame();

        frame.setTitle(title);

        frame.setPreferredSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationByPlatform(true);
        frame.add(game);
        frame.setVisible(true);
        game.start();


    }

}
