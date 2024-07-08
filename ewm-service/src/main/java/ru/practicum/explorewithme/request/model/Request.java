package ru.practicum.explorewithme.request.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.explorewithme.event.model.Event;
import ru.practicum.explorewithme.user.model.User;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "requests")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;
    @Column(name = "created_at")
     LocalDateTime createdAt;
    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "event_id", nullable = false)
     Event event;
    @ManyToOne
    @ToString.Exclude
    @JoinColumn(name = "requester_id", nullable = false)
     User requester;
    @Enumerated(value = EnumType.STRING)
     RequestStatus status;
}
