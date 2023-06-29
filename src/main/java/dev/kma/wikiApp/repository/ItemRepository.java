package dev.kma.wikiApp.repository;

import dev.kma.wikiApp.dto.Item;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ItemRepository extends MongoRepository<Item, ObjectId> {
    Optional<Item> findItemById(String itemId);
}
