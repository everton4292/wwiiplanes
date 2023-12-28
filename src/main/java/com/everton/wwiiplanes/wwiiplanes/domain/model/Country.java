package com.everton.wwiiplanes.wwiiplanes.domain.model;

public enum Country {
    UNITED_KINGDOM("United Kingdom"),
    GERMANY("Germany"),
    UNITED_STATES("United States"),
    JAPAN("Japan"),
    ITALY("Italy");

    private final String country;

    Country(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}
