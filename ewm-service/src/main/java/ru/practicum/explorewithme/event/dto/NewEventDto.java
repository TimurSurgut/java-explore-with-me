package ru.practicum.explorewithme.event.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import ru.practicum.explorewithme.event.model.Location;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NewEventDto {

    @NotBlank
    @Size(min = 20, max = 2000, message = "Длина аннотации должна быть от 20 до 2000.")
    String annotation;

    @NotNull
    @Positive
    Long category;

    @NotBlank
    @Size(min = 20, max = 7000, message = "Длина полного описания должда быть от 20 до 7000.")
    String description;

    @NotBlank
    String eventDate;

    @NotNull
    Location location;

    Boolean paid;

    @PositiveOrZero
    Integer participantLimit;

    Boolean requestModeration;

    @NotBlank
    @Size(min = 3, max = 120, message = "Длина заголовка от 3 до 120.")
    String title;
}
