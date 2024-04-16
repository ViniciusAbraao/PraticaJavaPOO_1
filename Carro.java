package atividade_praticapoo;


public class Carro {

    String marca;
    String modelo;
    int ano;
    String cor;
    int velocidade;

    public void ligarMotor() {
        System.out.println("Motor ligado.");
    }

    public void desligarMotor() {
        System.out.println("Motor desligado.");
        velocidade = 0;
    }

    public void acelerar(int velocidade) {
        if (velocidade < 0) {
            System.out.println("A velocidade deve ser um valor positivo.");
        } else {
            this.velocidade += velocidade;
        }
    }

    public void frear() {
        if (velocidade <= 0) {
            System.out.println("O carro já está parado.");
        } else {
            this.velocidade -= 10;
        }
    }

    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.marca = "Fiat";
        carro.modelo = "Palio";
        carro.ano = 1993;
        carro.cor = "Prata";
        carro.velocidade = 0;

        carro.ligarMotor();
        carro.acelerar(50);
        System.out.println("Velocidade Inicial: " + carro.velocidade);

        carro.frear();
        System.out.println("Velocidade Final: " + carro.velocidade);

        carro.desligarMotor();
    }
}
