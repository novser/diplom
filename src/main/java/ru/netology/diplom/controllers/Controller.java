package ru.netology.diplom.controllers;

import org.springframework.web.bind.annotation.RestController;
import ru.netology.diplom.services.Service;

@RestController
public class Controller {
    Service service;

    public Controller(Service service) {
        this.service = service;
    }
}
