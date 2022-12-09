import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Q:store a roll number
//        int a = 90;
//
//        //Q: store a person's name
//        String name = "Sumit Maharjan";

        //Q: store 5 roll numbers

        Scanner in = new Scanner(System.in);
            // Array of primitives
        int[] arr = new int[5];
//        arr[0] = 23;
//        arr[1] = 32;
//        arr[2] = 54;
//        arr[3] = 533;
//        arr[4] = 854;
//        // [23, 32, 54, 533, 854]
//        System.out.println(arr[4]); // 854

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//
//        }
//
//        System.out.println(Arrays.toString(arr));       // Best way tp print array

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        for(int num : arr){                 // (Enhanced for loop) for every element of the array, print the element
//            System.out.print(num + " ");    //num represents element of the array
//        }


        // array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

    }
}