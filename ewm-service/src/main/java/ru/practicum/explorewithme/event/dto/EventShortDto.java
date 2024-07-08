package ru.practicum.explorewithme.event.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.explorewithme.category.dto.CategoryDto;
import ru.practicum.explorewithme.user.dto.UserShortDto;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EventShortDto {

     String annotation;
     CategoryDto category;
     Integer confirmedRequests;
     String eventDate;
     Long id;
     UserShortDto initiator;
     Boolean paid;
     String title;
     Long views;
}
