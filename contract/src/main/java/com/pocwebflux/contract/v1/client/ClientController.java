package com.pocwebflux.contract.v1.client;

import com.pocwebflux.contract.v1.client.facade.ClientContractFacade;
import com.pocwebflux.contract.v1.client.model.response.ClientResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping(value = "v1/clients")
@AllArgsConstructor
public class ClientController {

    private final ClientContractFacade clientContractFacade;

    @GetMapping
    public Flux<ClientResponse> findAll() {
        return clientContractFacade.findAll();
    }
}
