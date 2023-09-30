package programmer.zaman.now.test.service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import programmer.zaman.now.test.data.Person;
import programmer.zaman.now.test.repository.PersonRepository;

@Extensions({
        @ExtendWith(MockitoExtension.class)
})

public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    private PersonService personService;

    @BeforeEach
    void setUp() {
       personService = new PersonService(personRepository);
    }

    @Test
    void testGetPersonNotFound() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
           personService.get("Not Found");
        });
    }

    @Test
    void testGetPersonSuccess() {
        // menambah behavior ke mock object (objek tiruan)
        Mockito.when(personRepository.selectById("robby"))
                .thenReturn(new Person("robby", "Robby"));

        var person = personService.get("robby");

        Assertions.assertNotNull(person);
        Assertions.assertEquals("robby", person.getId());
        Assertions.assertEquals("Robby", person.getName());
    }

    @Test
    void testRegisterSuccess() {
        var person = personService.register("Robby");

        Assertions.assertNotNull(person);
        Assertions.assertEquals("Robby", person.getName());
        Assertions.assertNotNull(person.getId());

        Mockito.verify(personRepository, Mockito.times(1))
                .insert(new Person(person.getId(), "Robby"));

    }
}
