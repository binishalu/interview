package com.example.demo.Controllers;
import com.example.demo.model.*;
import com.example.demo.repository.*;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ItemController {

    @Autowired
    ItemRepository itemRepository;

// Get All items
    @GetMapping("/items")
    public List<Items> getAllItems() {
        return itemRepository.findAll();
    }
    
    // Get a Single item
    @GetMapping("/items/{id}")
    public Optional<Items> getitemId(@PathVariable("id") int itemId) {
        return itemRepository.findById(itemId);
                
    }

   
}

