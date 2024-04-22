import java.util.Scanner;

public class inrahinh {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1.Hình chữ nhật");
        System.out.println("2.Hình tam giác vuông");
        System.out.println("3.Hình tam giác cân");
        System.out.println("4.Thoát");
        System.out.println("Mời bạn chọn : ");

  Scanner scanner = new Scanner(System.in);
int mane =scanner.nextInt();
switch (mane){
    case 1 :
        for (int a =0 ; a < 5 ; a++){
            for (int b =0 ;b < 10;b++){
                System.out.print("* ");
            }
            System.out.println();
        }
        break;
    case 2 :
        for (int a = 0 ;a <8;a++ ){
            for (int b =7 ; b>= a ;b--){
                System.out.print("* ");
            }
            System.out.println();
        }
        break;
    case 3:
        for (int a =7;a>=1;a--){
            for (int b = a;b < 7; b++){
                System.out.print(" ");
            }
            for (int c = 0; c < (2*a-1); c++){
                System.out.print("*");
            }
            System.out.println();
        }


        }
    }
}
