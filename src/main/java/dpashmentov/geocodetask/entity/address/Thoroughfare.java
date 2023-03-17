package dpashmentov.geocodetask.entity.address;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Thoroughfare {

   @JsonProperty(value = "ThoroughfareName")
   private String thoroughfareName;

   @JsonInclude(JsonInclude.Include.NON_NULL)
   @JsonProperty(value = "Premise")
   private Premise premise;
}
