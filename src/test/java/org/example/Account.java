package org.example;

public class Account {
    private StatementRepository statementRepository = null;
    private StatementPrinter statementPrinter = null;

    public Account(MyConsole console, StatementRepository statementRepository, StatementPrinter statementPrinter) {
        this.statementRepository = statementRepository;
        this.statementPrinter = statementPrinter;
    }

    public void deposit(int i) {
        statementRepository.deposit(i);
    }

    public void withdrawal(int i) {
        statementRepository.withdrawal(i);
    }

    public void printStatement() {
        statementPrinter.print(statementRepository.getAll());
    }
}
