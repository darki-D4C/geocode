package dpashmentov.geocodetask.entity.address;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DependentLocality {


    private String dependentLocalityName;

    private Thoroughfare thoroughfare;

    private Premise premise;
}
