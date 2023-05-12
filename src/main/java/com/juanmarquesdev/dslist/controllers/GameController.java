package com.juanmarquesdev.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juanmarquesdev.dslist.dto.GameMinDTO;
import com.juanmarquesdev.dslist.services.GameService;

/* The controller have the responsability to control the requests called in the application using the services */
@RestController
/* Url for API */
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    public GameService gameService;

    /* Use this function in the request mapped */
    @GetMapping
    public List<GameMinDTO> findAll() {
        return gameService.findAll();
    }
}
