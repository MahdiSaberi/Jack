package com.example.jack.util;

import com.example.jack.model.Person;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class DeserializableImpl implements Deserializable{

    @Override
    public Person convertJsonByteToObject(String json) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        byte[] jsonByteArray = json.getBytes("UTF-8");
        return objectMapper.readValue(jsonByteArray, Person.class);
    }
}
