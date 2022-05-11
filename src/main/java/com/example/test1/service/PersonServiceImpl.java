package com.example.test1.service;

import com.example.test1.dto.request.PersonRequest;
import com.example.test1.dto.response.PersonResponse;
import com.example.test1.entity.Person;
import com.example.test1.mapper.PersonMapper;
import com.example.test1.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository repository;
    private final PersonMapper mapper;

    @Override
    public PersonResponse create(PersonRequest request) {
        return mapper.toResponse(repository.save(mapper.toEntity(request)));
    }

    @Override
    public PersonResponse findById(Long id) {
        return mapper.toResponse(repository.findById(id).get());
    }

    @Override
    public List<PersonResponse> findAll() {
        return repository.findAll().stream().map(mapper::toResponse).collect(Collectors.toList());
    }

    @Override
    public PersonResponse update(Long id, PersonRequest request) {
        Optional<Person> found = repository.findById(id);
        if (found.isPresent()) {
            Person person = mapper.toEntity(request);
            person.setId(found.get().getId());
            return mapper.toResponse(repository.save(person));
        }
        return null;
    }
}
