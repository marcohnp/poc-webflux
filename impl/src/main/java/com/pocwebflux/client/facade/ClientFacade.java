package com.pocwebflux.client.facade;

import com.pocwebflux.client.model.ClientModel;
import com.pocwebflux.client.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.ClientResponse;
import reactor.core.publisher.Flux;

@Component
@AllArgsConstructor
public class ClientFacade {

    private final ClientService clientService;

    public Flux<ClientModel> findAll() {
        return clientService.findAll();
    }
}
