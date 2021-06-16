package com.pocwebflux.client.repository;

import com.pocwebflux.client.entity.ClientEntity;
import com.pocwebflux.client.repository.find.ClientFindRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends ReactiveMongoRepository<ClientEntity, String>, ClientFindRepository {
}
