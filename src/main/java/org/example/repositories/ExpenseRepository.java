package org.example.repositories;

import org.example.models.Expense;
import org.example.models.GroupMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense,Long> {
}
