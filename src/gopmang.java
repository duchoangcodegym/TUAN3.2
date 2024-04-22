import java.util.Arrays;

public class gopmang {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,7};
        int []arr2 = {9,8,6,5};
        int[]arr3 =new int[arr1.length+ arr2.length];
//        int index =0;
        for (int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
//            index++;
        }
        System.out.println(Arrays.toString(arr3));
        for (int i=0;i<arr2.length;i++){
            arr3[i + arr1.length]=arr2[i];
//            index++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
