package com.pocwebflux.client.stub.model;

import com.pocwebflux.client.model.ClientModel;

public class ClientModelStub {

    public static ClientModel createClientModel(){
        return ClientModel.builder()
                .id("abc12345")
                .name("Rafael Cardoso")
                .cpf("11122233344")
                .phone("51981889999")
                .email("rafael@gmail.com")
                .build();
    }
}
