package com.example.jack.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,include = JsonTypeInfo.As.PROPERTY,property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = City.class,name = "city"),@JsonSubTypes.Type(value = Street.class,name = "street"),@JsonSubTypes.Type(value = Email.class,name = "emails")})
public class Person {

    @JsonProperty("person_id")
    @JsonAlias({"id"})
    private Integer id;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    private Integer age;

    @JsonProperty("city")
    private City city;

    private Street street;
    private List<Email> emails;

    public void setEmails(List<Email> emails) {
        Email email = new Email();
        this.emails = new ArrayList<Email>();
        emails.add(email);
    }

}
