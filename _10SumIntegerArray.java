package CodingWorkshop;

public class _10SumIntegerArray {

    public static int sumArray(int[] arr){

        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        return sum;

    }
    public static void main(String[] args) {
        
        int [] number={12,34,56,78,998,23};
        int sum_elements = sumArray(number);
        System.out.println("Sum of all elements in the array is : " +sum_elements);
    }
    
}
