import javax.swing.*;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        ArrayList<GeometricShape> list = new ArrayList<>();
        while(true) {
            int[] sides = userInput();
            showUserInputs(sides, list);
            int stop = Integer.parseInt(JOptionPane.showInputDialog("1. Done \n 2. continue"));
            if (stop == 1)
                break;
            else
                continue;

        }

        if(!list.isEmpty()){
            GeometricShape min = list.get(0);
            GeometricShape max = list.get(0);

            for (int i = 0; i < list.size(); i++){
                GeometricShape current = list.get(i);
                int a = Double.compare(min.getArea(), current.getArea());
                if(a > 0) min = current;

                int b = Double.compare(max.getArea(), current.getArea());
                if(b < 0) max = current;
            }

            JOptionPane.showMessageDialog(null, "Smallest area: " + min.getArea() );
            JOptionPane.showMessageDialog(null, "Biggest area: " + max.getArea() );
        }
    }
    


    public static int[] userInput(){
        String userInput = JOptionPane.showInputDialog("prompt sides \n (If you have 1, type only 1 side. If you have 2, type 2 sides with space): \n" +
                "1 - square or circle\n" +
                "2 - rectangle\n" +
                "3 - triangle\n");

        String[] userSides = userInput.split(" ");
        int[] sides = new int[userSides.length];
        for (int i = 0; i < sides.length; i++) {
            sides[i] = Integer.parseInt(userSides[i]);
        }

        return sides;
    }

    public static void showUserInputs(int[] sides, ArrayList<GeometricShape> list) {
            String m;
            switch (sides.length) {
                case 1:
                    int section = Integer.parseInt(JOptionPane.showInputDialog("Which one? \n1. Circle \n 2. Square"));
                    if(section == 1) {
                        Circle circle = new Circle(sides[0]);
                        m = "||circle radius: " + sides[0] + "\n Area: " + circle.getArea();
                        list.add(circle);

                    } else{
                        Square square = new Square(sides[0]);
                        m = "||square side: " + sides[0] + "\n ||area: " + square.getArea();
                        list.add(square);
                    }
                    break;

                case 2:
                    Rectangle rectangle = new Rectangle(sides[0], sides[1]);
                    m = "||rectangle first side: " + sides[0] + " \n||rectangle second side: " + sides[1]+
                    "\n|| area: " + rectangle.getArea();
                    list.add(rectangle);
                    break;

                case 3:
                    Triangle triangle = new Triangle(sides[0], sides[1], sides[2]);
                    m = "||triangles first side: " + sides[0] + " \n||rectangle second side: " + sides[1] + " \n||rectangle third side: " + sides[2] +
                    "\n|| area: " + triangle.getArea();
                    list.add(triangle);
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + sides.length);
            }

            JOptionPane.showMessageDialog(null, m);
        }
    }
