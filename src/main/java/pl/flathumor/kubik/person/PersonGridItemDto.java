package pl.flathumor.kubik.person;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class PersonGridItemDto {
  UUID id;
  String name;
  String email;
  String phone;
}
