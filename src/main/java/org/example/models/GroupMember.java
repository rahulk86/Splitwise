package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class GroupMember extends BaseModel{
    @ManyToOne
    private User user;
    private double amount;
}
