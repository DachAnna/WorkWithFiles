package com.annadach;

import org.junit.jupiter.api.Test;

import java.io.InputStream;
import static org.assertj.core.api.Assertions.assertThat;

public class WorkWithTXT {

    @Test
    void parseTxtFileTest() throws Exception {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String txtFile;
        try (InputStream stream = classLoader.getResourceAsStream("TxtFile.txt")) {
            txtFile = new String(stream.readAllBytes());
        }
        assertThat(txtFile).contains("consider allowing users to supply configuration");
    }
}
