public class ParalalPrintUpToDown {

    public void process(int no) {

        for(int i=1;i<=no;i++){
            int k=i;
            int actualadd=no-1;
            for(int j=1;j<=i;j++){
              if(j>1){
                  k+=actualadd;
                  System.out.print(k+" ");
                  actualadd--;
              }
              else {
                  System.out.print( i + " " );
              }
            }
            System.out.println();
        }
    }
}
