package com.kamal.springframework.kamalbrewery.services.v2;

import com.kamal.springframework.kamalbrewery.web.model.v2.BeerDtoV2;
import com.kamal.springframework.kamalbrewery.web.model.v2.BeerStyle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
       return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .beerName("Corona")
                .beerStyle(BeerStyle.LAGER)
                .build();
    }
    @Override
    public BeerDtoV2 saveBeer(BeerDtoV2 beerDtoV2) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeerById(UUID beerId, BeerDtoV2 beerDtoV2) {
        log.debug("Updating Beer....");
    }

    @Override
    public void deleteBeerById(UUID beerId) {
        log.debug("Deleting beer....");
    }
}
