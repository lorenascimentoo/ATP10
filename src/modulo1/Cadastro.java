package modulo1;

import java.util.Scanner;

/**
 * Cadastro
 */
public class Cadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========== VERIFICAÇÃO DA IDADE ==========");

        System.out.print("Informe sua idade: ");
        Byte idade = Byte.parseByte(sc.nextLine());

        if (idade < 0) {
            System.out.println("Idade inválida!");
            System.out.println("Valor informado menor que zero!");
        } else if (idade < 25) {
            System.out.println("Sua idade é menor que 25 anos!");
        } else if (idade == 25) {
            System.out.println("Sua idade é 25 anos!");
        } else {
            System.out.println("Sua idade é maior que 25 anos!");
        }
    }

}