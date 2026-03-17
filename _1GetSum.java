package CodingWorkshop;

public class _1GetSum {
            public static int  getSum(int num1,int num2){

            int sum;
            sum = num1+num2;
            return sum;
            }

            void getSum(int a, int b, int c){
                System.out.println("Sum of the three numbers :: " +(a=b+c));
            }
            public static void getSum2(float a,float b){

                // float sum;  local variable . must be initialized before use.
                float sum;
                sum = a+b;

                System.out.println("Sum return type void : "+sum);
            }
            public static String getName(String firstName,String lastName){

                String fullName = firstName +" "+lastName;

                return fullName;
            }
            public void fullName(String s1,String s2){

            String fullName= s1+" "+s2;
            System.out.println("Full name (s1+' '+s2): "+fullName);

            }
public static void main(String[] args) {

        

       int  result = getSum(12,6);

        System.out.println("Sum: "+result);
        
       getSum2(12.54F,56.76F);

       String fulName=getName("Nanjunda", "K M");

        System.out.println("Full Name from the get name method: "+fulName);
        //   full name is a non-statoic method that's why we nee d to create object 
       _1GetSum s=new _1GetSum();
       s.fullName("Charan","H G");
       s.getSum(12,45,67);
}
}
