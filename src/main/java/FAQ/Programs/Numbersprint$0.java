package FAQ.Programs;
<<<<<<< HEAD:src/main/java/FAQ/Programs/Numbersprint$0.java
=======
import java.util.Scanner;
>>>>>>> 036ed44c5ac3a4135078d79985f8d9b9bd0c7784:src/main/java/FAQ/Programs/SampleFIle$0.java

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