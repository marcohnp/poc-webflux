package com.pocwebflux.contract.v1.client.facade;

import com.pocwebflux.client.facade.ClientFacade;
import com.pocwebflux.client.model.ClientFindModel;
import com.pocwebflux.contract.v1.client.stub.model.ClientFindModelStub;
import com.pocwebflux.contract.v1.client.stub.model.ClientModelStub;
import com.pocwebflux.contract.v1.client.stub.request.ClientFindRequestStub;
import com.pocwebflux.contract.v1.client.stub.response.ClientResponseStub;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.times;

@ExtendWith(MockitoExtension.class)
class ClientContractFacadeTest {

    @Mock
    private ClientFacade clientFacade;

    @InjectMocks
    private ClientContractFacade clientContractFacade;

    @Test
    void find(){
        doReturn(Flux.just(ClientModelStub.createClientModel())).when(clientFacade).find(ClientFindModelStub.createClientFindModel());

        StepVerifier.create(clientContractFacade.find(ClientFindRequestStub.createClientFindRequest()))
                .assertNext(response -> Assertions.assertEquals(response, ClientResponseStub.createClientResponse()))
                .verifyComplete();

        verify(clientFacade, times(1)).find(ClientFindModelStub.createClientFindModel());
    }
}