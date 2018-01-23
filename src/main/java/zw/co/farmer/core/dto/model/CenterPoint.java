package zw.co.farmer.core.dto.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class CenterPoint implements Serializable {

    private Long latitude;
    private Long longitude;

}
