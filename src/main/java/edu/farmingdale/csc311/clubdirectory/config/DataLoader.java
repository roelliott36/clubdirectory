package edu.farmingdale.csc311.clubdirectory.config;
import edu.farmingdale.csc311.clubdirectory.club.Club;
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

        === DONE ===

    */

    @Bean
    CommandLineRunner loadStarterClubs(ClubRepository repository) {
        return args -> {
            if (repository.count() == 0) {
                repository.save(new Club("Computer Science Club", "Academic", "Tuesday", "Lupton Hall 120"));
                repository.save(new Club("Chess Club", "Games", "Wednesday", "Campus Center 205"));
                repository.save(new Club("Running Club", "Sports", "Friday", "Nold Hall"));
            }
        };
    }

}
