package zw.co.farmer.core.persistence.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "ward")
public class Ward extends BaseEntity{
}
