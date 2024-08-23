package entities.poo;

public class Rectangle {
    public double width;
    public double height;

    public double area(){
        return width * height;
    }
    public double perimeter(){
        return 2 * (width + height);
    }
    public  double diagonal(){
        double sum = (width * width) + (height*height);
        return Math.sqrt(sum);
    }
    public String toString(){
        return  "AREA = "
                + area() + "\n"
                + "Perimeter = "
                + perimeter() + "\n"
                + "Diagonal = "
                + diagonal() + "\n";
    }

}
