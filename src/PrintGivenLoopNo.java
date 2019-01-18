public class PrintGivenLoopNo {


    public void process(int no) {

        for(int i=1;i<=no;i++) {
            for (int j = 1; j <= no; j++) {
                if (j > (no - i)) {
                    System.out.print( i + " " );
                } else {
                    System.out.print( 1 + " " );
                }
            }

            System.out.println( );
        }
    }
}
