import java.util.Scanner;
class q6{
    public static void main(String[]args){
        System.out.print("pleasse select your ");
        Scanner in=new Scanner(System.in); 
        
        System.out.print("enter your perfomance level");
        int perfomance=in.nextInt();
        System.out.print("enter your basic salary");
        double salary=in.nextDouble();
        if (perfomance >=90){
            salary+=salary * 0.03;
            System.out.print(salary); 
            
        }else{
            System.out.print(salary);
