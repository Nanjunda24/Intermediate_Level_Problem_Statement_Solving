package CodingWorkshop;

public class _3EvenOrOdd {

    public static boolean isEvenOrOdd(int num){

        if(num%2==0)
        return true;
        else
        return false;
    }

public boolean EvenOrOdd(int number){

    if (number%2 == 0 ){
        return true; 
    }
    else{
        return false;
    }

}

    public static void main(String[] args) {
        
        int x=102;

        boolean result=isEvenOrOdd(x);
        if (result){
            System.out.println(x+" is even number ");
        }
        else{
            System.out.println(x+" is odd number");
        }

        _3EvenOrOdd  obj = new _3EvenOrOdd();
        obj.EvenOrOdd(23);

        
    }
    
    
}
