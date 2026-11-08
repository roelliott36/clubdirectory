package edu.farmingdale.csc311.clubdirectory.club;

public interface ClubRepository {

    /*
        === specifications/guidelines ==
    1. It extends JpaRepository<Club, Long>.
    2. It declares one query method: List<Club> findByCategoryIgnoreCase(String category). Spring Data writes the query from the method name.

     */

    int count();

}
