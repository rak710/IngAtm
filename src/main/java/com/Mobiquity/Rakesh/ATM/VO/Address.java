package com.Mobiquity.Rakesh.ATM.VO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "street",
        "housenumber",
        "postalcode",
        "city",
        "geoLocation"
})
public class Address {

    @JsonProperty("street")
    private String street;
    @JsonProperty("housenumber")
    private String houseNumber;
    @JsonProperty("postalcode")
    private String postalCode;
    @JsonProperty("city")
    private String city;
    @JsonProperty("geoLocation")
    private GeoLocation geolocation;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
