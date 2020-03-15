package com.kamal.springframework.kamalbrewery.services;

import com.kamal.springframework.kamalbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("BudLight")
                .beerStyle("Lager")
                .build();
    }

    @Override
    public BeerDto saveBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public BeerDto updateBeerById(UUID beerId, BeerDto beerDto) {
        return null;
    }

    @Override
    public void deleteBeerById(UUID beerId) {

    }
}
