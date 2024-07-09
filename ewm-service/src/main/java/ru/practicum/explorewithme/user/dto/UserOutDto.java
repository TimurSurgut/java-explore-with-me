package ru.practicum.explorewithme.user.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserOutDto {

    Long id;
    String email;
    String name;
}
