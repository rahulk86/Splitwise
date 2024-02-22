package org.example.repositories;

import org.example.models.Group;
import org.example.models.GroupMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupMemberRepository extends JpaRepository<GroupMember,Long> {
}
