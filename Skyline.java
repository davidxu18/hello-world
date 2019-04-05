
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
        frame.pack()
        frame.setVisible(true);
    }
    public Skyline(){
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    @Override
    public void paintComponent(Graphics gOri){
        Graphics2D g = (Graphics2D) gOri;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_
        GradientPaint sunSet= new GradientPaint( new Color(7,11,20), 0, 2*HEIGHT/3, new Color(28, 44, 69));
        GradientPaint sunSet2= new GradientPaint(0, 2*HEIGHT/3, new Color(28,44,69), 0, HEIGHT, new Color(223, 169, 107));
        g.setPaint(sunSet);
        g.fil);
        int centery = HEIGHT/3 -50 + rand.next00);
        for(int i =0; i<100;i++){
          int clusterx = centerx + (int) (20*rand.nextGaussian());
          int clustery = centery + (int) (20*rand.nextGaussian());
          g.fill(new Rectangle2D.Double(clusterx,clustery, 1, 1));
        }
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
