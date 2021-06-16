package com.pocwebflux.client.service;

import com.pocwebflux.client.mapper.ClientMapper;
import com.pocwebflux.client.model.ClientFindModel;
import com.pocwebflux.client.model.ClientModel;
import com.pocwebflux.client.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@AllArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

    public Flux<ClientModel> find(ClientFindModel parameters) {
        return clientRepository.find(parameters, PageRequest.of(parameters.getPage(), parameters.getSize()))
                .map(ClientMapper::mapToModel);
    }
}
