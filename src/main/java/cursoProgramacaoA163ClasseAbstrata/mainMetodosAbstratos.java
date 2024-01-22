package cursoProgramacaoA163ClasseAbstrata;


import cursoProgramacaoA163ClasseAbstrata.entities.Circle;
import cursoProgramacaoA163ClasseAbstrata.entities.Rectangle;
import cursoProgramacaoA163ClasseAbstrata.entities.Shape;
import cursoProgramacaoA163ClasseAbstrata.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class mainMetodosAbstratos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shape :");
        int n = scanner.nextInt();

        for (int i=1; i <=n; i++){
            System.out.println("Shape #" + i + " data :  ");
            System.out.print("Rectangle or Circle (r/c) ");
            char ch = scanner.next().charAt(0);
            System.out.println(ch);
            System.out.println("Color : (BLACK/BLUE/RED");
            Color color = Color.valueOf(scanner.next());
            System.out.println(color);

            if (ch == 'r'){
                System.out.println("Width : ");
                double width = scanner.nextDouble();
                System.out.println("Height : ");
                double height = scanner.nextDouble();
                list.add(new Rectangle(color, width, height));
            }
            else{
                System.out.println("Radius :");
                double radius = scanner.nextDouble();
                list.add(new Circle(color, radius));
            }

            System.out.println();
            System.out.println("SHAPE AREAS : ");
            for (Shape shape : list){
                System.out.printf(String.format("%.2f", shape.area()));
            }

        }


        scanner.close();




    }
}
