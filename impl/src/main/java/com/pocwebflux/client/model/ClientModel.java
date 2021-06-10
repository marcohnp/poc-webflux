package com.pocwebflux.client.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClientModel {

    private String id;
    private String name;
    private String cpf;
    private String phone;
    private String email;
}
