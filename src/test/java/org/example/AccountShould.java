package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AccountShould {
    @Test
    void work_with_the_example() {
        // UserRepository localMockRepository = Mockito.mock(UserRepository.class);
        // Mockito.when(localMockRepository.count()).thenReturn(111L);
        MyConsoleMock console = new MyConsoleMock();

        var account = new Account(console);

        account.deposit(1000);
        account.deposit(2000);
        account.withdrawal(500);

        account.printStatement();

        console.expectToHaveBeenCalled();
    }
}