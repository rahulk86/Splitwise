package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "groupMembers")
public class GroupMember extends BaseModel{
    @ManyToOne
    private User user;
    @ManyToOne
    private Group group;
}
