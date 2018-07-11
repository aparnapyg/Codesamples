package functionaltesting;

import java.util.Scanner;

public class ReverseNumber {
	public int reverse(int x) {
		int k = 0;
        k = Math.abs(x);

        int rem = 0;

        int sum = 0;
      

        while (k > 0){

            rem = k % 10;

            k = k/10;

            sum = rem + sum*10;

        }
        if(x > 0){
        return sum;
        }else{
        return -sum;
        }

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");

        int num = sc.nextInt();     

        ReverseNumber solObj = new ReverseNumber();
        System.out.println("The reversed number: "+solObj.reverse(num));
    }
}
