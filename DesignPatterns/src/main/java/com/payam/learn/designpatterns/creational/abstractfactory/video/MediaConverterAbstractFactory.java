package com.payam.learn.designpatterns.creational.abstractfactory.video;

import com.payam.learn.designpatterns.creational.abstractfactory.ConverterType;
import com.payam.learn.designpatterns.creational.abstractfactory.MediaConverterFactory;
import com.payam.learn.designpatterns.creational.abstractfactory.image.ImageConverterFactory;

public abstract class MediaConverterAbstractFactory {

    static MediaConverterFactory createMediaFactory(ConverterType converterType){
        if(converterType == ConverterType.IMAGE){
            return new ImageConverterFactory();
        }else if(converterType == ConverterType.VIDEO){
            return new VideoConverterFactory();
        }
        return null;
    }
}
