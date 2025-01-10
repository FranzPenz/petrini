import java.awt.*;

class alberocanvas extends Canvas{
    public void paint (Graphics g){

        //Foglie
        g.setColor(Color.green);
        g.fillPolygon(new int[]{100,150,50}, new int[]{50,100,100}, 3);
        g.fillPolygon(new int[]{100,150,50}, new int []{80,140,140},3);
        g.fillPolygon(new int[]{100,150,50}, new int []{120,180,180},3);

        //Tronco
        g.setColor(new Color(139,69,19));
        g.fillRect(90,180,20,30);

        //Stella
        g.setColor(Color.yellow);
        g.fillOval(90,35,20,20);
    }
}