public class reversestriing {
    public static void main(String[]args){
        String Str = "Automation";
        StringBuilder reverse = new StringBuilder(Str).reverse();
        System.out.println(reverse);
    }
    
}
// public class ReverseStr {
    
//     public static void printRev(String str, int idx){
//         if(idx==0){
        
//         System.out.println(str.charAt(idx)); 
//         return;
//     }

//     System.out.println(str.charAt(idx));
//     printRev(str, idx-1);

// }

// public static void main(String args[]){
//     String str = "abcd";
//     printRev(str,str.length()-1);
// }
// }