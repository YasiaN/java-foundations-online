package ru.buttonone.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Data
@NoArgsConstructor
public class BookMine {
    @JsonProperty("_id")
    private String id;
    private String name;

    public BookMine(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookMine)) return false;
        BookMine bookMine = (BookMine) o;
        return Objects.equals(name, bookMine.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
