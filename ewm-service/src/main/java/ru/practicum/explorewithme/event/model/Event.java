package ru.practicum.explorewithme.event.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.explorewithme.category.model.Category;
import ru.practicum.explorewithme.compilation.model.Compilation;
import ru.practicum.explorewithme.user.model.User;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@Entity
@Table(name = "events")
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;
     String annotation;
    @ManyToOne
    @ToString.Exclude
    @JoinColumn(name = "category_id", nullable = false)
     Category category;
    @Column(name = "created_on")
     LocalDateTime createdOn;
     String description;
    @Column(name = "event_date")
     LocalDateTime eventDate;
    @ManyToOne
    @ToString.Exclude
    @JoinColumn(name = "initiator_id", nullable = false)
     User initiator;
    @Column(name = "is_paid")
     Boolean isPaid;
     String title;
    @Column(name = "loc_lat")
     Float lat;
    @Column(name = "loc_lon")
     Float lon;
    @Column(name = "participant_limit")
     Integer participantLimit;
    @Column(name = "request_moderation")
     Boolean requestModeration;
    @Column(name = "published_on")
     LocalDateTime publishedOn;
    @Enumerated(value = EnumType.STRING)
     EventState state;
    @Column(name = "confirmed_requests")
     Integer confirmedRequests;
    @ManyToMany(mappedBy = "events")
     List<Compilation> compilations;
}
