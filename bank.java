//This code is done by shashwat sharma
import java.util.Scanner;
import java.lang.Math;

//Transaction calling
class call{
    void calling(){
        int i=0,m,amount;
        account ac=new account();
        Scanner sc=new Scanner(System.in);
        while(i==0){
        System.out.println("1:Withdraw");
        System.out.println("2:Deposit");
        System.out.println("3:Check Account Balance");
        System.out.println("4:Exit");
        m=sc.nextInt();
        if(m==1){
        System.out.println("Enter Amount to withdraw");
        amount=sc.nextInt();
        ac.wid(amount);
        }
        else if(m==2){
            System.out.println("Enter Amount to deposit");
        amount=sc.nextInt();
        ac.dep(amount);
        }
        else if(m==3){
        ac.balance();
        }
        else if(m==4){
            break;
        }
        }
    }
}
// Call end


//Account transaction
class account{
    int bal=0;
    int done=0,age=0,key=0;
    int min=5400483;
    int max=100000000;
    int min1=1000;
    int max1=9999;
    int account_check=0;
    int key_check=0;
    void create(){
        int input;
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose type of account:");
        System.out.println("1:Saving");
        System.out.println("2:Current");
        input=sc.nextInt();
        done = (int)Math.floor(Math.random() * (max - min + 1) + min);
        key= (int)Math.floor(Math.random() * (max1 - min1 + 1) + min1);
        if(input==1){
            System.out.println("Saving Account Created!");
            System.out.println("");
        }
        else if(input==2){
        System.out.println("Current Account Created!");
        System.out.println("");
        }
        System.out.println("Account number:"+done);
        System.out.println("Your 4 digit Secret key:"+key);
        System.out.println("Account Balance="+bal);
        System.out.println("");

    }
    void dep(int amount){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Credentials");
        System.out.println("Enter account number");
        account_check=sc.nextInt();
        System.out.println("");
        System.out.println("Enter 4 digit secret key:");
        key_check=sc.nextInt();
        bal=bal+amount;
        System.out.println("Amount Added!");
        System.out.println("");
    }
    void wid(int amount){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Credentials");
        System.out.println("Enter account number");
        account_check=sc.nextInt();
        System.out.println("");
        System.out.println("Enter 4 digit secret key:");
        key_check=sc.nextInt();
        if(bal<amount){
        System.out.println("Withdraw UnSucessfull!");
        System.out.println("Balance Insufficient!");
        System.out.println("");
        }
        else if(bal>0){
            bal=bal-amount;
            System.out.println("Withdraw Sucessfull!");
            System.out.println("");
        }
    }
    void balance(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Credentials");
        System.out.println("Enter account number");
        account_check=sc.nextInt();
        System.out.println("");
        System.out.println("Enter 4 digit secret key:");
        key_check=sc.nextInt();
        //Bal output
        System.out.println("Your current balance is:"+bal);
        System.out.println("");
    
    }

}
//Account end


// Driver command
public class trial{
    public static void main(String[] args){
        int i=0,m,n,amount;
        System.out.println("Welcome to Maprad Bank");
        System.out.println("Select Your Query:");
        System.out.println("1:Create account");
        System.out.println("2:Access Your bank account:");
        System.out.println("");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        account ac=new account();
        call ca=new call();
        if(n==1){
        ac.create();
        ca.calling();
        }
        else if(n==2){
        ca.calling();
        }
    }
    }
