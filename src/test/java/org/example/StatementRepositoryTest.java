package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatementRepositoryTest {
    @Test
    void have_one_transaction_after_one_deposit() {
        StatementRepository statementRepository = new StatementRepository();
        statementRepository.deposit(1000);

        assertEquals(1, statementRepository.getAll().size());
    }

    @Test
    void have_one_transaction_after_one_withdrawal() {
        StatementRepository statementRepository = new StatementRepository();
        statementRepository.withdrawal(1000);

        assertEquals(1, statementRepository.getAll().size());
    }
}