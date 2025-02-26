package com.expedia.flight.offer.service;

import com.expedia.flight.offer.dto.OfferResponseDTO;
import com.expedia.flight.offer.feignclient.ExpediaFeignClient;
import org.springframework.stereotype.Service;

@Service
public class ExpediaService {
    private final ExpediaFeignClient expediaFeignClient;

    public ExpediaService(ExpediaFeignClient expediaFeignClient) {
        this.expediaFeignClient = expediaFeignClient;
    }

    public OfferResponseDTO fetchFlightOffers(String origin, String destination) {
        return expediaFeignClient.getOffers(
                "deal-finder",
                "Flight",
                origin,
                destination,
                "test",
                "test",
                100
        );
    }
}
