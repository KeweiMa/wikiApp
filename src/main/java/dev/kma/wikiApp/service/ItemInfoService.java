package dev.kma.wikiApp.service;


import dev.kma.wikiApp.repository.ItemRepository;
import dev.kma.wikiApp.dto.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemInfoService {

    @Autowired
    private ItemRepository repository;

    public List<Item> findAllItems() {
        return repository.findAll();
    }

    public Optional<Item> findItemById(String itemId){
        return repository.findItemById(itemId);
    }

}
