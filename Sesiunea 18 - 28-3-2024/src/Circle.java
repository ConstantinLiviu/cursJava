
public class Circle {

    private double radius = 1;

    Circle() {

    };

    Circle(double radius) {
        this.radius = radius;
    }

    double getArea(double radius) {
      return radius*radius*Math.PI;
    };

    double getCircumference(double radius) {
        return 2*Math.PI*radius;
    }
}
