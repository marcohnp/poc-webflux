package com.pocwebflux.contract.v1.client.mapper;

import com.pocwebflux.client.model.ClientModel;
import com.pocwebflux.contract.v1.client.model.response.ClientResponse;
import lombok.NoArgsConstructor;

import java.util.Optional;

@NoArgsConstructor
public class ClientResponseMapper {

    public static ClientResponse mapToReponse(ClientModel model) {
        return Optional.ofNullable(model)
                .map(clientModel -> ClientResponse.builder()
                        .id(clientModel.getId())
                        .name(clientModel.getName())
                        .cpf(clientModel.getCpf())
                        .phone(clientModel.getPhone())
                        .email(clientModel.getEmail())
                        .build())
                .orElse(null);
    }
}
