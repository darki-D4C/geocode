package dpashmentov.geocodetask.entity.geocoding;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FeatureMember {

    @JsonProperty(value = "GeoObject")
    private GeoObject geoObject;
}
