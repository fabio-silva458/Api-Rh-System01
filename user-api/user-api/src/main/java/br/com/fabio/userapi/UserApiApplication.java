package br.com.fabio.userapi;

import br.com.fabio.userapi.domain.User;
import br.com.fabio.userapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class UserApiApplication implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(UserApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       userRepository.saveAll(List.of(
               new User(null, "FABIO SILVA", "fabio@gmail.com", "123",20.0)
       ));

    }
}
