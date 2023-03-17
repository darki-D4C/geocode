package dpashmentov.geocodetask.entity.geocoding;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MetaDataProperty {

   @JsonInclude(JsonInclude.Include.NON_NULL)
   @JsonProperty(value = "GeocoderMetaData")
   private GeocoderMetaData geocoderMetaData;

   @JsonInclude(JsonInclude.Include.NON_NULL)
   @JsonProperty(value = "GeocoderResponseMetaData")
   private GeocoderResponseMetaData geocoderResponseMetaData;

}
