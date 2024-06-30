package ru.practicum.explorewithme.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Builder
@Table(name = "statistics")
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Statistic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;
     String app;
     String uri;
     String ip;
    @Column(name = "timestamp_hit")
     LocalDateTime timestamp;
}
