package ru.netology.diplom.services;

import ru.netology.diplom.repositories.Repository;

@org.springframework.stereotype.Service
public class Service {
    Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }
}
