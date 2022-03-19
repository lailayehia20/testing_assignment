import java.util.Scanner;
public class WatermelonMain{
    public static String checker(){
        Scanner x = new Scanner(System.in);
        int w = x.nextInt();
        if (w<1 || w>100){
            return null;
        }
        //since odd numbers are equal to the summation between
        //any even number and odd number so they can't be divided into 2 even numbers
        if (w % 2 == 0 && w > 2) {
            return("yes");
        }
        else {
            return ("No");
        }
    }
}
