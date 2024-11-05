import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("параллелепипед или цилиндр ");
        String shape = scanner.nextLine();

        try {
            if (shape.equalsIgnoreCase("параллелепипед")) {
                System.out.print("длина: ");
                double length = scanner.nextDouble();
                System.out.print("ширина: ");
                double width = scanner.nextDouble();
                System.out.print("высота: ");
                double height = scanner.nextDouble();

                if (length < 0 || width < 0 || height < 0)
                    throw new IllegalArgumentException("тут отрицательные числа.");

                Parallelepiped parallelepiped = new Parallelepiped(length, width, height);
                System.out.println(parallelepiped);

            } else if (shape.equalsIgnoreCase("цилиндр")) {
                System.out.print("радиус: ");
                double radius = scanner.nextDouble();
                System.out.print("высота: ");
                double height = scanner.nextDouble();

                if (radius < 0 || height < 0)
                    throw new IllegalArgumentException(" тут отрицательные числа");

                Cylinder cylinder = new Cylinder(radius, height);
                System.out.println(cylinder);

            } else {
                System.out.println("Неверный выбор фигуры.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());


        }

    }

}


