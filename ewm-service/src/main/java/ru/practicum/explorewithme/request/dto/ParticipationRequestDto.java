package ru.practicum.explorewithme.request.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ParticipationRequestDto {

     Long id;
    @NotBlank
     String created;
    @NotNull
     Long event;
    @NotNull
     Long requester;
    @NotBlank
     String status;
}
