package CodingWorkshop;

public class _8CountVowels {

    public static int countVowels(String str){
         int count=0;
        for(int i=0;i<str.length();i++){

            char character=str.charAt(i);
            if (character =='a' || character == 'e' || character=='i' ||character =='o' ||character == 'u'||character =='A' || character == 'E' || character=='I' ||character =='O' ||character == 'U' ){
                count++;
            }

        }
        return count;
    }
    public static void main(String[] args) {
        
        String input ="Nanjunnda K M";
        int result=countVowels(input);
        System.out.println(input+": number vowels is : "+result);
    }
    
}
