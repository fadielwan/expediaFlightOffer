package com.expedia.flight.offer.controller;

import com.expedia.flight.offer.dto.OfferResponseDTO;
import com.expedia.flight.offer.exception.ExpediaServiceException;
import com.expedia.flight.offer.service.ExpediaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/expedia")
public class ExpediaFlightsOfferController {
    private final ExpediaService expediaService;
    private static final Logger logger = LoggerFactory.getLogger(ExpediaFlightsOfferController.class);


    public ExpediaFlightsOfferController(ExpediaService expediaService) {
        this.expediaService = expediaService;
    }

    @GetMapping("/flight-offers")
    public ResponseEntity<OfferResponseDTO> getFlightOffers(
            @RequestParam String origin,
            @RequestParam String destination) {
        try {
            OfferResponseDTO offerResponseDTO = expediaService.fetchFlightOffers(origin, destination);

            if (Optional.ofNullable(offerResponseDTO)
                    .map(OfferResponseDTO::getOffers)
                    .filter(offers -> !offers.isEmpty())
                    .isEmpty()) {
                logger.warn("No flights found for origin: {} and destination: {}", origin, destination);
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }

            return ResponseEntity.ok(offerResponseDTO);

        } catch (ExpediaServiceException e) {
            logger.error("Expedia API Error: {}", e.getMessage(), e);
            return ResponseEntity.status(HttpStatus.BAD_GATEWAY).build();

        } catch (Exception e) {
            logger.error("Unexpected error while fetching flight offers", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

}
