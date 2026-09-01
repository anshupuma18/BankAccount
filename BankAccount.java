import java.util.Scanner;
class BankAccount{
    void accountHolder(){
        String name;
        String IFSC;
        int Amount, de,wth;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter  user name:");
        name=sc.nextLine();
        System.out.println("Enter IFSC ID:");
        IFSC= sc.nextLine();
        System.out.println("Enter Amount:");
        Amount=sc.nextInt();
        System.out.println("Enter deposit:");
        de=sc.nextInt();
        Amount+=de;
        System.out.println("Total Amount:"+Amount);
        System.out.println("Enter withdraw");
        wth=sc.nextInt();
        Amount-=wth;
        System.out.println("Total Amount:"+Amount);
    }
    public static void main(String[]args){
        BankAccount obj=new BankAccount();
        obj.accountHolder();
    }
}