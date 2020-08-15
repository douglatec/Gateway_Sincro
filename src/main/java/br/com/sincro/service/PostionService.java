package br.com.sincro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sincro.entity.PositionEntity;
import br.com.sincro.repository.PositionRepository;

@Service
public class PostionService {

	@Autowired
	private PositionRepository positionRepository;

	public void save(PositionEntity position) {
		positionRepository.save(position);
	}

}
