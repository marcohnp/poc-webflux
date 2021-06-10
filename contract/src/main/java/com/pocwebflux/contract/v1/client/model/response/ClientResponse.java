package com.pocwebflux.contract.v1.client.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientResponse {

    private String id;
    private String name;
    private String cpf;
    private String phone;
    private String email;
}
