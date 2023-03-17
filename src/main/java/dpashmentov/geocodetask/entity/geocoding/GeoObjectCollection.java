package dpashmentov.geocodetask.entity.geocoding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GeoObjectCollection {

    private MetaDataProperty metaDataProperty;

    private List<FeatureMember> featureMember;


}
