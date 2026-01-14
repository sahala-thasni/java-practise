public class diamond{
    public static void main(String args[]){
        int n=4;
        for(int i=-n;i<=n;i++){
            for(int j=-n;j<=n;j++){
                if(Math.abs(i)+Math.abs(j)==n){
                    System.out.print("*");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }   
    }
}