package com.expedia.flight.offer.dto;

import lombok.Data;
import java.util.List;
import java.util.Map;

@Data
public class OfferResponseDTO {
    private OfferInfoDTO offerInfo;
    private UserInfoDTO userInfo;
    private OfferPaginationDTO offerPagination;
    private DebugInfoDTO debugInfo;
    private AbInfoDTO abInfo;
    private Map<String, List<FlightOfferDTO>> offers;  // Maps "Flight" list

    @Data
    public static class OfferInfoDTO {
        private String siteID;
        private String language;
        private String currency;
    }

    @Data
    public static class UserInfoDTO {
        private PersonaDTO persona;
        private String userId;
    }

    @Data
    public static class PersonaDTO {
        private String personaType;
    }

    @Data
    public static class OfferPaginationDTO {
        private int currentPage;
        private int totalPages;
        private int totalOffers;
    }

    @Data
    public static class DebugInfoDTO {
        private String requestId;
    }

    @Data
    public static class AbInfoDTO {
        private boolean displayDestinationAlternativeIsAvailable;
    }

    @Data
    public static class FlightOfferDTO {
        private OfferDateRangeDTO offerDateRange;
        private DestinationDTO destination;
        private boolean displayDestinationAlternativeIsAvailable;
        private FlightInfoDTO flightInfo;
        private FlightPricingInfoDTO flightPricingInfo;
        private FlightUrlsDTO flightUrls;
        private int position;
        private OriginDTO origin;
    }

    @Data
    public static class OfferDateRangeDTO {
        private List<Integer> travelStartDate;
        private List<Integer> travelEndDate;
        private String formattedTravelStartDate;
        private String formattedTravelEndDate;
        private int lengthOfStay;
    }

    @Data
    public static class DestinationDTO {
        private String regionID;
        private String longName;
        private String continent;
        private String country;
        private String province;
        private String city;
        private String displayDestination;
        private String displayDestinationRegionId;
        private String tla;
        private String image;
        private int personalizedRank;
    }

    @Data
    public static class FlightInfoDTO {
        private String flightDealCarrier;
        private String flightDealCarrierName;
        private String lastObservedDate;
        private int lengthOfStay;
        private String flightClass;
        private String flightDealCarrierImageUrl;
        private String flightDealCarrierImageUrlSqSvg;
        private String tripType;
    }

    @Data
    public static class FlightPricingInfoDTO {
        private String currencyCode;
        private double flightTotalBaseFare;
        private double flightTotalTax;
        private double flightTotalPrice;
        private double flightPerPsgrBaseFare;
        private double flightPerPsgrTax;
        private double flightPerPsgrBaseFarePlusTax;
        private double flightPerPsgrTotalPrice;
        private double trendAgcyFlightPrice;
        private double pctChangeFromTrend;
        private String formattedTotalPriceValue;
    }

    @Data
    public static class FlightUrlsDTO {
        private String flightSearchUrl;
        private String decodedFlightSearchUrl;
    }

    @Data
    public static class OriginDTO {
        private String regionID;
        private String longName;
        private String country;
        private String province;
        private String city;
        private String tla;
        private String metrocode;
        private String source;
    }
}

