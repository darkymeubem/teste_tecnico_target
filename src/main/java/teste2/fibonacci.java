package teste2;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int a1 = 0, a2 = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite até qual número da sequencia de fibonacci voce deseja ver: ");
        int num = sc.nextInt();
        int a3 = 1;

        for(int a =0; a < num; a++)
        {

            System.out.printf("a%d = %d\n",a+1,a3);
            a3 = a1 + a2;
            a1 = a2;
            a2 = a3;
        }
    }
}
