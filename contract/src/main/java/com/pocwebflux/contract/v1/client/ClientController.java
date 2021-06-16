package com.pocwebflux.contract.v1.client;

import com.pocwebflux.contract.v1.client.facade.ClientContractFacade;
import com.pocwebflux.contract.v1.client.model.request.ClientFindRequest;
import com.pocwebflux.contract.v1.client.model.response.ClientResponse;
import com.pocwebflux.contract.v1.exception.StandardError;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "v1/")
@AllArgsConstructor
public class ClientController {

    private final ClientContractFacade clientContractFacade;

    @GetMapping(value = "clients")
    @ApiOperation("Lists customers according to the parameters passed.")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK", response = ClientResponse.class),
    })
    public Flux<ClientResponse> find(@Valid ClientFindRequest request) {
        return clientContractFacade.find(request);
    }
}
