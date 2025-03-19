/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.salla;

public class MeatDepartment extends ProductCategories
{
   double kiloOfMeat;
   
   MeatDepartment(String name , double kiloOfMeat,int quantity , double regularPrice , int productionYear , int completionYear)
   {super(name , quantity , regularPrice , productionYear , completionYear);
   this.kiloOfMeat=kiloOfMeat; }
   
   double ComputeSalePriceMeat()
    {
        double Price = super.getRegularPrice() ;
        if(regularPrice>200)
            return Price-(Price*30/100);
        else
            return Price;
    }
   
   void display()
{ System.out.println("Product Name: "+name+" , The kilo you need: "+kiloOfMeat+"KG , Quantity you need: "+quantity+
        " , Product Price: "+regularPrice+"SAR , Validity Date: "+productionYear+","+completionYear);}
}
