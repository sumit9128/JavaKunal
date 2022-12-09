public class RichestCustomer {
    public static void main(String[] args) {

    }

    static int maxWealth(int[][] accounts){
        //person = row
        //bankAccount = col
        int ans = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            // When you start a new col, take a new sum for that row.
            int sum = 0;
            for (int bankAccount : account) {
                sum += bankAccount;
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }

        }
        return ans;

    }

}
