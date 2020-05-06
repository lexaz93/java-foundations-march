package overload;

public class Pen {
    private String firma;
    private double size;

    public Pen() {
    }

    public Pen(String firma) {
        this.firma = firma;
    }

    public Pen(double size) {
        this.size = size;
    }

    public Pen(String firma, double size) {
        this(firma);
        this.size = size;
    }


    public void print() {
        System.out.println("Pen");
    }

    public void print(String owner) {
        System.out.println("Pen " + owner);
    }


}
