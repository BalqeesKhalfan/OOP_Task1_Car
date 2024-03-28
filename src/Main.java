import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        Car car=new Car();
        System.out.println("Enter Company that Make Car:");
        String make=sr.nextLine();
        System.out.println("Enter Model :");
        String model=sr.nextLine();
        System.out.println("Enter year:");
        Integer year=sr.nextInt();
        // setting values enterd by user to all attributes of car calss
        car.setMake(make);
        car.setModel(model);
        car.setYear(year);
        //Acess to car attrebutes by printing the values that get from user
        System.out.println("Maked by  Company "+car.getMake());
        System.out.println("Model  "+car.getModel());
        System.out.println("Year  "+car.getYear());


    }
}