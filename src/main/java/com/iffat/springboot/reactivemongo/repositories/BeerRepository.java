package com.iffat.springboot.reactivemongo.repositories;

import com.iffat.springboot.reactivemongo.domain.Beer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface BeerRepository extends ReactiveMongoRepository<Beer, String> {
}
