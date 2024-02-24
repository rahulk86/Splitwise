package org.example.models;

import com.auth.modal.BaseModel;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "splitwise_groups")
public class Group extends BaseModel {
    private String name;
    private GroupType groupType;
    @OneToMany(mappedBy = "group",cascade = CascadeType.DETACH)
    private List<GroupMember> groupMembers;
    @OneToMany(mappedBy = "group",cascade = CascadeType.DETACH)
    private List<Expense> expenses;
}
