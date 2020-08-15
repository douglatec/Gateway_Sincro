package br.com.sincro.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import br.com.sincro.entity.PositionEntity;

@Transactional
public interface PositionRepository extends CrudRepository<PositionEntity, Long> {

}
