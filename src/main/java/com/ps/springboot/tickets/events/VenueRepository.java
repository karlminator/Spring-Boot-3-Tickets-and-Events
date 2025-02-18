package com.ps.springboot.tickets.events;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class VenueRepository {

    private final List<Venue> venues = List.of(
            new Venue(201, "Ica's Main Office", "Solnagatan 25", "Stockholm", "Sverige"),
            new Venue(202, "Västberga Coop", "Västberga Instriområde", "Stockholm", "Sverige"),
            new Venue(203, "Kungliga Slottet", "Kungsbacken 1", "Stockholm", "Sverige")
    );

    public Optional<Venue> findByInt(int id) {
        return venues.stream().filter(venue -> venue.id() == id).findAny();
    }
}
