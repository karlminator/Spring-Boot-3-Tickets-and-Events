package com.ps.springboot.tickets.events;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public class EventRepository {

    private final List<Event> events = List.of(
            new Event(501, "Ica's Årsmöte",
                    new Organizer(101, "Ica", "Ica's dagliga matvaruhandel"),
                    new Venue(201, "Ica's Main Office", "Solnagatan 25", "Stockholm", "Sverige"),
                    LocalDate.of(2023,10, 25),
                    LocalDate.of(2023,10, 25)
                    ),
            new Event(502, "Ica's Personalfest",
                    new Organizer(101, "Ica", "Ica's dagliga matvaruhandel"),
                    new Venue(203, "Kungliga Slottet", "Kungsbacken 1", "Stockholm", "Sverige"),
                    LocalDate.of(2024,5,15),
                    LocalDate.of(2024,5,15)
                    ),
            new Event(503, "Stora Klätterdagen",
                    new Organizer(102, "Karbin", "Karbin Klätterhall"),
                    new Venue(202, "Västberga Coop", "Västberga Instriområde", "Stockholm", "Sverige"),
                    LocalDate.of(2024, 6,25),
                    LocalDate.of(2024, 6,25)
                    )
    );

    public List<Event> findByOrganizerId(int organizerId){
        return events.stream().filter(event -> event.organizer().id() == organizerId).toList();
    }

    public Optional<Event> findById(int id) {
        return events.stream().filter(event -> event.id() == id).findAny();
    }
}
