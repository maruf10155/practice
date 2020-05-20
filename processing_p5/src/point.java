import processing.core.PApplet;
import processing.core.PImage;

public class point extends PApplet {
    PImage image1, image2;
    String dest = "cdot.jpg";

    public static void main(String[] args) {
        PApplet.main("point");

    }

    public void settings() {
        size(1920, 1080);
    }

    public void setup() {
        frameRate(1);
        background(0);
        image1 = loadImage("c.jpg");
        image2 = createImage(1920, 1080, RGB);
//        image1.filter(GRAY);
    }

    int index(int x, int y) {
        return x + y * image1.width;
    }

    public void draw() {
        image1.loadPixels();
        for (int y = 0; y < image1.height - 1; y++) {
            for (int x = 1; x < image1.width - 1; x++) {
                int pix = image1.pixels[index(x, y)];
                float oldR = red(pix);
                float oldG = green(pix);
                float oldB = blue(pix);
                int factor = 3;
                int newR = round(factor * oldR / 255) * (255 / factor);
                int newG = round(factor * oldG / 255) * (255 / factor);
                int newB = round(factor * oldB / 255) * (255 / factor);
                image2.pixels[index(x, y)] = color(newR, newG, newB);

                float errR = oldR - newR;
                float errG = oldG - newG;
                float errB = oldB - newB;


                int index = index(x + 1, y);
                int c = image2.pixels[index];
                float r = red(c);
                float g = green(c);
                float b = blue(c);
                r = (float) (r + errR * 7 / 16.0);
                g = (float) (g + errG * 7 / 16.0);
                b = (float) (b + errB * 7 / 16.0);
                image2.pixels[index] = color(r, g, b);

                index = index(x - 1, y + 1);
                c = image2.pixels[index];
                r = red(c);
                g = green(c);
                b = blue(c);
                r = (float) (r + errR * 3 / 16.0);
                g = (float) (g + errG * 3 / 16.0);
                b = (float) (b + errB * 3 / 16.0);
                image2.pixels[index] = color(r, g, b);

                index = index(x, y + 1);
                c = image2.pixels[index];
                r = red(c);
                g = green(c);
                b = blue(c);
                r = (float) (r + errR * 5 / 16.0);
                g = (float) (g + errG * 5 / 16.0);
                b = (float) (b + errB * 5 / 16.0);
                image2.pixels[index] = color(r, g, b);


                index = index(x + 1, y + 1);
                c = image2.pixels[index];
                r = red(c);
                g = green(c);
                b = blue(c);
                r = (float) (r + errR * 1 / 16.0);
                g = (float) (g + errG * 1 / 16.0);
                b = (float) (b + errB * 1 / 16.0);
                image2.pixels[index] = color(r, g, b);
            }
        }
        image2.updatePixels();
        image(image2, 0, 0);
        saveFrame(dest);
    }
}