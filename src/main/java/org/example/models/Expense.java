package org.example.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "expenses")
public class Expense extends BaseModel{
    @ManyToOne
    private Group group;
    private LocalDateTime date;
    private String description;
    private Double amount;
    @OneToMany(mappedBy = "expense",cascade = CascadeType.DETACH)
    private List<ExpenseParticipant> participants;
}
