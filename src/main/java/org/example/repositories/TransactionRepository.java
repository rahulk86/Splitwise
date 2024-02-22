package org.example.repositories;

import org.example.models.GroupMember;
import org.example.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {
}
