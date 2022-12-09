import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExp {
    public static void main(String[] args) {
        // Syntax
        ArrayList <Integer> list = new ArrayList<>(10);

//        list.add(67);
//        list.add(6457);
//        list.add(65);
//        list.add(68);
//        list.add(89);
//        list.add(75);
//        list.add(53);
//        list.add(24);
//        list.add(35);
//
//        System.out.println(list.contains(6457));
//
//        list.set(0, 99);
//
//        System.out.println(list);
//

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        //get item at index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));    //pass idex here, list[index] syntax will not work for ArrayList
        }

                // OR
        for (int i : list){
            System.out.print(i + " ");
        }

    }
}
