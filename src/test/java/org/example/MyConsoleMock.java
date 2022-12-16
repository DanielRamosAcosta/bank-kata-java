package org.example;
import static org.assertj.core.api.Assertions.*;


public class MyConsoleMock extends MyConsole {

    private boolean haveBeenCalled = false;

    @Override
    public void printLine(String s) {
        this.haveBeenCalled = true;
    }

    public void expectToHaveBeenCalled() {
        // assert with assertj

        assertThat(this.haveBeenCalled).isTrue();
    }
}
