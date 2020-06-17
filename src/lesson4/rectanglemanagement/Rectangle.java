package lesson4.rectanglemanagement;

public class Rectangle {
    private float width, height;

    //initialization
    protected Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        this(0F, 0F);
    }

    //setters
    public void setHeight(float height) {
        this.height = height;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    //getters
    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    // calculate Perimeter
    public float calP() {
        return (float) (2F * (width + height));
    }

    // calculate area
    public float calS() {

        //System.out.println((double)width+ " " + (double)height);
        return  (width *  height);
    }
    // print witdth and height
    public void writeWandH() {
        System.out.println("Width: " + width );
        System.out.println("Heigh: " + height);
    }
    // check whether rectangle is square or not
    public boolean check() {
        if (width == height)
            return true;
        else
            return false;
    }
}
