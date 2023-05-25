
package sum.of.odd.numbers;

import java.util.Scanner;

public class SumOfOddNumbers {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter a number: ");
        int number=scan.nextInt();
        int sum=0;
        for (int i = 0; i <=number; i++) {
            if(i%2==1){
                sum+=i;
            }
        }

        System.out.printf("sum of odd numbers=%s",sum);
    }
    
}
