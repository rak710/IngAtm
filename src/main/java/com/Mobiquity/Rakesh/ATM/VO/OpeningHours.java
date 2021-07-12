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
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "dayOfWeek",
        "hours"
})
public class OpeningHours {
    @JsonProperty("dayOfWeek")
    private Integer dayOfWeek;
    @JsonProperty("hours")
    private List<Hour> hour = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
