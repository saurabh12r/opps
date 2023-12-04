//Assignment no-1
//java programming 


import java.io.*;
import java.util.Scanner;
class Comp_op{
    float real,img;
    Comp_op(){//default constructor
        real=0;
        img=0;

    }
    Comp_op(float co1,float co2){
        //parameterized constructor 
        real=co1;
        img=co2;

    }
    void add(Comp_op co1,Comp_op co2){
        float real,img;
        real=(co1.real+co2.real);
        img=(co1.img+co2.img);
        System.out.println("Addition is"+real+"+"+img+"i");

    }
    void sub(Comp_op co1,Comp_op co2){
        float real,img;
        real=(co1.real-co2.real);
        img=(co1.img-co2.img);
        System.out.println("Substraction is :"+real+"+"+img+"i");
    }
    void mux(Comp_op co1,Comp_op co2){
        float real,img;
        real=(co1.real*co2.real-co1.img*co2.img);
        img=(co1.real*co2.img+co2.real*co1.img);
        System.out.println("Multiplication is:"+real+"+"+img+"i ");
    }
    void div(Comp_op co1,Comp_op co2){
        float real,img,deno;
        deno=(co2.real*co2.real+co2.img*co2.img);
        real=(co1.real*co2.real+co1.img*co2.img)/deno;
        img=(co2.real*co1.img-co1.real*co2.img)/deno;
        System.out.println("Division is:"+real+"+"+img+"i");
    }
}
    class Complex{
        public static void main(String[]args){
            int ch=0;
            float num1,num2,ans;  
            Comp_op calc=new Comp_op();//create object of comp_op
            Scanner input=new Scanner(System.in);
            System.out.println("Enter first no with real and img part");
            num1=input.nextFloat();//real________co1
            num2=input.nextFloat();//img________co2
            Comp_op co1=new Comp_op(num1,num2);
            System.out.println("Enter second no with real and img part");
            num1=input.nextFloat();//real______co1
            num2=input.nextFloat();//img______co2
            Comp_op co2=new Comp_op(num1,num2);
            do{
                System.out.println("\n____________MENU______________");
                System.out.println("1.Add");
                System.out.println("2.substraction");
                System.out.println("3.Multiplication");
                System.out.println("4.division");
                System.out.println("5.exit");
                
                System.out.println("Enter your choice ");
                ch=input.nextInt();
                switch(ch){
                    case 1:
                        calc.add(co1,co2);
                        break;
                    case 2:
                        calc.sub(co1,co2);
                        break;
                    case 3:
                        calc.mux(co1,co2);
                        break;
                    case 4:
                        calc.div(co1,co2);
                        break;
                        default:
                            System.out.println("\nExiting the program");
                            break;


                }
            }
            while(ch!=5);
                        
        }
    }
