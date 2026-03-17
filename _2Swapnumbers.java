package CodingWorkshop;

public class _2Swapnumbers {
    
// java pass by value 
    public void swap(int a, int b){

        System.out.println("Before swapping  a: "+a+" b: "+b);
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping  a: "+a+" b: "+b);

    }
    // Java pass by  reference 
    public void Swap_2(int[] number){
        System.out.println("Before swapping number[0]: "+number[0]+" number[1]: "+number[1]);

        int temp;
        temp =  number[0];
        number[0] = number[1];
        number[1] = temp;

        System.out.println("After swapping number[0]: "+number[0]+ " number[1]: "+number[1]);
        
        
        
    }
    public static void main(String[] args) {
        int [] input={12,345};

        
        
        _2Swapnumbers swap = new _2Swapnumbers();

        swap.swap(12,89);

        swap.Swap_2(input);
    }
    
    
}
