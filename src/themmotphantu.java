import java.util.Arrays;

public class themmotphantu {
    public static void main(String[] args) {
            int [] arr = new int[]{1,2,3,4,5,6};
            int [] new_arr = new int[arr.length+1];
            int index = 4;
            for (int i=0;i <= index-1;i++){
                new_arr[i]=arr[i];
            }

            new_arr[index]=8;
            for (int i =index+1;i<new_arr.length;i++) {
                new_arr[i] = arr[i - 1];
            }   
        for (int i=0;i<new_arr.length;i++){
            System.out.print(new_arr[i]+ " ");
        }
        }


    }




























//        int[] arr = new int[]{1, 5, 9, 7, 3};
//        int[] new_arr = new int[arr.length + 1];
//        int index = 3;
//        for (int i = 0; i < index -1; i++) {
//            new_arr[i] = arr[i];
//        }
//        System.out.println(Arrays.toString(new_arr));
//        new_arr[index]= 8;
//        for (int i=index+1; i<new_arr.length;i++){
//            new_arr[i]= arr[i-1];
//        }
//        System.out.println(Arrays.toString(new_arr));
//    }
