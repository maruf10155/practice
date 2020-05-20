import processing.core.PApplet;
import processing.core.PImage;

public class reducedcolor extends PApplet {
    PImage image1,image2;
    String dest="creducedcolor.jpg";
    public static void main(String[] args) {
        PApplet.main("reducedcolor");

    }
    public void settings(){
        size(1920,1080);
    }
    public void setup(){
        frameRate(1);
        background(0);
        image1 =loadImage("c.jpg");
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
                int factor=15;
                r=round(factor*r/255)*(255/factor);
                g=round(factor*g/255)*(255/factor);
                b=round(factor*b/255)*(255/factor);
                image2.pixels[i]=color(r,g,b);
            }
        }
        image2.updatePixels();
        image(image2,0,0);
        saveFrame(dest);
    }
}