package org.example.services;

import org.example.dtos.GroupDto;
import org.example.dtos.UserDto;

import java.util.List;

public interface GroupService {
    List<GroupDto> getGroups(UserDto user);
    GroupDto getGroup(Long groupId);
    GroupDto createGroup(GroupDto group);
}
