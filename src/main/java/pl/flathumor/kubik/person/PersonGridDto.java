package pl.flathumor.kubik.person;

import lombok.Builder;
import lombok.Value;

import java.util.Collection;

@Value
@Builder
public class PersonGridDto {
  Collection<PersonGridItemDto> items;
  long total;
}
