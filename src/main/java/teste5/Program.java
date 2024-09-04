package teste5;

import java.util.Scanner;

public class Program {


    public static void main(String[] args) {
        Dominio program = new Dominio();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a palavra que deseja inverter: ");
        String str = sc.nextLine();
        System.out.println("A palavra invertida é " + program.inverteString(str) );
    }
}
