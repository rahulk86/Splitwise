package org.example.services.impl;

import com.auth.modal.user.User;
import com.auth.repository.user.UserRepository;
import org.example.dtos.GroupDto;
import org.example.dtos.GroupMemberDto;
import org.example.dtos.UserDto;
import org.example.models.Group;
import org.example.models.GroupMember;
import org.example.models.GroupType;
import org.example.repositories.GroupMemberRepository;
import org.example.repositories.GroupRepository;
import org.example.services.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    private GroupRepository groupRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private GroupMemberRepository groupMemberRepository;

    @Override
    public List<GroupDto> getGroups(UserDto user) {
        return null;
    }

    @Override
    public GroupDto getGroup(Long groupId) {
        return null;
    }

    @Override
    public GroupDto createGroup(GroupDto group) {
        Group group1 = new Group();
        group1.setGroupType(GroupType.valueOf(group.getType()));
        group1.setName(group.getName());
        Group saved = groupRepository.save(group1);
        for (GroupMemberDto groupMemberDto : group.getGroupMembers()) {
            Optional<User> optionalUser = userRepository.findByEmail(groupMemberDto.getEmail());
            if (optionalUser.isEmpty()) {
                User user = new User();
                user.setName(groupMemberDto.getName());
                user.setEmail(groupMemberDto.getEmail());
                optionalUser = Optional.of(userRepository.save(user));
            }

            GroupMember groupMember = new GroupMember();
            groupMember.setGroup(saved);
            groupMember.setUser(optionalUser.get());
            groupMemberRepository.save(groupMember);

        }
        return group;
    }
}
