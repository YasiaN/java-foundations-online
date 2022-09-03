package ru.buttonone.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Setter;

@Data
public class Book {
    @JsonProperty ("_id")
    private String id;
    private String name;

}
