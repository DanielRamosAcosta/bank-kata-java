package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AccountShould {
    @Test
    void work_with_the_example() {
        // UserRepository localMockRepository = Mockito.mock(UserRepository.class);
        // Mockito.when(localMockRepository.count()).thenReturn(111L);
        MyConsoleMock console = new MyConsoleMock();
        StatementRepository statementRepository = new StatementRepository();
        StatementPrinter statementPrinter = new StatementPrinter(console);

        var account = new Account(console, statementRepository, statementPrinter);

        account.deposit(1000);
        account.deposit(2000);
        account.withdrawal(500);

        account.printStatement();

        console.expectToHaveBeenCalled();
    }
}