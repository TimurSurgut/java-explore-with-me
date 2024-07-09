package ru.practicum.explorewithme.event.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import ru.practicum.explorewithme.event.model.Location;

import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UpdateEventUserRequest {

    @Size(min = 20, max = 2000, message = "Длина аннотации должна быть от 20 до 2000.")
    String annotation;

    @Positive
    Long category;

    @Size(min = 20, max = 7000, message = "Длина полного описания должда быть от 20 до 7000.")
    String description;

    String eventDate;

    Location location;

    Boolean paid;

    Integer participantLimit;

    Boolean requestModeration;

    String stateAction;

    @Size(min = 3, max = 120, message = "Длина заголовка от 3 до 120.")
    String title;
}
