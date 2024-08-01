import java.util.*;

class stacking{
	boolean checker(String str){
      int i=-1;
    char[] ctr=str.toCharArray();
      char[] strr=new char[ctr.length];
	for(char ch:ctr){
    	if(ch=='('||ch=='{'||ch=='['){
        	strr[++i]=ch;
        }
      else{
      	if(i>=0&& ((strr[i]=='('&& ch==')')||(strr[i]=='{'&& ch=='}')||(strr[i]=='['&& ch==']'))){
        	i--;
        }
        else{
        return false;
        }
      }
    }
      return i==-1;
    }
}

class balanced_brackets
{
  public static void main(String args[])
  {
	Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
	stacking st=new stacking();
	if(st.checker(str)){
    	System.out.println("Balanced");
    }
    else{
    	System.out.println("Not Balanced");
    }
	
  }
}