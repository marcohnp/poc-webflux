package com.pocwebflux.contract.v1.client.mapper;

import com.pocwebflux.contract.v1.client.stub.model.ClientFindModelStub;
import com.pocwebflux.contract.v1.client.stub.request.ClientFindRequestStub;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClientFindMapperTest {

    @Test
    void mapToModel() {
        assertEquals(ClientFindModelStub.createClientFindModel(),
                ClientFindMapper.mapToModel(ClientFindRequestStub.createClientFindRequest()));
    }

}