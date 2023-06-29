package dev.kma.wikiApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "reverse")
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    @Id
    private ObjectId id;
    private String itemId;
    private String name;
    private List<String> dropStage;

    public Item(String itemId, String name, List<String> dropStage) {
        this.itemId = itemId;
        this.name = name;
        this.dropStage = dropStage;
    }

}
