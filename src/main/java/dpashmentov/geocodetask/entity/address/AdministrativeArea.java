package dpashmentov.geocodetask.entity.address;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdministrativeArea {

    @JsonProperty(value = "AdministrativeAreaName")
    private String administrativeAreaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Locality")
    private Locality locality;
}
