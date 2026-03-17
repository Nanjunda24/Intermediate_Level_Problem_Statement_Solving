package CodingWorkshop;

public class _7GetLength {

    static void getLength(String str){

        int counter = 0 ;

        for ( int i=0;i<str.length();i++) {

            counter++;
            
        }
        System.out.println("Length of the given string is : "+counter);
    }
    public static void main(String[] args) {
        
        String str="Nanjunda k M";

        getLength(str);
    }
    
}
