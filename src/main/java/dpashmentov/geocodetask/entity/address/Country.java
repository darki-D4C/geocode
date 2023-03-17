package dpashmentov.geocodetask.entity.address;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Country {

    @JsonProperty(value = "AddressLine")
    private String addressLine;

    @JsonProperty(value = "CountryNameCode")
    private String countryNameCode;

    @JsonProperty(value = "CountryName")
    private String countryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "AdministrativeArea")
    private AdministrativeArea administrativeArea;

}
