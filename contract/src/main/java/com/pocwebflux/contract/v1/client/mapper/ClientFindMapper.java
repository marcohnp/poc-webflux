package com.pocwebflux.contract.v1.client.mapper;

import com.pocwebflux.client.model.ClientFindModel;
import com.pocwebflux.client.model.ClientModel;
import com.pocwebflux.contract.v1.client.model.request.ClientFindRequest;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ClientFindMapper {

    public static ClientFindModel mapToModel(ClientFindRequest clientFindRequest) {
        return Optional.ofNullable(clientFindRequest)
                .map(request -> ClientFindModel.builder()
                        .id(request.getId())
                        .name(request.getName())
                        .cpf(request.getCpf())
                        .phone(request.getPhone())
                        .email(request.getEmail())
                        .page(request.getPage())
                        .size(request.getSize())
                .build()).orElse(null);
    }
}
