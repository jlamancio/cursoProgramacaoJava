package cursoProgramacaoA222_A235Interfaces.application.program;

import cursoProgramacaoA222_A235Interfaces.model.entities.Circle;
import cursoProgramacaoA222_A235Interfaces.model.entities.Rectangle;
import cursoProgramacaoA222_A235Interfaces.model.entities.Shape;
import cursoProgramacaoA222_A235Interfaces.model.enums.Color;

public class mainProgramHerancaInterface {
    public static void main(String[] args) {
        Shape s1 = new Circle(Color.BLACK, 2.0);
        Shape s2 = new Rectangle(Color.BLACK, 3.0, 4.0);

        System.out.println("Circle color: " + s1.getColor());
        System.out.println("Circle area: " + String.format("%.3f", s1.area()));
        System.out.println("Rectangle color: " + s1.getColor());
        System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
    }
}
