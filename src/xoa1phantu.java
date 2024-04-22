import java.util.Arrays;

public class xoa1phantu {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] new_arr = new int[arr.length - 1];
        for (int i = 0; i < new_arr.length; i++) {
            new_arr[i] = arr[i];
        }
        System.out.println(Arrays.toString(new_arr));
    }
}





//        int [] array =new int[] {1,2,3,4,5,6};
//        int [] new_array = new int[array.length-1];
//        int j =4;
//        for (int i=0,k=0;i<array.length;i++) {
//            if (i!= j)
//            {
//                new_array[k] = array[i];
//                k++;
//            }
//        }
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(new_array));

