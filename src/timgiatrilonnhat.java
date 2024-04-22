public class timgiatrilonnhat {
    public static void main(String[] args) {
        int[] arr = {1, 9, 6, 45, 34, 15, 99};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}
