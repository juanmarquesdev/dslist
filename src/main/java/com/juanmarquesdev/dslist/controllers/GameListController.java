package com.juanmarquesdev.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juanmarquesdev.dslist.dto.GameListDTO;
import com.juanmarquesdev.dslist.services.GameListService;

/* The controller have the responsability to control the requests called in the application using the services */
@RestController
/* Url for API */
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    public GameListService gameListService;

    /* Use this function in the request mapped */
    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }

    // @GetMapping(value = "/{id}")
    // /* PathVariable -> get the value in the request */
    // public GameDTO findById(@PathVariable Long id) {
    // return gameListService.findById(id);
    // }
}