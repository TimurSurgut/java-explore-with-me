package ru.practicum.explorewithme.compilation.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.Size;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UpdateCompilationRequest {

    List<Long> events;
    Boolean pinned;
    @Size(min = 1, max = 50, message = "Длина должна быть от 1 до 50 символов")
    String title;
}
