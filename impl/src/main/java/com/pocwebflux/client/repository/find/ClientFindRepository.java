package com.pocwebflux.client.repository.find;

import com.pocwebflux.client.entity.ClientEntity;
import com.pocwebflux.client.model.ClientFindModel;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ClientFindRepository {

    Flux<ClientEntity> find(ClientFindModel model, Pageable request);

}