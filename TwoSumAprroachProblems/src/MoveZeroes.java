public class MoveZeroes {
    public static void moveZeroes(int[] arr) {

        int n = arr.length;

        int j = -1;

        // First zero find karo
        for (int i = 0; i < n; i++) {

            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        // Zero nahi hai
        if (j == -1) {
            return;
        }

        // First zero ke baad scan karo
        for (int i = j + 1; i < n; i++) {

            if (arr[i] != 0) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {0, 1, 0, 3, 12};

        moveZeroes(arr);

        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
