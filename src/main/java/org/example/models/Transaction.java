package org.example.models;

import com.auth.modal.BaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

    @Getter
    @Setter
    @Entity
    @Table(name = "transactions")
    public class Transaction extends BaseModel {
        @ManyToOne
        private ExpenseParticipant oweBy;
        @ManyToOne
        private ExpenseParticipant owe;
        private Double oweAmount;
        private Double paidAmount;
    }
