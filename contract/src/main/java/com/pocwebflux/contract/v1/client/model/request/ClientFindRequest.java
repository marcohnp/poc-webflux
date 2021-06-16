package com.pocwebflux.contract.v1.client.model.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientFindRequest {

    @ApiModelProperty(value = "Used to find a customer by id", example = "60c2146a0809fc79b0288b83")
    private String id;
    @ApiModelProperty(value = "Used to find a customer by name", example = "ana")
    private String name;
    @ApiModelProperty(value = "Used to find a customer by cpf", example = "00011122233")
    private String cpf;
    @ApiModelProperty(value = "Used to find a customer by phone", example = "51981990011")
    private String phone;
    @ApiModelProperty(value = "Used to find a customer by email", example = "ana@gmail.com")
    private String email;

    @Builder.Default
    @ApiModelProperty(value = "Used to choose the search page", example = "1")
    private Integer page = 0;
    @ApiModelProperty(value = "Used to choose the number of results per page, max 30", example = "10")
    @Max(value = 30, message = "The limit of results per page is 30.")
    @Builder.Default
    private Integer size = 10;

}
