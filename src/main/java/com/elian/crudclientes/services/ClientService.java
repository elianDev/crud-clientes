package com.elian.crudclientes.services;

import com.elian.crudclientes.dto.ClientDTO;
import com.elian.crudclientes.entities.Client;
import com.elian.crudclientes.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
=======
>>>>>>> 1ddb1d706b3f22d9cbbee85ef3bcefde2b3d127f
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
<<<<<<< HEAD

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAll(Pageable pageable) {
        Page<Client> result = repository.findAll(pageable);
        return result.map(x -> new ClientDTO(x));
    }
=======
>>>>>>> 1ddb1d706b3f22d9cbbee85ef3bcefde2b3d127f
}
