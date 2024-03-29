package cursoProgramacaoA222_A235Interfaces.model.entities;

import cursoProgramacaoA222_A235Interfaces.model.enums.Color;

public class Rectangle extends AbstractShape {
    private Double width, height;
    public Rectangle (Color color, Double width, Double height){
        super(color);
        this.width = width;
        this.height = height;
    }
    public Double getWidth(){
        return width;
    }
    public void setWidth(Double width){
        this.width = width;
    }
    public Double getHeight(){
        return height;
    }
    public void setHeight(Double height){
        this.width = height;
    }
    @Override
    public double area(){
        return width * height;
    }
}
