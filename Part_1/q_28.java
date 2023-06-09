package Part_1;

import java.util.Scanner;

public class q_28 {

    public static int hex_to_decimal(String s) {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }
        return val;
    }

    public static void main(String[] args) {
        String hexDec_num;
        int dec_num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a hexadecimal number: ");
        hexDec_num = sc.nextLine();

        dec_num = hex_to_decimal(hexDec_num);

        System.out.print("Equivalent decimal number is: " + dec_num + "\n");
    }
}
