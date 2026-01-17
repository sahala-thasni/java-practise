public class newPattern{
    public static void main(String args[]){
        int n=2;
        for(int i=n;i>=1;i--){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
            for(int s=1;s<=i;s++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int s=1;s<=i;s++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}