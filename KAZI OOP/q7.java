import java.util.Scanner;
class qn7{
    public static void main(String[]args){

        int number1,number2,number3,number4,LCM,HCF;

        Scanner scanner=new Scanner(System.in);
        Scanner in=new Scanner(System.in);

        


        System.out.print("enter the first number");
         number1=in.nextInt();
        System.out.print("enter the first number");
         number2=in.nextInt();
         scanner.close();

         number3=number1;
         number4=number2;

         while(number3 !=0){
             number3=number4;
             number4= number3 % number4;
        
         }
         HCF = number1;
         LCM = (number1 * number2)/HCF;
         System.out.println("HCF of the input numbers:"+HCF);
         System.out.println("LCM of the input numbers:"+LCM);
    }
}