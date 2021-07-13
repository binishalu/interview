package com.example.demo.services;

import java.util.List;

import javax.transaction.Transactional;

import com.example.demo.model.Items;
import com.example.demo.repository.ItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ItemService {

@Autowired
public ItemRepository itemRepository;
    
public List<Items> listAllItems()
{
    return itemRepository.findAll();
    
}


public Items get(Integer id) {
    return itemRepository.findById(id).get();
}



}
