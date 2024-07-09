package ru.practicum.explorewithme.user.service;

import ru.practicum.explorewithme.user.dto.UserInDto;
import ru.practicum.explorewithme.user.dto.UserOutDto;
import ru.practicum.explorewithme.user.model.User;
import ru.practicum.explorewithme.user.dto.UserWithFollowersDto;

import java.util.List;

public interface UserService {

    List<UserOutDto> findUsers(List<Long> ids, Integer from, Integer size);

    UserOutDto addUser(UserInDto inDto);

    void deleteUser(Long userId);

    User findUserById(Long userId);

    UserWithFollowersDto addFollower(Long userId, Long followerId);

    void deleteFollower(Long userId, Long followerId);
}
