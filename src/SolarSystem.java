import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PShape;

public class SolarSystem {

    private Satellite sun, earth, mercury, venus, moon, mars, jupiter, saturn, uranus, neptune;

    private PShape stars;

    public SolarSystem(PApplet app) {

        //set up sun
        this.sun = new Satellite(app, 200, 0, 0.001f);
        try{

            PImage img = app.loadImage("res/Sun.jpg");
            img.resize(img.height/2, img.height/2);
            this.sun.setTexture(img);

        }catch(Exception e) {}

        //set up mercury
        this.mercury = new Satellite(app, 30, 400, 0.01f);
        try{

            PImage img = app.loadImage("res/Mercury.jpg");
            img.resize(img.height/2, img.height/2);
            this.mercury.setTexture(img);

        }catch(Exception e) {}
        this.sun.children.add(this.mercury);

        //set up venus
        this.venus = new Satellite(app, 45, 800, 0.0075f);
        try{

            PImage img = app.loadImage("res/Venus.jpg");
            img.resize(img.height/2, img.height/2);
            this.venus.setTexture(img);

        }catch(Exception e) {}
        this.sun.children.add(this.venus);

        //set up earth
        this.earth = new Satellite(app, 60, 1200, 0.005f);
        try{

            PImage img = app.loadImage("res/Earth.jpg");
            img.resize(img.height/2, img.height/2);
            this.earth.setTexture(img);

        }catch(Exception e) {}
        this.sun.children.add(this.earth);

        //set up moon
        this.moon = new Satellite(app, 30, 100, 0.01f);
        try{

            PImage img = app.loadImage("res/Moon.jpg");
            img.resize(img.height/2, img.height/2);
            this.moon.setTexture(img);

        }catch(Exception e) {}
        this.earth.children.add(this.moon);

        //set up mars
        this.mars = new Satellite(app, 50, 1600, 0.004f);
        try{

            PImage img = app.loadImage("res/Mars.jpg");
            img.resize(img.height/2, img.height/2);
            this.mars.setTexture(img);

        }catch(Exception e) {}
        this.sun.children.add(this.mars);

        //set up jupiter
        this.jupiter = new Satellite(app, 150, 2400, 0.003f);
        try{

            PImage img = app.loadImage("res/Jupiter.jpg");
            img.resize(img.height/2, img.height/2);
            this.jupiter.setTexture(img);

        }catch(Exception e) {}
        this.sun.children.add(this.jupiter);

        //set up saturn
        this.saturn = new Satellite(app, 120, 2800, 0.002f);
        try{

            PImage img = app.loadImage("res/Saturn.jpg");
            img.resize(img.height/2, img.height/2);
            this.saturn.setTexture(img);

        }catch(Exception e) {}
        this.sun.children.add(this.saturn);

        //set up uranus
        this.uranus = new Satellite(app, 110, 3200, 0.0015f);
        try{

            PImage img = app.loadImage("res/Uranus.jpg");
            img.resize(img.height/2, img.height/2);
            this.uranus.setTexture(img);

        }catch(Exception e) {}
        this.sun.children.add(this.uranus);

        //set up neptune
        this.neptune = new Satellite(app, 115, 3600, 0.001f);
        try{

            PImage img = app.loadImage("res/Neptune.jpg");
            img.resize(img.height/2, img.height/2);
            this.neptune.setTexture(img);

        }catch(Exception e) {}
        this.sun.children.add(this.neptune);

        //set up star background
        this.stars = app.createShape(app.SPHERE, 20000);
        this.stars.setStroke(false);
        try {

            PImage img = app.loadImage("res/Stars+MilkyWay.jpg");
            img.resize(img.width/2, img.height/2);
            this.stars.setTexture(app.loadImage("res/Stars+MilkyWay.jpg"));

        } catch(Exception e) { }

    }

    public void draw(PApplet app) {

        //draw our solar system
        sun.draw(app);

        app.shape(stars);

    }

}
