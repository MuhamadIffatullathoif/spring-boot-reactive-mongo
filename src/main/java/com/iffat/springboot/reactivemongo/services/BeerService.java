package com.iffat.springboot.reactivemongo.services;

import com.iffat.springboot.reactivemongo.model.BeerDTO;
import reactor.core.publisher.Mono;

public interface BeerService {

    Mono<BeerDTO> saveBeer(Mono<BeerDTO> beerDTO);

    Mono<BeerDTO> getBeerById(String beerId);
}
