package ru.practicum.explorewithme.user.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserInDto {

    @Email
    @NotBlank
    @Size(min = 6, max = 254, message = "Длина эл. почты должна быть от 6 до 254")
    String email;
    @NotBlank
    @Size(min = 2, max = 250, message = "Длина имени должна быть от 2 до 250")
    String name;
}
