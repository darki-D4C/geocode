package dpashmentov.geocodetask.entity.address;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Locality {

    @JsonProperty(value = "LocalityName")
    private String localityName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Thoroughfare")
    private Thoroughfare thoroughfare;

}
