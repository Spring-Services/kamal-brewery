package com.kamal.springframework.kamalbrewery.services;

import com.kamal.springframework.kamalbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerbyId(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("BudLight")
                .beerStyle("Lager")
                .build();
    }
}
