package dpashmentov.geocodetask.entity.geocoding;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GeocoderResponseMetaData {

    private String request;

    private String results;

    private String found;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Point")
    private Point point;
}
