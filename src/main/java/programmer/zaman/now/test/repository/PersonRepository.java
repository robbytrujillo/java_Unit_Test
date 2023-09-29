package programmer.zaman.now.test.repository;

import programmer.zaman.now.test.data.Person;


public interface PersonRepository { // jembatan antara program kita dan database

    Person selectById(String id); // parameter id
}
