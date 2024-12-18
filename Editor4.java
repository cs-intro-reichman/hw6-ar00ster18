import java.awt.Color;
public class Editor4 {
    public static void main(String[] args) {
        String fileName = args[0];
        int n = Integer.parseInt(args[1]);

        Color[][] original = Runigram.read(fileName);
        Color[][] gray = Runigram.grayScaled(original);
        
        Runigram.setCanvas(original);
        Runigram.morph(original, gray, n);
    }
}
