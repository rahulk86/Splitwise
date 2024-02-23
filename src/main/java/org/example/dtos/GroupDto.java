package org.example.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GroupDto {
    private String name;
    private String type;
    private List<GroupMemberDto> groupMembers;
}
