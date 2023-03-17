package dpashmentov.geocodetask.entity.address;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @JsonProperty(value = "country_code")
    private String countryCode;

    private String formatted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "postal_code")
    private String postalCode;

    @JsonProperty(value = "Components")
    private List<Components> components;
}
