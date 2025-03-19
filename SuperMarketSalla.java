/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supermarket.salla;
public class SuperMarketSalla {
public static void main(String[] args) {
    
System.out.println("Salla welcomes you our customers ");
System.out.println();

System.out.println("Halloumi Cheese Special Offer Buy 2 Win 1 Free");
CheeseDepartment c1 = new CheeseDepartment("Halloumi Cheese ","ALSAFI ",2,29.0,2023,2024);
c1.display();
System.out.println("Purchase quantity: "+c1.ComputeQuantity());
CheeseDepartment c2 = new CheeseDepartment("Halloumi Cheese","ALSAFI",1,14.5,2023,2024);
c2.display();
System.out.println("quantity: "+c2.ComputeQuantity());
       System.out.println();
       
System.out.println("Special offer for meat if you buy more than 200 riyals you get a 30% discount");
MeatDepartment m1 = new MeatDepartment("Minced meat ",1.5,1,103.43,2023,2024);
m1.display();
System.out.println("Price: "+m1.ComputeSalePriceMeat());
MeatDepartment m2 = new MeatDepartment("Minced meat ",1,4,275.8,2023,2024);
m2.display();                
System.out.println("New Price: "+m2.ComputeSalePriceMeat());
       System.out.println();
       
System.out.println("Rita Banka Red Drink Special Offer Buy 4 Win 2 Free");
EnergyDrinksSection e1 = new EnergyDrinksSection("Red ","Rita ",4,2,2023,2024);
e1.display();
System.out.println("Purchase quantity: "+e1.ComputeQuantity());
EnergyDrinksSection e2 = new EnergyDrinksSection("Red","Rita",2,2,2023,2024);
e2.display();
System.out.println("quantity: "+e2.ComputeQuantity());
      System.out.println();
      
System.out.println("Thank you for your shopping and we are at your service, greetings Salla ^-^");
    }    }
