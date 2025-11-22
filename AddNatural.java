// public interface AddNatural {
//     public static void main(String args[]){

//         int n = 5;
//         int sum = 0;
//         for(int i =0; i<=n; i++){
//             sum+=i;
//         }
//         System.out.println(sum);
//     }
    
// }
import java.util.*;
public interface AddNatural {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i =0; i<=n; i++){
            sum+=i;
        }
        System.out.println(sum);
    }
    
}