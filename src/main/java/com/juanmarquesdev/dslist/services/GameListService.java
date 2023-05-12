package com.juanmarquesdev.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.juanmarquesdev.dslist.repositories.GameListRepository;
import com.juanmarquesdev.dslist.dto.GameListDTO;

/* Register the component to be used in the application*/
@Service
public class GameListService {

    /* Injecting a repository */
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        /* stream() -> Make operations with data sequence */
        /* map() -> Transform objects */
        return gameListRepository.findAll().stream().map(x -> new GameListDTO(x)).toList();
    }

    // @Transactional(readOnly = true)
    // public GameListDTO findById(Long id) {
    //     /* We need the function get() to get the object */
    //     return new GameListDTO(gameListRepository.findById(id).get());
    // }
}
