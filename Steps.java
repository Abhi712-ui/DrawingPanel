import Import.DrawingPanel;
import java.awt.*;

public class Steps {
    public static void main(String[] args){
        DrawingPanel A = new DrawingPanel(200, 150);
        Graphics B = A.getGraphics();
        A.setBackground(Color.CYAN);
        B.setColor(Color.WHITE);
        B.drawString("AS", 70, 55);

        int Xposition = 0; int Yposition = 0;
        int stairs = 14; 
        int height = 9; int width = 10;
        Color Brown = new Color(191, 118, 73);
        B.setColor(Brown);
        for(int i = 0; i <= stairs; i++){
            B.fillRect(Xposition, Yposition, width, height);
            Yposition += 10;
            width += 10;
        }
    }
}
