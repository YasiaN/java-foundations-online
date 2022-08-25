package ru.itsjava.iostreams;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@AllArgsConstructor
@Data
public class User implements Serializable {
//    Объект класса User (login, password) Проставить transient на password
    private String login;
    private transient String password;


}
