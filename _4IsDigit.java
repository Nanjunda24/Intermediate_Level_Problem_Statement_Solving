package CodingWorkshop;

public class _4IsDigit {

    public static boolean isDigit(String num){

        boolean isDigit = true;

        for( int i=0; i<num.length(); i++){
            char character  = num.charAt(i); //i  means = index
            if (character <'0' || character >'9'){
                isDigit = false;
                break;
                
                
            }
            

        }
        return isDigit;
    }
    public static void main(String[] args) {
        
        String num="123456";
        String str="2234der";

        boolean result=isDigit(str);

        if(result){
            System.out.println((str +" Is proper number "));
        }
        else{
            System.out.println(str +" is not a proper number ");
        }
    }
    
}

