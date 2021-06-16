package com.pocwebflux.client.stub.entity;

import com.pocwebflux.client.entity.ClientEntity;

public class ClientResponseStub {

    public static ClientEntity createClientEntity(){
        return ClientEntity.builder()
                .id("abc12345")
                .name("Rafael Cardoso")
                .cpf("11122233344")
                .phone("51981889999")
                .email("rafael@gmail.com")
                .build();
    }
}
