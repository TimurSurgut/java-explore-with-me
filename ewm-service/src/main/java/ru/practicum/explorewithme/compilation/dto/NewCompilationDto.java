package ru.practicum.explorewithme.compilation.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NewCompilationDto {

    List<Long> events;
    Boolean pinned;
    @NotBlank
    @Size(min = 1, max = 50, message = "Длина должна быть от 1 до 50 символов")
    String title;
}
