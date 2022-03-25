import java.util.Scanner;

class product
{
  int pcode;
  String pname;
  int price;

}

public class MainProduct
{
 public static void main(String[] args)
 {
   product ob1 = new product();
   product ob2 = new product();
   product ob3 = new product();
    
   Scanner s = 	new Scanner(System.in);
   System.out.println("Enter the product code, product name & product price of first object : ");
   ob1.pcode = s.nextInt();
   ob1.pname = s.next();
   ob1.price = s.nextInt();
   
   System.out.println("Enter the product code, product name & product price of third object : ");
   ob2.pcode = s.nextInt();
   ob2.pname = s.next();
   ob2.price = s.nextInt();
   
   System.out.println("Enter the product code, product name & product price of third object : ");
   ob3.pcode = s.nextInt();
   ob3.pname = s.next();
   ob3.price = s.nextInt();
   
   if(ob1.price > ob2.price)
   {
    if(ob1.price > ob3.price)
      System.out.println(ob1.pname+" is having higher price ");
    else 
      System.out.println(ob3.pname+" is having higher price "); 
   }
   else 
   {
     if(ob2.price > ob3.price)
        System.out.println(ob2.pname+" is having higher price");
     else
        System.out.println(ob3.pname+" is having higher price"); 
   }
   
 }
}


