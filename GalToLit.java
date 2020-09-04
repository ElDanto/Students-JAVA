
import java.util.Scanner;

class GalToLit {
    public static void main(String[] args) {
        double gallons;
        double liters;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите обЪем :");
        gallons = in.nextDouble();
        liters = gallons * 3.7854;
        System.out.printf(gallons + " галлонам соответствует: " + liters + " литра");
        in.close();
    }
} 
