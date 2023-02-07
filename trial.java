import java.util.Scanner;
class call{
    void calling(){
        int i=0,m,amount;
        account ac=new account();
        Scanner sc=new Scanner(System.in);
        while(i==0){
        System.out.println("1:Withdraw");
        System.out.println("2:Deposit");
        System.out.println("3:Check Account Balance");
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
        }
    }
}
class account{
    int bal=0;
    int done=0,age=0;
    void create(){
        int input;
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose type of account:");
        System.out.println("1:Saving");
        System.out.println("2:Current");
        input=sc.nextInt();
        done=1412512;
        if(input==1){
            System.out.println("Saving Account Created!");
        }
        else if(input==2){
        System.out.println("Current Account Created!");
        }
        System.out.println("Account number:"+done);
        System.out.println("Account Balance="+bal);

    }
    void dep(int amount){
        bal=bal+amount;
        System.out.println("Amount Added!");
    }
    void wid(int amount){
        if(bal<amount){
        System.out.println("Withdraw UnSucessfull!");
        System.out.println("Balance Insufficient!");
        }
        else if(bal>0){
            bal=bal-amount;
            System.out.println("Withdraw Sucessfull!");
        }
    }
    void balance(){
        System.out.println("Your current balance is:"+bal);
    }

}
public class trial{
    public static void main(String[] args){
        int i=0,m,n,amount;
        System.out.println("Welcome to Maprad Bank");
        System.out.println("Select Your Query:");
        System.out.println("1:Create account");
        System.out.println("2:Access Your bank account:");
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
// This code is given by- Shashwat sharma


