public class EachPositionPrinting {


    public void process(int no) {
    for(int i=0;i<=no;i++){
        for(int j=0;j<=no;j++){
            if(i==j){
                System.out.print(i+" ");
            }
            else
                System.out.print(0+" ");

        }
        System.out.println();

    }

    }
}
