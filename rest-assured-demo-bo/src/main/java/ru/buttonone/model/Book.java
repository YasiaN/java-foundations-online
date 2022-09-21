package ru.buttonone.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
public class Book {
    @JsonProperty ("_id")
    private String id;
    private String name;

}
