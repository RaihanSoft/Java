package HackerRank;
import java.util.Scanner;
public class p2 {

        public static void main(String args[]) {
            Scanner in=new Scanner(System.in);
            int num;
            System.out.print("Enter a number: ");
            num=in.nextInt();
            System.out.println();
            for (int i=num;i>=1;i--){
                for (int j=num;j>=1;j--){
                    System.out.print(num*i*j+" ");
                }
                System.out.println();
            }
        }
    }
