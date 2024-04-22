import java.util.Scanner;

public class songuyento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số vào để kiểm tra : ");
        int a = scanner.nextInt();
        if (a < 2){
            System.out.println("Không phải là số nguyên tố");
        }
        else {
            int b = 2;
            boolean check = true;
            while (b <= Math.sqrt(a)){
                if (a % b ==0){
                check = false;
                break;
            }
            a++;

            }
            if (check)
            System.out.println("Đây là số nguyên tố");

            else
                System.out.println("Không phải là số nguyên tố ");


        }
    }
}
