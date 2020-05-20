import processing.core.PApplet;
import processing.core.PImage;

public class gray2 extends PApplet {
    PImage image1,image2;
    String dest="bweight.jpg";
    public static void main(String[] args) {
        PApplet.main("gray2");
    }
    public void settings(){
        size(1920,1080);
    }
    public void setup(){
        frameRate(1);
        image1 =loadImage("b.jpg");
        image2=createImage(1920,1080,RGB);
    }
    public void draw(){
        image1.loadPixels();
        image2.loadPixels();
        for (int x=0; x<image1.width;x++){
            for(int y=0;y<image1.height;y++){
                int i=x+y*image1.width;
                float r=red(image1.pixels[i]);
                float g=green(image1.pixels[i]);
                float b=blue(image1.pixels[i]);
                image2.pixels[i]=color((float) (0.3*r+0.59*g+0.11*b));
            }
        }
        image2.updatePixels();
        image(image2,0,0);
        saveFrame(dest);
    }
}
