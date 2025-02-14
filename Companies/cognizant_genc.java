import java.util.*;
public class cognizant_genc{
    public static void main (String[] args){
    Scanner sc=new Scanner(System.in);
        asci(sc);

    }
    static void fuel(Scanner sc){
        double fuel=sc.nextInt();
        double distance=sc.nextInt();
        System.out.printf("Fuel consumption for 100km is: %.2f%n", (fuel / distance) * 100);
    }

    static void rest(Scanner sc){
        int total=0;
        String[] str={"Pizza","Puff","Cold Drink"};
        int[] itr={100,20,10};
        int[] arr=new int[3];
        for(int i=0;i<str.length;i++){
            System.out.println("Enter quantity of "+str[i]);
            arr[i]=sc.nextInt();
            total+=arr[i]*itr[i];
        }
        for(int i=0;i<str.length;i++){
            System.out.println("No of "+str[i]+":"+arr[i]);
        }
        System.out.println("Grand Total: "+ total);
    }
    static void asci(Scanner sc){
        ArrayList<Integer> at=new ArrayList<>();
        for(int i=0;i<4;i++){
            int temp=sc.nextInt();
            at.add(temp);
        }
        for(int num:at){
            char ch=(char) num;
            System.out.println(num+" : "+ch);
        }
    }
}