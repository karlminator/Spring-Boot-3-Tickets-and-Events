package com.ps.springboot.tickets.events;

import org.springframework.stereotype.Repository;

import java.util.List;

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
