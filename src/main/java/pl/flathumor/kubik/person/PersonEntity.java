package pl.flathumor.kubik.person;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Data
@Entity
@Table(name = "person")
public class PersonEntity {

  @Id
  @GeneratedValue
  private UUID id;

  String name;
  String email;
  String phone;
}
