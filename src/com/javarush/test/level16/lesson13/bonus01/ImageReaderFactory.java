package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.BmpReader;
import com.javarush.test.level16.lesson13.bonus01.common.ImageReader;
import com.javarush.test.level16.lesson13.bonus01.common.ImageTypes;
import com.javarush.test.level16.lesson13.bonus01.common.JpgReader;
import com.javarush.test.level16.lesson13.bonus01.common.PngReader;

/**
 * Created by ion on 16.08.2016.
 */
public class ImageReaderFactory {
    public static ImageReader getReader(ImageTypes type){
        ImageReader reader;
        if (type == ImageTypes.JPG){
            reader = new JpgReader();
        } else if (type == ImageTypes.BMP){
            reader = new BmpReader();
        } else if (type == ImageTypes.PNG){
            reader = new PngReader();
        } else {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        return reader;
    }
}
