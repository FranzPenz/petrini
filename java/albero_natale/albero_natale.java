import java.awt.*;

public class albero_natale {
    public static void main(String[] args) {
        Frame frame = new Frame ("Albero di Natale");
        alberocanvas albero = new alberocanvas();

        frame.setSize(300, 300);
        frame.setLocation(100,100);
        frame.add(albero);
        frame.setVisible(true);
    }
}
