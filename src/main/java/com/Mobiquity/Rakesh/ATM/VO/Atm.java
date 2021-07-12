package com.Mobiquity.Rakesh.ATM.VO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "address",
        "distance",
        "openingHours",
        "functionality",
        "type"
})
public class Atm {
    @JsonProperty("address")
    private Address address;
    @JsonProperty("distance")
    private Integer distance;
    @JsonProperty("openingHours")
    private List<OpeningHours> openingHours = null;
    @JsonProperty("functionality")
    private String functionality;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
