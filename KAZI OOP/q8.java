import java.util.Scanner;
class q8{
    public static void main(String[]args){
    Scanner in=new Scanner(System.in);

    long min,years,days;
    
    System.out.print("PLEASE ENTER THE MUNITES:");
    min=in.nextLong();
    days=min/1440;
    years=days/365;
    days=days%365;
    System.out.println(min+" Minutes is Approximatly to "+years+" years and "+days+" days");

    }
}