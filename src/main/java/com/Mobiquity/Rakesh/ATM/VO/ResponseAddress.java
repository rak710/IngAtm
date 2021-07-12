package com.Mobiquity.Rakesh.ATM.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseAddress {

    private String address;
    private String street;
    private String housenumber;
    private String postalcode;
    private String city;

}
