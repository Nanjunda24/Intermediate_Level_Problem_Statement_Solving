package CodingWorkshop;

public class _9ReverseString {

    public static String reverseString(String str){

        String reverse="";
        for (int i=str.length()-1;i>=0;i--){

            reverse=reverse+str.charAt(i);
        }
        return reverse;
    }
    public static void main(String[] args) {
        
        String name="Nanjunda K M";
        String result=reverseString(name);
        System.out.println("Reverse string is : "+result);
    }
    
}
