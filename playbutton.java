public class playButton{
    public static void main(String args[]){
        int n=7;
        int m=1;
        boolean k=false;
        for(int i=1;i<=n*2;i++){
            for(int s=0;s<n-m;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=m;j++){
                if((i+j)%2 ==0){
                    System.out.print("* ");
                }
                
            }
            if(m==n){
                k=true;
            }   
            if(k==false){
                    m++;
            }
            else{
                    m--;
            }
            System.out.println();
        }
    }
}