
package atividade_praticapoo;

public class Retangulo {
  
    public void calcularArea(double largura, double altura){
        double area = largura*altura;
        System.out.printf("Area: " + area);
    }
    public void calcularPerimetro(double largura, double altura){
        double perimetro = ((largura*2)+(altura*2));
        System.out.printf("\nPerimetro: " + perimetro);
    }
    
    public static void main(String[] args) {
       Retangulo ret = new Retangulo();
       ret.calcularArea(10, 2);
       ret.calcularPerimetro(10, 2);
    }
}
