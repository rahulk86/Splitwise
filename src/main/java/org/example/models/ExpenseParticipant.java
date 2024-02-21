package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "expenseParticipants")
public class ExpenseParticipant extends BaseModel {
    @ManyToOne
    private GroupMember groupMember;
    @ManyToOne
    private Expense expense;
    private double ownAmount;
    private double paidAmount;
}
