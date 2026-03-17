package CodingWorkshop;

public class _6AsciiValue {

    public void getAsciiValue(String str){

        char character;
        for (int index=0; index<str.length();index++){

          character =str.charAt(index);
          int asciiValue= character;
          System.out.println("Ascii value of "+character+" is : "+asciiValue);
        }
    }
    public static void main(String[] args) {
        
        String str="abcdefghijklmnopqrstuvwxyz";

        _6AsciiValue ascii = new _6AsciiValue();

        ascii.getAsciiValue(str);
    }
    }
