package com.annadach;

import org.junit.jupiter.api.Test;
import java.io.InputStream;
import static org.assertj.core.api.Assertions.assertThat;

public class WorkWithDOC {

    @Test
    void parseDocFileTest() throws Exception {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String docFile;
        try (InputStream stream = classLoader.getResourceAsStream("DocFile.doc")) {
            docFile = new String(stream.readAllBytes(), "UTF-8");
        }
        assertThat(docFile).contains("Lorem ipsum");
    }
}
