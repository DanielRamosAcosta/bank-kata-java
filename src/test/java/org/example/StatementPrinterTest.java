package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StatementPrinterTest {

        @Test
        void should_print_the_header() {
            MyConsoleMock console = new MyConsoleMock();
            StatementPrinter statementPrinter = new StatementPrinter(console);
            List<Transaction> transactions = List.of();

            statementPrinter.print(transactions);

            console.expectToHaveBeenCalledWith(List.of(
            "DATE | AMOUNT | BALANCE"
            ));
        }
}