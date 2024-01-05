package com.iffat.springboot.reactivemongo.mappers;

import com.iffat.springboot.reactivemongo.domain.Beer;
import com.iffat.springboot.reactivemongo.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    BeerDTO beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDTO beerDTO);
}
