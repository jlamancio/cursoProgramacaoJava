package cursoProgramacaoA236_A249GenericsSetMap.application;

import cursoProgramacaoA236_A249GenericsSetMap.entities.Circle;
import cursoProgramacaoA236_A249GenericsSetMap.entities.Rectangle;
import cursoProgramacaoA236_A249GenericsSetMap.entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class mainProgram_6 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.00));
        myCircles.add(new Circle(3.00));
        System.out.println("Total area: " + totalArea(myCircles));
//        System.out.println("Total area: " + totalArea(myShapes));
    }
    public static double totalArea(List<? extends Shape> list){
        double sum = 0.0;
        for (Shape s : list){
            sum += s.area();
        }
        return sum;
    }
}
