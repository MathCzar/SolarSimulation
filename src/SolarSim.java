import peasy.PeasyCam;
import processing.core.PApplet;
import queasycam.QueasyCam;

public class SolarSim extends PApplet {

    QueasyCam cam;

    SolarSystem solarSystem;

    public static void main(String[] args) {

        PApplet.main("SolarSim");

    }

    public void settings() {

        size(800, 800, P3D);

    }

    public void setup() {

        //set up cam
        cam = new QueasyCam(this);

        //modify render distance
        perspective(PI/3f,width/(float)height, 0.01f, 100000);

        //create our solar system
        this.solarSystem = new SolarSystem(this);

    }

    public void draw() {

        background(0);

        this.solarSystem.draw(this);

    }

}
