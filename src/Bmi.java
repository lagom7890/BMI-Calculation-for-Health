import java.util.Scanner;
public class Bmi {
    public static void main(String[] args){

        Scanner ip = new Scanner(System.in);
        
        System.out.print("please input your weight in kilograms: ");
        double weightInKilograms = ip.nextDouble();
        System.out.print("please input your height in meters: ");
        double heightInMeters = ip.nextDouble();

        double bmi = weightInKilograms/(heightInMeters*heightInMeters);

        //Underweight
        if (bmi < 18.5){
            System.out.printf("%f < 18.5 %n", bmi);
            System.out.println("You Are Underweight");
        }

        //Healthy
        else if (bmi <= 24.9){
            System.out.printf("18.5 <= %f <= 24.9 %n", bmi);
            System.out.println("You Are Healthy");
        }

        //Overweight
        else if (bmi <= 29.9){
            System.out.printf("25.0 <= %f <= 29.9 %n", bmi);
            System.out.println("You Are Overweight");
        }

        //Obesity
        else{
            System.out.printf("%f >= 30.0 %n", bmi);
            System.out.println("You Are Obesity");
        }

    }
}

