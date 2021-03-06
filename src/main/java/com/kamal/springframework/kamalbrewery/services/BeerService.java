package com.kamal.springframework.kamalbrewery.services;

import com.kamal.springframework.kamalbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID beerId);
    BeerDto saveBeer(BeerDto beerDto);
    void updateBeerById(UUID beerId, BeerDto beerDto);
    void deleteBeerById(UUID beerId);
}
