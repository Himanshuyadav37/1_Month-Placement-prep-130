public class SuffixSum {

    public static void suffixSum(int[] arr){
        int[] suffix = new int[arr.length];

        suffix[arr.length-1] = arr[0];

        for(int i = arr.length-2 ; i >= 0 ; i--){
            suffix[i] = suffix[i+1] + arr[i];
        }
        for(int x : suffix){
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args){
        int[] arr = {2,4,1,3,5};

        suffixSum(arr);
    }
}
