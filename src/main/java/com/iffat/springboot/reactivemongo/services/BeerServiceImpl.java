package com.iffat.springboot.reactivemongo.services;

import com.iffat.springboot.reactivemongo.model.BeerDTO;
import reactor.core.publisher.Mono;

public class BeerServiceImpl implements BeerService {
    @Override
    public Mono<BeerDTO> saveBeer(BeerDTO beerDTO) {
        return null;
    }

    @Override
    public Mono<BeerDTO> getBeerById(String beerId) {
        return null;
    }
}
