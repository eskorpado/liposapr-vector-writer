package com.github.eskorpado.writer;

import com.github.eskorpado.vector.VersionedVector;

import java.io.PrintStream;

public class VectorWriter {

    public VectorWriter(VersionedVector<?> vector, PrintStream out) {
        out.println("Vector printing started");
        vector.forEach(out::println);
        out.println("Vector printing finished");
    }
}
