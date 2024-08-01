import java.util.*;
class ipv4_checker
{
  public static void main(String args[])
  {
	Scanner sc=new Scanner(System.in);
    int count=0;
    String str=sc.nextLine();
    String[] str_arr=str.split("\\.");
    if(str_arr.length!=4){
        	System.out.println("0");
          	return;
        }
	for(String i:str_arr){
      try{
      	int temp=Integer.parseInt(i);
    	if(temp>0 && temp<=255){
        	count++;
       		}	
    	}
      catch(NumberFormatException e){
      	System.out.println("0");
          	return;
      }
    }
	System.out.println(count==4?"1":"0");
  }
}