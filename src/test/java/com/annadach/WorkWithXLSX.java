package com.annadach;

import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

import static com.codeborne.xlstest.XLS.containsText;
import static org.hamcrest.MatcherAssert.assertThat;

public class WorkWithXLSX {

    @Test
    void parseExelFileTest() throws IOException {

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("ExelFile.xlsx");
        assertThat(new XLS(inputStream), containsText("воспитатель"));
    }
}
