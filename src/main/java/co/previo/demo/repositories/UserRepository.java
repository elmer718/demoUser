package co.previo.demo.repositories;

import org.springframework.stereotype.Repository;

import co.previo.demo.modelo.User;

@Repository
public class UserRepository {

	public User findUserByEmail(String email){
        User user = new User(email,"123456");
        user.setFirstName("FirstName");
        user.setLastName("LastName");
        return user;
    }
}
