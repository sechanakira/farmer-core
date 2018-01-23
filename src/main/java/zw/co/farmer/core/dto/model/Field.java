package zw.co.farmer.core.dto.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Field implements Serializable {

    private Long fieldId;
    private Long fieldName;
    private Long farmId;
    @JsonProperty("acres")
    private Long farmSize;
    @JsonProperty
    private CenterPoint centerPoint;

}
