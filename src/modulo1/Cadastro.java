package modulo1;

import java.util.Scanner;

/**
 * Cadastro
 */
public class Cadastro {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("========== VERIFICAÇÃO DA IDADE ==========");

            Byte idade;

            do{
                System.out.print("Informe sua idade: ");
                idade = Byte.parseByte(sc.nextLine());

                if(idade<0){
                    System.out.println("Não aceito valor menor que zero!");
                }
            } while(idade<0);
            
            if(idade <25){
                System.out.println("Sua idade é menor que 25 anos!");
            } else if(idade==25){
                System.out.println("Sua idade é 25 anos!");
            } else {
                System.out.println("Sua idade é maior que 25 anos!");
            }
        }
    
}