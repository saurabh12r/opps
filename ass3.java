//____________Assignment no-3________________
//____________________________________----INHERITANCE_______________________---------
import java.util.Scanner;
 class Employee{
    String Emp_name;
    String Emp_id;
    String Address;
    String Email_id;
    long Mobile_no;
    Scanner sc=new Scanner(System.in);
    

    public void Read(){
        System.out.println("Enter name:");
        Emp_name=sc.nextLine();
        System.out.println("Enter Employee ID:");
        Emp_id=sc.nextLine();
        System.out.println("Enter Address:");
        Address=sc.nextLine();
        System.out.println("Enter Email ID:");
        Email_id=sc.nextLine();
        System.out.println("Enter Mobile no:");
        Mobile_no=sc.nextLong();
        
    }
    public void display(){
        System.out.println("\n\n\t\t__________Employee Details____________");
        System.out.println("Name:"+Emp_name);
        System.out.println("Email id:"+Emp_id);
        System.out.println("Address:"+Address);
        System.out.println("Email id:"+Email_id);
        System.out.println("Mobile no:"+Mobile_no);
}
}
 class Programmer extends Employee{
    double BP,DA,HRA,PF,SCF;
    double Gross_sal,Net_sal;
    Programmer(){
        BP=20000;
    }
    public void calc(){
        DA=0.97*BP;
        HRA=0.10*BP;
        PF=0.12*BP;
        SCF=0.001*BP;
        Gross_sal=BP+DA+HRA;
        Net_sal=Gross_sal-PF-SCF;
        System.out.println("\n\n\t_____________Salary Details_________");
        System.out.println("Deaeness Allowance(Mahagai bhatta):"+DA);
        System.out.println("HRA(house rent allowance):"+HRA);
        System.out.println("PF(provident fund ):"+PF);
        System.out.println("Staff Club Fund:"+SCF);
        System.out.println("Gorss_salary:"+Gross_sal);
        System.out.println("Net salary:"+Net_sal);



    }
}
 public class Emp_Pay_Slip{
    public static void main(String[]args){
        int choice=0;
        Programmer pg=new Programmer();
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("\n______MENU_________");
            System.out.println("1.programmer");
            System.out.println("5.Exit");
            System.out.println("Enter your choice:");
            int choice1=sc.nextInt();
            switch(choice1)
            {
                case 1:
                    pg.Read();
                    pg.display();
                    pg.calc();break;
                case 5:
                    System.out.println("\nExisting from program");
                    break;
            }

        }
        while(choice!=5);
    }
}