package CodingWorkshop;

public class _13SearchKey {

    static String binarySearch(int[] arr, int key){
        int leftIndex =0;
        int rightIndex = arr.length-1;

        while(leftIndex <= rightIndex){

       int  midIndex = leftIndex+(rightIndex - leftIndex)/2;

       if (key == arr[midIndex]){
        return "Key is Found: " +key;
       }

       else if(key > arr[midIndex]){
        leftIndex = midIndex + 1;
       }

       else if(key < arr[midIndex]){

        rightIndex = midIndex - 1;
       }


        }
        return "Key is not found: "+key;
    }
    public static void main(String[] args) {
        
        int [] numbers={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        int key=160;

        System.out.println(binarySearch(numbers, key));
    }
    
}
