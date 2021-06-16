package com.pocwebflux.client.facade;

import com.pocwebflux.client.service.ClientService;
import com.pocwebflux.client.stub.model.ClientFindModeltStub;
import com.pocwebflux.client.stub.model.ClientModelStub;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
class ClientFacadeTest {

    @Mock
    private ClientService clientService;

    @Test
    void find_should_return_sucess() {
        doReturn(Flux.just(ClientModelStub.createClientModel())).when(clientService).find(ClientFindModeltStub.createClientFindModel());

        StepVerifier.create(clientService.find(ClientFindModeltStub.createClientFindModel()))
                .expectNext(ClientModelStub.createClientModel())
                .verifyComplete();
    }


}
