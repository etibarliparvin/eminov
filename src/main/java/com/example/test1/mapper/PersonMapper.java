package com.example.test1.mapper;

import com.example.test1.dto.request.PersonRequest;
import com.example.test1.dto.response.PersonResponse;
import com.example.test1.entity.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper {

    public Person toEntity(PersonRequest request) {
        Person person = new Person();
        person.setName(request.getName());
        person.setSurname(request.getSurname());
        person.setAge(request.getAge());
        return person;
    }

    public PersonResponse toResponse(Person person) {
        PersonResponse response = new PersonResponse();
        response.setId(person.getId());
        response.setName(person.getName());
        response.setSurname(person.getSurname());
        response.setAge(person.getAge());
        return response;
    }
}
