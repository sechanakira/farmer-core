package zw.co.farmer.core.persistence.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "district")
public class District extends BaseEntity{
}
