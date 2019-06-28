package com.wei.javadesigner.decoration.IO;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class IOExample extends FilterInputStream {

    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected IOExample(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int read = super.read();
        int i = read == -1 ? read : Character.toUpperCase((char) read);
        return i;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int read = super.read(b, off, len);
        for (int i = 0; i < off + read; i++) {
            b[i] = (byte) Character.toUpperCase(b[i]);

        }
        return read;
    }
}
