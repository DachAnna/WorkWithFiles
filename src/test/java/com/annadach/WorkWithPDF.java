package com.annadach;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class WorkWithPDF {

    @Test
    void parsePdfFileTest() throws Exception {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        PDF parsed = new PDF(classLoader.getResourceAsStream("junit_guide.pdf"));
        assertThat(parsed.author).contains("Marc Philipp");
        assertThat(parsed.text).contains("The TempDirectory Extension");
    }
}
