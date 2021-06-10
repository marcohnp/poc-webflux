package com.pocwebflux.client.repository;

import com.pocwebflux.client.entity.ClientEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ClientRepository extends ReactiveMongoRepository<ClientEntity, String> {

    Flux<ClientEntity> findAll();
}
