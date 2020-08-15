package br.com.sincro.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import br.com.sincro.entity.ServerConnectionEntity;

@Transactional
public interface ServerConnectionRepository extends CrudRepository<ServerConnectionEntity, Long> {

}
