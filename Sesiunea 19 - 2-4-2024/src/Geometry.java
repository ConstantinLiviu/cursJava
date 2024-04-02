import static java.lang.Math.PI;

public class Geometry {
    double area(double radiusParam) {
        return PI*radiusParam*radiusParam;
    }
    double area(double triangleBaseParam, double triangleHeightParam) {
        return triangleBaseParam*triangleHeightParam;
    }
    double area(int rectangleLengthParam, int rectangleBreadthParam) {
        return rectangleLengthParam*rectangleBreadthParam;
    }
}
