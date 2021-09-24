package modulo1;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("========== VERIFICAÇÃO DO SALÁRIO ==========");

            double salario;

            do{
                System.out.print("Informe seu salario: ");
                salario = Double.parseDouble(sc.nextLine());

                if(salario<=0){
                    System.out.println("Salário Inválido! Não aceito valor menor ou igual a zero!");
                }
            } while(salario<=0);
            
            
            if(salario >1997.58 && salario<5399.99){
                System.out.println("Seu salário está entre R$ 1.997,58 e R$5.399,99!");
            } else if(salario == 1997.58){
                System.out.println("Seu salário é R$1.997,58!");
            } else if(salario>5399.99){
                System.out.println("Seu salário é maior que R$5.399,99!");
            } else if(salario == 5399.99){
                System.out.println("Seu salário é R$5.399,99!");
            } else{
                System.out.println("Seu salário é menor que R$ 1.997,58!");
            }
        }
}
