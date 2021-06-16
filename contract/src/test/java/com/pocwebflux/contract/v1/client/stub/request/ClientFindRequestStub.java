package com.pocwebflux.contract.v1.client.stub.request;

import com.pocwebflux.contract.v1.client.model.request.ClientFindRequest;

public class ClientFindRequestStub {

    public static ClientFindRequest createClientFindRequest(){
        return ClientFindRequest.builder()
                .id("abc12345")
                .name("Rafael Cardoso")
                .cpf("11122233344")
                .phone("51981889999")
                .email("rafael@gmail.com")
                .build();
    }
}
