import processing.core.PApplet;
import processing.core.PImage;

public class boxblur extends PApplet {
    PImage image1, image2;
    int[] arr ={(-1-1920),-1920,(1-1920),-1,0,1,(-1+1920),1920,(1+1920)};
    int[][] mat={{1,1,1},{1,1,1},{1,1,1}};
    int n=3;
    float[][] r= new float[n][n];
    float[][] g= new float[n][n];
    float[][] b= new float[n][n];

    public static void main(String[] args) {
        PApplet.main("boxblur");

    }

    public void settings() {
        size(1920, 1080);
    }

    public void setup() {
        frameRate(1);
        background(0);
        image1 = loadImage("b.jpg");
        image2 = image1;
        image2.loadPixels();
        for (int x = 0; x<image2.width; x++){
            for (int y = 0; y<image2.height; y++){
                int i=x+y*image2.width;
                if (x>=1 & x<image2.width-1 & y>=1 & y<image2.height-1){
                    for (int j=0;j<arr.length;j++){
                        for (int k=0; k<n;k++){
                            for (int l=0;l<n;l++){
                                r[k][l]=red(image2.pixels[i+j]);
                                g[k][l]=green(image2.pixels[i+j]);
                                b[k][l]=blue(image2.pixels[i+j]);

                            }
                        }
                    }
                }
                image2.pixels[i]=color(matmul.matmul(r,mat,n),matmul.matmul(g,mat,n),matmul.matmul(b,mat,n));
            }
        }

    }

    public void draw() {

        image2.updatePixels();
        image(image2, 0, 0);
    }
}
