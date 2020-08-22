package br.com.sincro.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sincro.entity.PositionEntity;

@Transactional
public interface PositionRepository extends JpaRepository<PositionEntity, Long> {

}
/*
 * public interface PositionRepository extends CrudRepository<PositionEntity,
 * Long> {
 * 
 * }
 */