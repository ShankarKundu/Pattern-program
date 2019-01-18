import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your no");
        /****************
        *  1
        *  2 6
        *  3 7 10
        *  4 8 11 13
        *  5 9 12 14 15
        *****************/
       // new ParalalPrintUpToDown().process(sc.nextInt());
        /*
        Finish Above program5
         */
        //System.out.println("Enter your no");
        /****************
         *  0 0 0 0 0 0
         *  0 1 0 0 0 0
         *  0 0 2 0 0 0
         *  0 0 0 3 0 0
         *  0 0 0 0 4 0
         *  0 0 0 0 0 5
         *****************/
       // new EachPositionPrinting().process(sc.nextInt());

        /*********************
         *  1
         *  1 2 1
         *  1 2 3 2 1
         *  1 2 3 4 3 2 1
         *  1 2 3 4 5 4 3 2 1
         *********************/
        //new PrintReverseNo().Process(sc.nextInt());

        /*********************
         *  1 1 1 1 1 1 1
         *  1 1 1 1 1 2 2
         *  1 1 1 1 3 3 3
         *  1 1 1 4 4 4 4
         *  1 1 5 5 5 5 5
         *  1 6 6 6 6 6 6
         *  7 7 7 7 7 7 7
         *********************/
        new PrintGivenLoopNo().process(sc.nextInt());


    }
}
