import java.util.Enumeration;

public class nguyetonhohon100 {
    public static void main(String[] args) {

        int number =2;
        while (number < 100){
         if (chekPrime(number)){
             System.out.println( number);
         }
         number++;
        }

    }
         public static boolean chekPrime(int number){
             if (number < 2){
                 return false;
             }
             for (int i = 2; i < number - 1 ;i++){
                 if (number%i ==0){
                     return false;
                 }

             }
return true;
         }
}

