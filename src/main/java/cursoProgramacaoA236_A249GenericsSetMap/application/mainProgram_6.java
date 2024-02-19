package cursoProgramacaoA236_A249GenericsSetMap.application;

import cursoProgramacaoA236_A249GenericsSetMap.entities.Circle;
import cursoProgramacaoA236_A249GenericsSetMap.entities.Rectangle;
import cursoProgramacaoA236_A249GenericsSetMap.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class mainProgram_6 {
    public static void main(String[] args) {

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        System.out.println("Total area: " + totalArea(myShapes));
    }
    public static double totalArea(List<Shape> list){
        double sum = 0.0;
        for (Shape s : list){
            sum += s.area();
        }
        return sum;
    }
}
