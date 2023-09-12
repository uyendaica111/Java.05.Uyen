package BTVN4;

public class TestCircle {
    private double radius = 1.0;
    private String color = "red";
// hàm
    public TestCircle() {
    }

    public TestCircle(double radius) {
        this.radius = radius;
    }
// method
    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return 7.12; //k rõ kết quả
    }
}
