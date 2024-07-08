package ru.practicum.explorewithme.request.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.practicum.explorewithme.request.dto.ParticipationRequestDto;
import ru.practicum.explorewithme.request.service.RequestService;

import javax.validation.constraints.NotNull;
import java.util.List;

@Validated
@RestController
@RequiredArgsConstructor
public class RequestController {
    private final String path = "/users/{userId}/requests";
    private final RequestService requestService;

    @GetMapping(path)
    public List<ParticipationRequestDto> findUserRequests(@PathVariable Long userId) {
        return requestService.findUserRequests(userId);
    }

    @PostMapping(value = path)
    @ResponseStatus(HttpStatus.CREATED)
    public ParticipationRequestDto addRequest(@PathVariable Long userId,
                                              @NotNull @RequestParam Long eventId) {
        return requestService.addRequest(userId, eventId);
    }

    @PatchMapping(value = path+"/{requestId}/cancel")
    public ParticipationRequestDto rejectRequest(@PathVariable Long userId, @PathVariable Long requestId) {
        return requestService.rejectRequest(userId, requestId);
    }
}
