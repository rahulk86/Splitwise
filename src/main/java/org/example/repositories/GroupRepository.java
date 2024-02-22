package org.example.repositories;

import org.example.models.Group;
import org.example.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group,Long> {
}
