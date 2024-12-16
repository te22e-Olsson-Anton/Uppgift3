import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Hello32();
        printSquare(5);
        multi(5,9);
        RightTriangleArea(4,9);
        CircleArea(5);

        //GetNumberInput();

        GetChoice("Val1", "Val2", "Val3");
    }

    public static void Hello32()
    {
        for (int i = 0; i < 32; i++)
        {
            System.out.println("Hello World");
        }
    }

    public static void printSquare(int number)
    {
        int square = number * number;
        System.out.println("Kvadraten är " + square);
    }

    public static void multi(float number1, float number2)
    {
        float svar = number1 * number2;
        System.out.println("Multiplikationen är " +svar);
    }

    public static void RightTriangleArea(float bas, float höjd)
    {
        float svar = (bas*höjd)/2;
        System.out.println("Arean är " + svar);
    }

    public static void CircleArea(double radie)
    {
        double svar = (radie*radie)*3.14;
    }

    public static void GetNumberInput()
    {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;

        while (!validInput)
        {
            System.out.println("Skriv ett heltal");
            if(scanner.hasNextInt())
            {
                number = scanner.nextInt();
                validInput = true;
            }
            else
            {
                System.out.println("Fel skriv ett heltal");
                scanner.next();
            }


        }
    }

    public static void GetChoice(String val1, String val2, String val3)
    {
        Scanner scanner = new Scanner(System.in);

        boolean validInput = false;

        while (!validInput)
        {
            System.out.println("Välj ett alternativ");

            System.out.println("1." + val1);
            System.out.println("2." + val2);
            System.out.println("3." + val3);

            int val = scanner.nextInt();



            if (val >= 1 && val <= 3)
            {
                validInput = true;
            }
            else
            {
                System.out.println("fel");
                scanner.next();
            }

            if(val == 1)
            {
                System.out.println("Du valde Val1" + val1);
            }
            if(val == 2)
            {
                System.out.println("DU valde Val2" + val2);
            }
            if(val == 3)
            {
                System.out.println("Du valde val3" + val3);
            }

        }

    }


}