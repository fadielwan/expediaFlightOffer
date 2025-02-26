package com.expedia.flight.offer.feignclient;


import com.expedia.flight.offer.dto.OfferResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "expediaClient", url = "${expedia.api.url}")
public interface ExpediaFeignClient {

    @GetMapping
    OfferResponseDTO getOffers(
            @RequestParam("scenario") String scenario,
            @RequestParam("productType") String productType,
            @RequestParam("originCity") String originCity,
            @RequestParam("DestinationCity") String destinationCity,
            @RequestParam("clientId") String clientId,
            @RequestParam("uid") String uid,
            @RequestParam("page") int page
    );


}