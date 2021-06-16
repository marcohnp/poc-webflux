package com.pocwebflux.client.stub.model;

import com.pocwebflux.client.model.ClientFindModel;

public class ClientFindModeltStub {

    public static ClientFindModel createClientFindModel(){
        return ClientFindModel.builder()
                .id("abc12345")
                .name("Rafael Cardoso")
                .cpf("11122233344")
                .phone("51981889999")
                .email("rafael@gmail.com")
                .build();
    }
}
