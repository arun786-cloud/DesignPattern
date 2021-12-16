package com.arun.decoratorio;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author arun on 11/27/21
 */
public class UpperCaseInputStream extends FilterInputStream {

    protected UpperCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        final int read = in.read();
        return read == -1 ? read : Character.toUpperCase(read);
    }

}
