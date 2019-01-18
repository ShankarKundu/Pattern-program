public class PrintReverseNo {

    public void Process(int no) {
        for(int i=1;i<=no;i++){
             int count=0;
            for(int j=1;j<=i;j++){
                System.out.print(j +" ");
                count++;
            }
            for(int k=1;k<=i-1;k++){
                count--;
                System.out.print(count+" ");
            }
            System.out.println();
        }


    }
}
