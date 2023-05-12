package com.juanmarquesdev.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.juanmarquesdev.dslist.repositories.GameRepository;
import com.juanmarquesdev.dslist.dto.GameDTO;
import com.juanmarquesdev.dslist.dto.GameMinDTO;

/* Register the component to be used in the application*/
@Service
public class GameService {

    /* Injecting a repository */
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        /* stream() -> Make operations with data sequence */
        /* map() -> Transform objects */
        return gameRepository.findAll().stream().map(x -> new GameMinDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        /* We need the function get() to get the object */
        return new GameDTO(gameRepository.findById(id).get());
    }
}
