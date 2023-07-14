import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        homework version

        String enterNumber; // M CM XC IV 1994
        char[] rome = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] arabic = {1, 5, 10, 50, 100, 500, 1000};

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the rome number");
            enterNumber = scanner.nextLine();
        } while (enterNumber.length() == 0);

        char[] sArray = enterNumber.toCharArray();


        int[] sToIntArray = new int[sArray.length];

        for (int i = 0; i < 7; i++) {
            for (int ii = 0; ii < sArray.length; ii++) {
                if (sArray [ii] == rome [i]) {
                    sToIntArray [ii] = arabic [i];
                }
            }
        }
        int[] newArray = new int[sToIntArray.length + 1];
        System.arraycopy(sToIntArray, 0, newArray, 0, sToIntArray.length);
        sToIntArray = newArray;
        sToIntArray[sToIntArray.length - 1] = 0;


        int finalNumber = 0;
        int i = 0;
        do {
            if (sToIntArray[i] - sToIntArray[i + 1] < 0) {
                finalNumber = finalNumber + ((sToIntArray[i] - sToIntArray[i + 1]) * -1);
                i++;
            }
            else finalNumber = finalNumber + sToIntArray[i];
            i++;
        } while (i < sToIntArray.length - 1);
        System.out.println(finalNumber);
    }
}