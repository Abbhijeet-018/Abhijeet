
import java.util.*;
public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number Whose table you want to print");
        int num = sc.nextInt();
        System.out.println("Enter upto how many multiple of the number you want");
        int mult = sc.nextInt();
        for (int i =1;i<=mult;i++){
            System.out.println(num+" * "+i+" = " +num*i);
        }
    }
}