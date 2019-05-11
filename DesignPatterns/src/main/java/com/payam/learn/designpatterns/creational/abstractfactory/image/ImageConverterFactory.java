package com.payam.learn.designpatterns.creational.abstractfactory.image;

import com.payam.learn.designpatterns.creational.abstractfactory.Converter;
import com.payam.learn.designpatterns.creational.abstractfactory.MediaConverterFactory;

public class ImageConverterFactory implements MediaConverterFactory {


    public static Converter create(ImageType toImageType) {
        if (toImageType == ImageType.BMP) {
            return new BMPConverter();
        } else {
            return new JPGConverter();
        }


    }
}
