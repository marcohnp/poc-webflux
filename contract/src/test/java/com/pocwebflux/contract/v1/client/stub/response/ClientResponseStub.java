package com.pocwebflux.contract.v1.client.stub.response;

import com.pocwebflux.contract.v1.client.model.response.ClientResponse;

public class ClientResponseStub {

    public static ClientResponse createClientResponse(){
        return ClientResponse.builder()
                .id("abc12345")
                .name("Rafael Cardoso")
                .cpf("11122233344")
                .phone("51981889999")
                .email("rafael@gmail.com")
                .build();
    }
}
