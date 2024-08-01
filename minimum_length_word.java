import java.util.*;
public class minimum_length_word{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Sentence:");
        String str=sc.nextLine();
        String[] str1=str.split(" ");
        String min=str1[0];
        for(String word: str1){
            if(min.length()>word.length()){
                min=word;
        }
        }
        System.out.print("Smallest Word is:");
        System.out.print(min);
        System.out.println();
    }
}