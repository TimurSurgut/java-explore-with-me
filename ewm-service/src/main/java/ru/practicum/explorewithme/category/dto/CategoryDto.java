package ru.practicum.explorewithme.category.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CategoryDto {

    Long id;
    @NotBlank
    @Size(min = 1, max = 50, message = "Длина названия категории должна быть от 1 до 50")
    String name;
}
