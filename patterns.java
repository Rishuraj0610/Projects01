/*public class patterns{
    public static void main(String args[]){
        int n = 5;
        int m = 6;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=m; j++){
                System.out.print("*");
            }
           System.out.println();
        }
    }
}*/
                     //Hollow Patters
/*public class patterns{
    public static void main(String args[]){
        int n = 4;
        int m = 5;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=m; j++){
                if(i == 1|| j  == 1 || i == n || j == m){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

public class patterns{
    public static void main(String args[]){
        int n = 5;
        for(int i = n; i>=1; i--) {
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
             //Half pyramid

public class patterns{
    public static void main(String args[]){
        int n = 5;
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
                   //Inverted Half pyramid
public class patterns{
    public static void main(String args[]){
        int n = 5;
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=n-1; j++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

// inverted half pyramid with number

public class patterns{
    public static void main(String args[]){
        int n = 5;
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}*/

                        // Floyd's Triangle
public class patterns{
    public static void main(String args[]){
        int n = 5;
        int number = 1; 
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=i; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}