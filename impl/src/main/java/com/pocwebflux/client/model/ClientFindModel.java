package com.pocwebflux.client.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientFindModel {

    private String id;
    private String name;
    private String cpf;
    private String phone;
    private String email;
    private Integer page;
    private Integer size;
}
