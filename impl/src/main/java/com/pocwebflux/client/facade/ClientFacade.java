package com.pocwebflux.client.facade;

import com.pocwebflux.client.model.ClientFindModel;
import com.pocwebflux.client.model.ClientModel;
import com.pocwebflux.client.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
@AllArgsConstructor
public class ClientFacade {

    private final ClientService clientService;

    public Flux<ClientModel> find(ClientFindModel parameters) {
        return clientService.find(parameters);
    }
}
