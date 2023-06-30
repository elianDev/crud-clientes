package com.elian.crudclientes.services;

import com.elian.crudclientes.dto.ClientDTO;
import com.elian.crudclientes.entities.Client;
import com.elian.crudclientes.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Client result = repository.findById(id).get();
        return new ClientDTO(result);
    }
}
