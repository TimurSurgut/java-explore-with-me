package ru.practicum.explorewithme.user.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserWithFollowersDto {

    Long id;
    String email;
    String name;
    List<UserOutDto> followers;
}
