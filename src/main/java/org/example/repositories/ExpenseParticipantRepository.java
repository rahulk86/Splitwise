package org.example.repositories;

import org.example.models.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseParticipantRepository extends JpaRepository<Expense,Long> {

}
