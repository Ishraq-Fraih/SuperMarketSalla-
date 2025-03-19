/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.salla;

public class ProductCategories
{
    String name;
    int quantity;
    double regularPrice;
    int productionYear ;
    int completionYear;
    
    ProductCategories(String name , int quantity , double regularPrice , int productionYear , int completionYear)
    {this.name=name;
    this.quantity=quantity;
    this.regularPrice=regularPrice;
    this.productionYear=productionYear;
    this.completionYear=completionYear;}
    
    int getQuantity()
    { return quantity; }
    
    double getRegularPrice()
    { return regularPrice; }
    
    
}