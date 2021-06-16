package com.pocwebflux.contract.v1.client.mapper;

import com.pocwebflux.client.model.ClientModel;
import com.pocwebflux.contract.v1.client.model.response.ClientResponse;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ClientResponseMapper {

    public static ClientResponse mapToResponse(ClientModel model) {
        return Optional.ofNullable(model)
                .map(clientFindModel -> ClientResponse.builder()
                        .id(clientFindModel.getId())
                        .name(clientFindModel.getName())
                        .cpf(clientFindModel.getCpf())
                        .phone(clientFindModel.getPhone())
                        .email(clientFindModel.getEmail())
                        .build())
                .orElse(null);
    }
}
