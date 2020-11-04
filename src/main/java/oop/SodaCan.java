package oop;

public class SodaCan {

    // Instance variables (or fields) are normally private
    private int height;
    private int radius;
    private double surfaceArea;
    private double volume;

    // Constructors - are called to initialize fields during object creation
    public SodaCan(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    // The "no-argument" (default) constructor
    public SodaCan()
    {
        height = 0;
        radius = 0;
    }
    // Instance Methods
    // Getter methods (Accessors)

    public int getHeight() { return this.height; }
    public int getRadius() { return this.radius; }

    // Setter methods (Mutators)
    public void setHeight(int height) { this.height = height; }
    public void setRadius(int radius) { this.radius = radius; }

    public double getSurfaceArea(int height, int radius){
        surfaceArea = (2 * 3.14 * (this.radius * this.height)) + (2 * 3.14 * (this.radius * this.radius));
        return surfaceArea;
    }

    public double getVolume(){
        volume = this.height * (3.14 * (this.radius*this.radius));
        return volume;
    }
    //TODO
    // see P8.5 for class requirements
}
