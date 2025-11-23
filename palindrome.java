// public class palindrome {
//     public static void main(String[]args){
//         String str = "madam";
//         String reversed = new StringBuilder(str).reverse().toString();
//         System.out.println(str.equals(reversed));
//     }
    
// }



import java.util.*;
public class palindrome {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(reversed));
    }
    
}
