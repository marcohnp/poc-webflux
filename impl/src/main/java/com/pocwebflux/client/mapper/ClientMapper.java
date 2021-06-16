package com.pocwebflux.client.mapper;

import com.pocwebflux.client.entity.ClientEntity;
import com.pocwebflux.client.model.ClientModel;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ClientMapper {

    public static ClientModel mapToModel(ClientEntity entity) {
        return Optional.ofNullable(entity)
                .map(clientEntity -> ClientModel.builder()
                .id(clientEntity.getId())
                .name(clientEntity.getName())
                .cpf(clientEntity.getCpf())
                .phone(clientEntity.getPhone())
                .email(clientEntity.getEmail())
                .build())
                .orElse(null);
    }
}
