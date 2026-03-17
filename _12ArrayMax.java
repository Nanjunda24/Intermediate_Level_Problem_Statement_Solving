package CodingWorkshop;

public class _12ArrayMax {

    void maxValue(int[] numbers){

        int max=numbers[0];
        int min=numbers[0];

        for(int i=0;i<numbers.length;i++){

            if (numbers[i]>max)  max=numbers[i];
            if (numbers[i]<min)  min=numbers[i];
        }
         
        System.out.println("Max value in the array is: "+max);
        System.out.println("Min value in the array is: "+min);

    }
    public static void main(String[] args) {
        int [] arr={122,34,564,33,3,2,1,234,5,6778,8,9990,90};

        _12ArrayMax Array = new _12ArrayMax();

        Array.maxValue(arr);
    }
    
}
