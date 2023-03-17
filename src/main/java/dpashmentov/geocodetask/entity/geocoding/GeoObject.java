package dpashmentov.geocodetask.entity.geocoding;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import dpashmentov.geocodetask.entity.address.BoundedBy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GeoObject {

    private MetaDataProperty metaDataProperty;

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String description;

    private BoundedBy boundedBy;

    @JsonProperty(value = "Point")
    private Point point;


}
