package pl.flathumor.kubik.person;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/persons")
@RequiredArgsConstructor
public class PersonController {

  private final PersonService personService;

  @GetMapping
  public PersonGridDto getAll(@PageableDefault Pageable pageable) {
    return personService.getAll(pageable);
  }
}
