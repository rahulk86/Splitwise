package org.example.services;

import org.example.dtos.GroupMemberDto;
import org.example.dtos.UserDto;

import java.util.List;

public interface GroupMemberService {
   GroupMemberDto createGroupMember(Long groupId, Long userId);
}
