package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Table(name = "items")
public class Items {

        @Id
        @GeneratedValue
        @Column(name = "item_id")
        private Integer itemId;
        @Column(name = "short_description")
        private String shortDescription;
        @Column(name = "price")
        private Integer price;
        @Column(name = "brand")
        private String brand;
    
        public Items(int itemId, String shortDescription, int price,String brand)
         {  
            this.itemId = itemId;  
            this.shortDescription = shortDescription;  
            this.price = price;  
            this.brand=brand;
        }  
    public Items()
    {
        
    }

        public Integer getitemId()
        {
            return itemId;
        }
       public void setitemId(int itemId) {
            this.itemId = itemId;
        }
        public String getshortDescription()
        {
            return shortDescription;
        }
         
    public void setshortDescription(String shortDescription)
    {
        this.shortDescription=shortDescription;
    }
       public Integer getprice()
       {
           return price;
       } 
    public void setprice(int price)
    {
        this.price=price;
    }
       public String getbrand()
       {
           
           return brand;
       }
    public void setbrand(String brand)
    {
        this.brand=brand;

    }
    
    }
    
     
    

