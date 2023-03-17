package dpashmentov.geocodetask.entity.geocoding;

import com.fasterxml.jackson.annotation.JsonProperty;

import dpashmentov.geocodetask.entity.address.Address;
import dpashmentov.geocodetask.entity.address.AddressDetails;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GeocoderMetaData {

    private String precision;

    private String text;

    private String kind;

    @JsonProperty(value = "Address")
    private Address address;

    @JsonProperty(value = "AddressDetails")
    private AddressDetails addressDetails;
}
