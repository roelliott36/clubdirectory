package edu.farmingdale.csc311.clubdirectory.club;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/clubs")
public class ClubController {

    /*
        === specifications/guidelines ==
    1. Annotate it with @RestController and @RequestMapping("/api/clubs").
    2. It receives the ClubRepository through its constructor (constructor injection).
    3. It has the three methods in the table below.

        === DONE ===

     */

    private final ClubRepository clubRepository;

    public ClubController(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    @GetMapping
    public List<Club> findAll(@RequestParam(required = false) String category) {
        if (category != null && !category.isBlank()) {
            return clubRepository.findByCategoryIgnoreCase(category);
        }

        return clubRepository.findAll();
    }


    @GetMapping("/{id}")
    public Club findById(@PathVariable Long id) {
        return clubRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "No club with id " + id
                ));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Club createClub(@Valid @RequestBody Club club) {
        Club newClub = new Club(
                club.getName(),
                club.getCategory(),
                club.getMeetingDay(),
                club.getRoom()
        );

        return clubRepository.save(newClub);
    }

}
