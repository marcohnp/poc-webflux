package com.pocwebflux.client.repository.find;

import com.pocwebflux.client.entity.ClientEntity;
import com.pocwebflux.client.model.ClientFindModel;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.util.ObjectUtils;
import reactor.core.publisher.Flux;

@AllArgsConstructor
public class ClientFindRepositoryImpl implements ClientFindRepository{

    private final ReactiveMongoTemplate mongoTemplate;

    private static final String CASE_SENSTIVE = "i";

    @Override
    public Flux<ClientEntity> find(ClientFindModel parameters, Pageable pageable) {

        var criteria = new Criteria();
        criteriaById(parameters.getId(), criteria);
        criteriaByName(parameters.getName(), criteria);
        criteriaByCpf(parameters.getCpf(), criteria);
        criteriaByPhone(parameters.getPhone(), criteria);
        criteriaByEmail(parameters.getEmail(), criteria);

        return mongoTemplate.find(Query.query(criteria).with(pageable), ClientEntity.class);
    }

    private void criteriaById(String id, Criteria criteria){
        if(!ObjectUtils.isEmpty(id))
            criteria.and("id").is(id);
    }

    private void criteriaByName(String name, Criteria criteria){
        if(!ObjectUtils.isEmpty(name))
            criteria.and("name").regex(name, CASE_SENSTIVE);
    }

    private void criteriaByCpf(String cpf, Criteria criteria){
        if(!ObjectUtils.isEmpty(cpf))
            criteria.and("cpf").is(cpf);
    }

    private void criteriaByPhone(String phone, Criteria criteria){
        if(!ObjectUtils.isEmpty(phone))
            criteria.and("phone").is(phone);
    }

    private void criteriaByEmail(String email, Criteria criteria){
        if(!ObjectUtils.isEmpty(email))
            criteria.and("email").is(email);
    }
}
