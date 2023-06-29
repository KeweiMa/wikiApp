package dev.kma.wikiApp.controller;

import dev.kma.wikiApp.dto.Item;
import dev.kma.wikiApp.service.ItemInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/reverse")
public class DisplayItemsController {
    @Autowired
    private ItemInfoService itemInfoSvc;

    @GetMapping
    public ResponseEntity<List<Item>> getItems() {
        return new ResponseEntity<List<Item>>(itemInfoSvc.findAllItems(), HttpStatus.OK);
   }

    @GetMapping("/{itemId}")
    public ResponseEntity<Optional<Item>> getItemDetail(@PathVariable String itemId){
        return new ResponseEntity<Optional<Item>>(itemInfoSvc.findItemById(itemId), HttpStatus.OK);
    }

}
