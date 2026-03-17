package CodingWorkshop;

// public class _11IsPolindrome {

//     static boolean isPolindrome(String str){

//       int  leftIndex=0;
//        int  rightIndex = str.length()-1;

//        boolean result=true;

//        for (int i=0;i<str.length();i++){
//         if (str.charAt(leftIndex) != str.charAt(rightIndex)){
//             result= false;
//             break;
//         }
    
//         leftIndex++;
//         rightIndex--;
//        }
//        return result;
       


//     }
//     public static void main(String[] args) {
        
//         String name="MadaM";
//         boolean result= isPolindrome(name);

//         if (result )
//             System.out.println(name + " is Polindrome");
//         else 
//         System.out.println(name +" is not polindrome");
//     }
// }

// ANother simple way to checke polinderome\

class polindrome{
    
    public static void reverseString(String str ){

        String reverse="";
        for ( int i=str.length()-1;i>=0;i--){

            reverse = reverse + str.charAt(i);
        }

        if (str.equalsIgnoreCase(reverse)){
            System.out.println(str +" is polindrome");
        }
        else{
            System.out.println(str+" is not polindrome");
        }
    }
    public static void main(String[] args) {
        
        reverseString("Madam");
    }
}
