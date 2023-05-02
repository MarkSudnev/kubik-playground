package pl.flathumor.kubik.person;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static java.util.stream.Collectors.toList;

@Service
@RequiredArgsConstructor
public class PersonService {

  private final PersonRepository personRepository;

  @Transactional(readOnly = true)
  public PersonGridDto getAll(final Pageable pageable) {
    final var pagedPersons = personRepository.findAll(pageable);
    return PersonGridDto.builder()
        .items(
            pagedPersons.getContent().stream().map(this::toGridItemDto).collect(toList())
        )
        .total(pagedPersons.getTotalElements())
        .build();
  }

  private PersonGridItemDto toGridItemDto(final PersonEntity person) {
    return PersonGridItemDto.builder()
        .id(person.getId())
        .name(person.getName())
        .email(person.getEmail())
        .phone(person.getPhone())
        .build();
  }
}
