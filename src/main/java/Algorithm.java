import java.util.ArrayList;
import java.util.List;

public class Algorithm {
    public static void main(String[] args) {
        System.out.println("Algorithms");
///////////////// FizzBuzz
        for (var i = 1; i < 100; i++) {
            fizzBuzz(i);
        }
///////////////// GetReminder
        int reminder = getReminder(5,5);
//        int reminder = getReminder1(5,6);
        System.out.println("Reminder = "+ reminder);

/////////////// Swap 2 variables
        int a=10;
        int b=20;
        a = a+b;  //30
        b=a-b; //30-20=10
        a=a-b; //30-10=20

/////////////// Lucky string "tyuiuyt"
        String str = "qaa54aaq";
        if(isLucky(str)){
            System.out.println("Lucky "+str);
        }else{
            System.out.println("Not lucky " + str);
        }

/////////////// Reverse sentence
        final String sentence = "Today is awful weather";
        reverseSentence(sentence);

        int[] array = {5,5,6,7,8,9,6,0,5,9,2,3,1};
        printRepited(array);
    }
//************************************************************************
    private static void printRepited(int[] array) {
        List repite = new ArrayList<Integer>();
        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    if(!repite.contains(array[i])){
                        repite.add(array[i]);
                    }
                }
            }
        }
        repite.forEach(x-> System.out.println(x));
    }

    private static void reverseSentence(String sentence) {
        var words = sentence.split(" ");
        var reverse = "";
        for (var i=words.length-1; i>=0;i--){
            reverse+=words[i]+" ";
        }
        System.out.println(reverse);

    }

    private static boolean isLucky(String str) {
        String reverse="";
        for (var i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        for (var i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=reverse.charAt(i)){
                return false;
            }
        }
        return true;
    }

    private static int getReminder1(int a, int b) {
        int x=a/b;
        return a-x*b;
    }

    private static int getReminder(int a, int b) {
        boolean cond = true;
        if(a<b){
            return a;
        }
        while (cond){
            a=a-b;
            if(a<b){
                cond=false;
            }
        }
        return a;
    }

    private static void fizzBuzz(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println(i + " FizzBuzz");
            return;
        }
        if (i % 3 == 0) {
            System.out.println(i + " Fizz");
            return;
        }
        if (i % 5 == 0) {
            System.out.println(i + " Buzz");
        }
    }
}

