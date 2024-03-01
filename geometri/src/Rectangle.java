public class Rectangle extends GeometricShape {
    double lenght;
    double width;

    Rectangle(double lenght, double width){
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    public double getArea() {
        double area = lenght * width;
        return area;
    }
}