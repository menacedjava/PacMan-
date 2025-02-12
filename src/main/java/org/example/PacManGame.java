package org.example;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class PacManGame extends JPanel implements ActionListener, KeyListener {
    private final int SIZE = 20;
    private final int WIDTH = 20, HEIGHT = 15;
    private int pacX = 1, pacY = 1;
    private int ghostX, ghostY;
    private boolean[][] dots;
    private Timer timer;
    private Random random = new Random();
    private int score = 0;

    public PacManGame() {
        setPreferredSize(new Dimension(WIDTH * SIZE, HEIGHT * SIZE));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(this);
        dots = new boolean[WIDTH][HEIGHT];

        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                dots[i][j] = true;
            }
        }

        ghostX = random.nextInt(WIDTH - 2) + 1;
        ghostY = random.nextInt(HEIGHT - 2) + 1;

        timer = new Timer(150, this);
        timer.start();
    }

//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//
//        // Chiziqlar
//        g.setColor(Color.WHITE);
//        for (int i = 0; i < WIDTH; i++) {
//            for (int j = 0; j < HEIGHT; j++) {
//                if (dots[i][j]) {
//                    g.fillOval(i * SIZE + SIZE / 3, j * SIZE + SIZE / 3, SIZE / 3, SIZE / 3);
//                }
//            }
//        }
//
//        // Pac-Man (sariq doira)
//        g.setColor(Color.YELLOW);
//        g.fillArc(pacX * SIZE, pacY * SIZE, SIZE, SIZE, 30, 300);
//
//        // Yovuzlar (Ghosts)
//        g.setColor(Color.RED);
//        g.fillOval(ghostX * SIZE, ghostY * SIZE, SIZE, SIZE);
//
//        // Score
//        g.setColor(Color.WHITE);
//        g.drawString("Score: " + score, 10, HEIGHT * SIZE - 10);
//    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (pacX == ghostX && pacY == ghostY) {
//            timer.stop();
//            JOptionPane.showMessageDialog(this, "Game Over! Score: " + score);
//            System.exit(0);
//        }
//
//        ghostMove();
//        repaint();
//    }

//    private void ghostMove() {
//        int move = random.nextInt(4);
//        if (move == 0 && ghostX > 0) ghostX--;
//        if (move == 1 && ghostX < WIDTH - 1) ghostX++;
//        if (move == 2 && ghostY > 0) ghostY--;
//        if (move == 3 && ghostY < HEIGHT - 1) ghostY++;
//    }

//    @Override
//    public void keyPressed(KeyEvent e) {
//        if (e.getKeyCode() == KeyEvent.VK_LEFT && pacX > 0) pacX--;
//        if (e.getKeyCode() == KeyEvent.VK_RIGHT && pacX < WIDTH - 1) pacX++;
//        if (e.getKeyCode() == KeyEvent.VK_UP && pacY > 0) pacY--;
//        if (e.getKeyCode() == KeyEvent.VK_DOWN && pacY < HEIGHT - 1) pacY++;
//
//        if (dots[pacX][pacY]) {
//            dots[pacX][pacY] = false;
//            score += 10;
//        }
//
//        repaint();
//    }
//
//    @Override
//    public void keyReleased(KeyEvent e) {
//    }
//
//    @Override
//    public void keyTyped(KeyEvent e) {
//    }

//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Pac-Man");
//        PacManGame game = new PacManGame();
//        frame.add(game);
//        frame.pack();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//        frame.setLocationRelativeTo(null);
//    }

}