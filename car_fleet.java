import java.util.*;

public class car_fleet{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dest=sc.nextInt();
        int limit1=sc.nextInt();
        int [] car=new int[limit1];
        for(int i=0; i<limit1; i++){
            car[i]=sc.nextInt();
        }
        int limit2=sc.nextInt();
        int [] speed=new int[limit2];
        for(int i=0; i<limit2; i++){
            speed[i]=sc.nextInt();
        }
        int [][]cars=new int[limit1][2];
        for(int i=0; i<limit1; i++){
            cars[i][0]=car[i];
            cars[i][1]=speed[i];
        }
        Arrays.sort(cars,(a,b)-> Integer.compare(b[0],a[0]));
        double[] time=new double[limit1];
        for(int i=0; i<limit1;i++){
            time[i]=(double)(dest-cars[i][0])/cars[i][1];
        }
        int count=0;
        double t=0;
        for(double temp:time){
            if(temp>t){
                count++;
                t=temp;
            }
        }
        System.out.println(count);
        }
}