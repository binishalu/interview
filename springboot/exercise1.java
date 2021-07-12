
import java.util.*;
import java.util.stream.Collectors;

class Items{  

    int itemId;  
    String shortDescription;  
    int price;
    String brand;  

    public Items(int itemId, String shortDescription, int price,String brand)
     {  
        this.itemId = itemId;  
        this.shortDescription = shortDescription;  
        this.price = price;  
        this.brand=brand;
    }  

    public int getitemId()
    {
        return itemId;
    }
    public String shortDescription()
    {
        return shortDescription;
    }

   public int getprice()
   {
       return price;
   } 

   public String brand()
   {
       return brand;
   }

   public String toString() {
    return "Items [Itemid=" + itemId + ", ShortDescription=" + shortDescription + ", Price=" + price + ", Brand=" + brand + "]";
}

}  

public class exercise1{

    public static void main(String args[])
    {
        List<Items> itemsList = new ArrayList<Items>();  
  
        //Adding Products  
        itemsList.add(new Items(1,"Laptop Demand less",35000,"HP"));  
        itemsList.add(new Items(2,"Average",30000,"Dell"));  
        itemsList.add(new Items(3,"Mobile Excellent",48000,"Lenevo"));  
        itemsList.add(new Items(4,"High price",78000,"Mac"));  
        itemsList.add(new Items(5,"High demand",80000,"Apple"));
        itemsList.add(new Items(6,"Mobile phone",25000,"Samsaug"));  
        itemsList.add(new Items(7,"Tablet",30000,"Apple"));  
        itemsList.add(new Items(8,"Mobile Excellent",28000,"vivo"));  
        itemsList.add(new Items(9,"Television",28000,"Sony"));  
        itemsList.add(new Items(10,"Iphone Mobile",90500,"Apple"));  

        List<String> itemBrandList =   
                    itemsList.stream()  
                            .filter(p -> p.brand.startsWith("A")) // filtering data starts with A
                            .sorted((f1,f2)->Integer.compare(f2.getprice(),f1.getprice())) // sorting in desecding order
                           .map(Items::toString)         // fetching items 
                           .collect(Collectors.toList());  // collecting as list  
                            
                                 
        System.out.println(itemBrandList);  


    }



}
