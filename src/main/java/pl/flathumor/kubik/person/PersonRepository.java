package pl.flathumor.kubik.person;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PersonRepository extends JpaRepository<PersonEntity, UUID> {

}
