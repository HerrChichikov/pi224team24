package laba4;

public abstract class Calculation {
private double square;
private double height;
public double getSquare() {
return square;
}
public void setSquare(double square) {
this.square = square;
}
public double getHeight() {
return height;
}
public void setHeight(double height) {
this.height = height;
}

public abstract double calculate(double a, double b);
}