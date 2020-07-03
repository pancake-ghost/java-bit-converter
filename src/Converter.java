import java.util.ArrayList;
import java.util.Scanner;

/** Will turn input int to binary and binary into int
 * @author pancake ghost
 */


public class Converter {

    //TODO 1- Do with decimal places
    //     2- DO with negatives

    static int getNumber() {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        return number;
    }

    static void convertToBinary() {
        int num = getNumber();
        int remainder;
        String binary = "";

        if(num == 0) {
            System.out.println(0);
        }else {
            while(num > 0) {
                remainder = num % 2;
                num = num/2;
                binary = remainder + binary;
            }
            System.out.println(binary);
        }
    }

    static void convertToDecimal() {
        int num = getNumber();
        ArrayList<Integer> binary = new ArrayList<>();
        int decimal = 0;

        while(num > 0) {
            binary.add(num % 10);
            num = num / 10;
        }

        for(int i = 0; i < binary.size(); i ++) {
            decimal = decimal + (int) Math.pow(2,i) * binary.get(i);
        }

        System.out.println(decimal);
    }


    public static void main(String[] args) {
        //choose option
        System.out.println("Please, choose your converter setting:");
        System.out.println("1. Convert to Binary");
        System.out.println("2. Convert to Decimal");

        Scanner option = new Scanner(System.in);
        int choice = option.nextInt();

        if(choice == 1) {
            System.out.println("Convert to Binary: ");
            convertToBinary();
        }else if(choice == 2) {
            System.out.println("Convert to Decimal");
            convertToDecimal();
        }else {
            System.out.println("Invalid input");
        }

    }
}

