package org.example;
import java.util.List;

import static org.assertj.core.api.Assertions.*;


public class MyConsoleMock extends MyConsole {

    private boolean haveBeenCalled = false;
    private List<String> expectedLines;

    @Override
    public void printLine(String s) {
        this.haveBeenCalled = true;
    }

    public void expectToHaveBeenCalled() {
        // assert with assertj

        assertThat(this.haveBeenCalled).isTrue();
    }

    public void expectToHaveBeenCalledWith(List<String> strings) {

    }
}
