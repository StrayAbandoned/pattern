package ru.lapshina.structural.composit;

import javax.imageio.ImageIO;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

public class Image extends File{
    private final byte[] data;

    public Image(String url) throws IOException {

        data = new byte[]{1,2,3};
    }

    @Override
    public byte[] getData() {
        return data;
    }
}
