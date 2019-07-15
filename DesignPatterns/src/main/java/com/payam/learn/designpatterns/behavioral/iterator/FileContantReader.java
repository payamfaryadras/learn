package com.payam.learn.designpatterns.behavioral.iterator;

import java.io.*;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class FileContantReader implements Iterable<String> {
    private File file;
    private FileReader fileReader;
    private BufferedReader bufferedReader;

    public FileContantReader(File file) throws FileNotFoundException {
        Objects.requireNonNull(file);
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
        this.file = file;
    }

    public FileContantReader(String path) throws FileNotFoundException {
        this(new File(path));
    }

    private void initialize() throws FileNotFoundException {
        this.fileReader = new FileReader(file);
        this.bufferedReader = new BufferedReader(fileReader);
    }

    @Override
    public Iterator<String> iterator() {
        try {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (fileReader != null) {
                fileReader.close();
            }
            initialize();
        } catch (IOException e) {

        }
        return new Iterator<String>() {
            String nextLine = null;

            @Override
            public boolean hasNext() {
                if (nextLine != null) {
                    return true;
                } else {
                    try {
                        nextLine = bufferedReader.readLine();
                        return (nextLine != null);
                    } catch (IOException e) {
                        throw new UncheckedIOException(e);
                    }
                }
            }

            @Override
            public String next() {
                if ( nextLine != null || hasNext()) {
                    String line = nextLine;
                    nextLine = null;
                    return line;
                } else {
                    throw new NoSuchElementException();
                }
            }
        };
    }

}
