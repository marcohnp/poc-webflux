package com.pocwebflux.contract.v1.client.facade;

import com.pocwebflux.client.facade.ClientFacade;
import com.pocwebflux.contract.v1.client.mapper.ClientResponseMapper;
import com.pocwebflux.contract.v1.client.model.response.ClientResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
@AllArgsConstructor
public class ClientContractFacade {

    private final ClientFacade clientFacade;

    public Flux<ClientResponse> findAll(){
        return clientFacade.findAll().map(ClientResponseMapper::mapToReponse);
    }



}
