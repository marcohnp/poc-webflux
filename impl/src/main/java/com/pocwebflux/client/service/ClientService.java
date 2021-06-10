package com.pocwebflux.client.service;

import com.pocwebflux.client.mapper.ClientMapper;
import com.pocwebflux.client.model.ClientModel;
import com.pocwebflux.client.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@AllArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

    public Flux<ClientModel> findAll(){
        return clientRepository.findAll()
                .map(ClientMapper::mapToModel);
    }
}
