package com.example.test1.service;

import com.example.test1.dto.request.PersonRequest;
import com.example.test1.dto.response.PersonResponse;

import java.util.List;

public interface PersonService {

    PersonResponse create(PersonRequest request);

    PersonResponse findById(Long id);

   List<PersonResponse> findAll();

    PersonResponse update(Long id, PersonRequest request);
}
