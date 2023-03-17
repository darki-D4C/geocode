package dpashmentov.geocodetask.entity.geocoding;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class YandexGeocoderResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Id
    @Field(targetType = FieldType.OBJECT_ID)
    private String id;

    private Response response;
}
