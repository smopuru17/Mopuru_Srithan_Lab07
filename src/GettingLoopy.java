public class GettingLoopy
{
    public static void main(String[] args)
    {

        for (int count =0; count <= 30; count++)
        {
            System.out.print(count + " ");
        }

        System.out.println(" ");

        for (int count1 = 30; count1 >= 0; count1-- )
        {
            System.out.print(count1 + " ");
        }

        System.out.println(" ");

        for (int count2 = 0; count2 <= 18; count2 += 3 )
        {
            System.out.print(count2 + " ");
        }

        System.out.println(" ");

        for (int count3 = 10; count3 >= 0; count3 -= 2 )
        {
            System.out.print(count3 + " ");
        }

        System.out.println(" ");

        for (int row = 0; row < 6; row++)
        {
            System.out.println(" ");
            for (int col = 0; col < row; col++)
            {

                System.out.print("*");

            }
        }

        System.out.println(" ");

        for (int row = 5; row > 0; row--)
        {
            System.out.println(" ");
            for (int col = row; col > 0; col--)
            {

                System.out.print("*");

            }
        }

        System.out.println(" ");

        for (int row = 0; row < 5; row++)
        {
            System.out.println(" ");
            for (int col = 0; col < 5; col++)
            {

                System.out.print("*");

            }
        }

    }
}
