package dpashmentov.geocodetask.entity.address;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Premise {

    @JsonProperty(value = "PremiseNumber")
    private String premiseNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "PostalCode")
    private PostalCode postalCode;
}
