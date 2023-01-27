package com.file;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Date;

public class Write {


    private static Path README_PATH = Paths.get("README.md");


    /**
     * 写入 readme.md
     *
     * @throws IOException
     */
    public static void writeFile() throws IOException {
        if (!Files.exists(README_PATH)) {
            Files.createFile(README_PATH);
        }
        Files.write(README_PATH, "##  My Test Action".getBytes());
        Files.write(README_PATH, System.lineSeparator().getBytes(), StandardOpenOption.APPEND);
        Files.write(README_PATH, DateUtil.fromateDate(new Date(),"yyyy-MM-dd HH:mm:ss").getBytes(StandardCharsets.UTF_8),StandardOpenOption.APPEND);

    }

    public static void main(String[] args) {
        try {
            writeFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
