/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakery;
/**
 * @author absin_000
 */
public class Cake {
    private String name;
    private double price;
    private Mix ingredients;
    private String filling;
    private String icing;
    private int cookingTime;
    
   public Cake(String cName, double cost, String cMix, String cFilling, String cIcing, int cBake){
   this.name=cName;
   this.price=cost;
   this.filling=cFilling;
   this.icing=cIcing;
   this.ingredients= new Mix(cMix, 40);
   this.cookingTime=cBake;
   System.out.println("You created a new cake "+name+ " with " + filling + ", " + icing + ", " + cMix);
   }
    
}


