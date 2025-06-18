public class App {
    public static void main(String[] args) throws Exception {
        int n=5;
        for (int i = 1; i <=n ; i++) {
            for(int j = 1;j<=n;j++){
                int a=j;
                if(i==j ){
                    System.out.print("*");
                }
                else if (j==i+2) {
                 System.out.print("*");   
                }
                else{
                    System.err.print(" ");
                }
            }
            System.out.println();
        }
    }
}
