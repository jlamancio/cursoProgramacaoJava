package cursoProgramacaoA61_A72IntroOOP.entities;

public class Triangle {
    public double a, b, c;

    public double calcularAreaDoTriangulo(){
        double p = ( this.a + this.b + this.c) / 2.0;
        return Math.sqrt( p * (p - this.a ) * ( p - this.b ) * ( p - this.c ));
    }

}
