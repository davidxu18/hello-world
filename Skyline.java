
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.util.Random;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.RenderingHints;
import java.awt.GradientPaint;

public class Skyline extends JPanel{
    public static final int WIDTH=1024;
    public static final int HEIGHT=768;
    public static void main(String[] args){
        JFrame frame = new JFrame("Skyline");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Skyline());
        frame.pack();
        frame.setVisible(true);
    }
    public Skyline(){
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    @Override
    public void paintComponent(Graphics gOri){
        Graphics2D g = (Graphics2D) gOri;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);

        GradientPaint sunSet= new GradientPaint(0, 0, new Color(7,11,20), 0, 2*HEIGHT/3, new Color(28, 44, 69));
        GradientPaint sunSet2= new GradientPaint(0, 2*HEIGHT/3, new Color(28,44,69), 0, HEIGHT, new Color(223, 169, 107));
        g.setPaint(sunSet);
        g.fill(new Rectangle2D.Double(0, 0, WIDTH, 2*HEIGHT/3));
        g.setPaint(sunSet2);
        g.fill(new Rectangle2D.Double(0,2*HEIGHT/3,WIDTH,HEIGHT/3));

        Random rand = new Random();
        //Your code here
        //stars (cluster)
        g.setColor(Color.yellow);
        int centerx = WIDTH/2 -100 + rand.nextInt(150);
        int centery = HEIGHT/3 -50 + rand.nextInt(100);
        for(int i =0; i<100;i++){
          int clusterx = centerx + (int) (20*rand.nextGaussian());
          int clustery = centery + (int) (20*rand.nextGaussian());
          g.fill(new Rectangle2D.Double(clusterx,clustery, 1, 1));
        }
        //stars (general)
        for(int i =0; i<100;i++){
          int starx = rand.nextInt(WIDTH);
          int stary = rand.nextInt(HEIGHT);
          g.fill(new Rectangle2D.Double(starx,stary, 1, 1));
        }
        //skyline
        g.setColor(Color.darkGray);
        int skyh = HEIGHT-95 - rand.nextInt(10);
        for(int i = 0; i< WIDTH;i++){
          g.fill(new Rectangle2D.Double(i,skyh,1,HEIGHT-skyh));
          int add = rand.nextInt(11);
          if(add==5){
            skyh = skyh;
          }
          else
            skyh = skyh+add-5;
          }
        }
    }
