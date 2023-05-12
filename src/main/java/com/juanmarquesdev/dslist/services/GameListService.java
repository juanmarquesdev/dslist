package com.juanmarquesdev.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.juanmarquesdev.dslist.repositories.GameListRepository;
import com.juanmarquesdev.dslist.repositories.GameRepository;
import com.juanmarquesdev.dslist.dto.GameListDTO;
import com.juanmarquesdev.dslist.projections.GameMinProjection;

/* Register the component to be used in the application*/
@Service
public class GameListService {

    /* Injecting a repository */
    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        /* stream() -> Make operations with data sequence */
        /* map() -> Transform objects */
        return gameListRepository.findAll().stream().map(x -> new GameListDTO(x)).toList();
    }
    
    @Transactional
	public void move(Long listId, int sourceIndex, int destinationIndex) {

		List<GameMinProjection> list = gameRepository.searchByList(listId);

		GameMinProjection obj = list.remove(sourceIndex);
		list.add(destinationIndex, obj);

		int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
		int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

		for (int i = min; i <= max; i++) {
			gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
		}
	}

    // @Transactional(readOnly = true)
    // public GameListDTO findById(Long id) {
    // /* We need the function get() to get the object */
    // return new GameListDTO(gameListRepository.findById(id).get());
    // }
}
