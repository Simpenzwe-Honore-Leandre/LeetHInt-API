package com.L_Hnr.LeetHintAPI;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Hints")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hint {
    @Id
    private Integer leetcodeId;
    private String questionTitle;
    private String questionLink;
    private String Intuition;
}
