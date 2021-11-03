package CS203Course.Lab_4.Question_2;

public class ShapeTest {

    public static void main(String[] args) {

        Circle c = new Circle(4);
        Rectangle r = new Rectangle(4,3);

        ShowArea(c);
        ShowArea(r);

    }

    public static void ShowArea(Shape s){

        double area = s.area();
        System.out.println("The area of the shape is " + area);
    }
}
