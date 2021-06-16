package com.pocwebflux.contract.v1.client.facade;

import com.pocwebflux.client.facade.ClientFacade;
import com.pocwebflux.contract.v1.client.mapper.ClientFindMapper;
import com.pocwebflux.contract.v1.client.mapper.ClientResponseMapper;
import com.pocwebflux.contract.v1.client.model.request.ClientFindRequest;
import com.pocwebflux.contract.v1.client.model.response.ClientResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
@AllArgsConstructor
public class ClientContractFacade {

    private final ClientFacade clientFacade;

    public Flux<ClientResponse> find(ClientFindRequest request) {
        return clientFacade.find(ClientFindMapper.mapToModel(request))
                .map(ClientResponseMapper::mapToResponse);
    }
}
