package ru.practicum.explorewithme.compilation.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.explorewithme.event.dto.EventShortDto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CompilationDto {

    Long id;
    List<EventShortDto> events;
    Boolean pinned;
    @NotBlank
    @Size(min = 1, max = 50, message = "Длина должна быть от 1 до 50 символов")
    String title;
}
