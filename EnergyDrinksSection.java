/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.salla;

public class EnergyDrinksSection extends ProductCategories
{
    String companyName;
    
EnergyDrinksSection(String name ,String companyName, int quantity , double regularPrice , int productionYear , int completionYear)
    {super(name , quantity , regularPrice , productionYear , completionYear);
    this.companyName=companyName;}
    
    int ComputeQuantity()
    {
        int NewQuantity = super.getQuantity() ;
        if(quantity==4)
            return (NewQuantity+2);
        else
            return NewQuantity;
    }
    
    void display()
{ System.out.println("Product Name: "+name+" , Product Company Name: "+companyName+" , Quantity you need: "+quantity+
        " , Product Price: "+regularPrice+"SAR , Validity Date: "+productionYear+","+completionYear);}
}
