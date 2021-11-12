import java.util.scanner; 
class q4{
public static void main(String[]args){

    scanner car = new scanner(System.in);
    System.out.print("Enter the number of gallons in gas of car");

    double GasInTank = car.nextDouble();
    System.out.print("Enter the number of  miles per gallons");
    double MilesPergaloons = car.nextdouble();

    system.out.print("Enter price of gas per gallons");

    double Price = car.nextdouble();
    double Distance = MilesPergaloons * GasInTank
    System.out.print("The distance tha the car can travels");
    double cost = (250/MilesPergaloons) * price;
    System.out.print("The cost of travelling250 miles withcar");
}
}