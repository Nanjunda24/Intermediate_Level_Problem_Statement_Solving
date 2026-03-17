package CodingWorkshop;

public class _15SecondLargest {

void getSecondLargest(int[] arr){

    int firstLarge=arr[0];

    int secondLarge=arr[0];

    for(int i=0; i<arr.length;i++){

        if ( arr[i] > firstLarge ) {

            secondLarge=firstLarge;
            firstLarge = arr[i];
        }
        else if (  arr[i] > secondLarge){
            secondLarge=arr[i];
        }
    }
    System.out.println("Second largest element is: "+secondLarge);
}
public static void main(String[] args) {
    
    int [] numbers={12,43,83,56,34,56,78,90};
     
    _15SecondLargest s = new _15SecondLargest();

    s.getSecondLargest(numbers);

}
    
}
