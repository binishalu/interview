package com.example.demo.Controllers;
import com.example.demo.model.*;

import com.example.demo.services.ItemService;

import java.util.List;
//import java.util.Optional;
//import org.springframework.beans.factory.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ItemController {

    @Autowired
   private ItemService itemService;

// Get All items
    @GetMapping("/items")
    public List<Items> getAllItems() {
        return itemService.listAllItems();
    }
    


  
    // Get a Single item


    @GetMapping("/items/{id}")
    public ResponseEntity<Items> get(@PathVariable Integer id) {
        
            Items items = itemService.get(id);
            return new ResponseEntity<Items>(items,HttpStatus.OK);
             
    }
}

