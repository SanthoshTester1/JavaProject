package FAQ.Programs;

import java.util.Scanner;

class Numbersprint$0 {
    public static void main(String[] args){
        System.out.print("Enter a Number:- ");
        Scanner user = new Scanner(System.in);
        int Num = user.nextInt();
        for(int i = 1 ; i <= Num ; i++){
            System.out.print(i+" ");
        }
    }
}