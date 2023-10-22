import java.util.Scanner;
public class CtoFConverter

{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String trash = "";
        Boolean done = false;


        do
        {
            System.out.print("Enter Temperature in Celcius: ");
            if (in.hasNextDouble())
            {

                double cel = in.nextDouble();
                double fahren = ((cel * 9/5) + 32);
                System.out.println("Your temperature in Fahrenheit: " + fahren);
                done = true;
            }
            else
            {
            trash = in.nextLine();
            System.out.println("You entered an invalid statement: " + trash);
            System.out.println("Try again");
            }

        }while(!done);

    }
}
