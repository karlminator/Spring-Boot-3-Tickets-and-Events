package com.ps.springboot.tickets.events;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface OrganizerRepository extends JpaRepository<Organizer, Integer> {
}

/* --old implementation--
@Repository
public class OrganizerRepository {

    private final List<Organizer> organizers = List.of(
            new Organizer(101, "Ica", "Ica's dagliga matvaruhandel"),
            new Organizer(102, "Karbin", "Karbin Klätterhall")
    );

    public List<Organizer> findAll() {
        return organizers;
    }
}
 */
