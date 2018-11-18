package org.shaong.javagoproxy.models;

import lombok.Data;

@Data
public class Address {
    String street;
    String suite;
    String city;
    String zipcode;
    Geo geo;
}
