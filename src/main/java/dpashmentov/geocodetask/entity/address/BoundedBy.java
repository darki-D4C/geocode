package dpashmentov.geocodetask.entity.address;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoundedBy {
    @JsonProperty(value = "Envelope")
    private Envelope envelope;
}
