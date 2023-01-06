package com.annadach;

import net.lingala.zip4j.ZipFile;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import net.lingala.zip4j.exception.ZipException;

import java.io.*;
import java.util.Scanner;

public class WorkWithZip {

    @Test
    void parseZipTest() throws Exception, ZipException {
        ZipFile zipFile = new ZipFile("./src/test/resources/file.zip", "password".toCharArray());
        zipFile.extractFile("file.txt", "./src/test/resources");

        FileReader reader = new FileReader("./src/test/resources/file.txt");
        Scanner scan = new Scanner(reader);
        String txtFile = scan.nextLine();

        reader.close();

        Assertions.assertThat(txtFile).contains("Example file");
    }
}
