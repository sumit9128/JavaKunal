public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 87, 5, 77};
        System.out.println(max(arr));
    }

    static int max(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max ){
                max = arr[i];
            }
        }
        return max;
    }
}
