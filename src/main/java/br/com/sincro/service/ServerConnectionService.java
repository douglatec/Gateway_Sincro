package br.com.sincro.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.sincro.entity.ServerConnectionEntity;
import br.com.sincro.repository.ServerConnectionRepository;

public class ServerConnectionService {

	@Autowired
	private ServerConnectionRepository serverConnectionRepository;

	public void save(ServerConnectionEntity Connection) {
		serverConnectionRepository.save(Connection);
	}

}
