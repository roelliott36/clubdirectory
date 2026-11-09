package edu.farmingdale.csc311.clubdirectory.club;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ClubRepository extends JpaRepository<Club, Long> {

    /*
        === specifications/guidelines ==
    1. It extends JpaRepository<Club, Long>.
    2. It declares one query method: List<Club> findByCategoryIgnoreCase(String category). Spring Data writes the query from the method name.

        === DONE ===

     */

    List<Club> findByCategoryIgnoreCase(String category);

}
