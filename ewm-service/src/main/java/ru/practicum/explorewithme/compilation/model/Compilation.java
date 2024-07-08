package ru.practicum.explorewithme.compilation.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.explorewithme.event.model.Event;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "compilations")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Compilation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;
    @Column(name = "is_pinned")
     Boolean isPinned;
     String title;
    @ManyToMany
    @JoinTable(name = "compilation_events",
            joinColumns = @JoinColumn(name = "compilation_id"),
            inverseJoinColumns = @JoinColumn(name = "event_id"))
     List<Event> events;
}
