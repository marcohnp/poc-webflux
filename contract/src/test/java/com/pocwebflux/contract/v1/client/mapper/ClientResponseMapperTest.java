package com.pocwebflux.contract.v1.client.mapper;

import com.pocwebflux.contract.v1.client.stub.model.ClientModelStub;
import com.pocwebflux.contract.v1.client.stub.response.ClientResponseStub;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClientResponseMapperTest {

    @Test
    void mapToResponse() {
        assertEquals(ClientResponseStub.createClientResponse(),
                ClientResponseMapper.mapToResponse(ClientModelStub.createClientModel()));
    }

}