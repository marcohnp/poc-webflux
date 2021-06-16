package com.pocwebflux.contract.v1.client.stub.model;

import com.pocwebflux.client.model.ClientModel;
import com.pocwebflux.contract.v1.client.model.response.ClientResponse;

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
