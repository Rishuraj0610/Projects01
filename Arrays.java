/*public class Arrays {
    public static void main(String[] args) {
        int marks[] = new int[21];
        marks[0] = 86;
        marks[1]= 54;
        marks[2] = 87;
        //System.out.println(marks[0]);
        //System.out.println(marks[1]);
        //System.out.println(marks[2]);


        for(int i = 0;i<3;i++){
            System.out.println(marks[i]);
        }
    }
}*/
import java.util.*;
public class Arrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        for(int i=0; i<size; i++){
            if(numbers[i] == x){
                System.out.println("x found at index :"+i);
            }
            
        }
    }
} 