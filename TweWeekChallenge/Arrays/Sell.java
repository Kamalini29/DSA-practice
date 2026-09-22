package TweWeekChallenge.Arrays;

public class Sell {
    public int[] bruteSell(int[] arr){
        int[] ans = {-1, -1};
        int tmax = 0;
        for(int i=0;i< arr.length; i++){
            int max = 0;
            for(int j =i+1; j<arr.length; j++){
                max = arr[j]-arr[i];
                if(max>tmax){
                    tmax = max;
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args){
        Sell s = new Sell();
        int[] arr = {1,5,2,10,3,12};
        int[] ans = s.bruteSell(arr);

        System.out.println("Buy index: " + ans[0]);
        System.out.println("Sell index: " + ans[1]);
    }
}
