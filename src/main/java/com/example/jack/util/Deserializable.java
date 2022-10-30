package com.example.jack.util;

import com.example.jack.model.Person;

import java.io.IOException;

public interface Deserializable {
    Person convertJsonByteToObject(String json) throws IOException;


}
