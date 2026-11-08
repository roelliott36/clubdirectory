package edu.farmingdale.csc311.clubdirectory.config;
import edu.farmingdale.csc311.clubdirectory.club.ClubRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    /*
        === specifications/guidelines ==
        1. Three starter classes:
            - Name: Computer Science Club \ Category: Academic \ Meeting day: Tuesday \ Room: Lupton Hall 120
            - Name: Chess Club \ Category: Games \ Meeting day: Wednesday \ Room: Campus Center 205
            - Name: Running Club \ Category: Sports \ Meeting day: Friday \ Room: Nold Hall
    */

    @Bean
    CommandLineRunner loadStarterClubs(ClubRepository repository) {
        return args -> {
            if (repository.count() == 0) {
                // save the three clubs from the table above
            }
        };
    }

}
