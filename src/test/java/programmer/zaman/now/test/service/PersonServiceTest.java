package programmer.zaman.now.test.service;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
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
}
