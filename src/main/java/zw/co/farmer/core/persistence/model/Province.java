package zw.co.farmer.core.persistence.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "province")
public class Province extends BaseEntity {
}
