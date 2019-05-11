package com.payam.learn.designpatterns.creational.abstractfactory.video;

import com.payam.learn.designpatterns.creational.abstractfactory.Converter;
import com.payam.learn.designpatterns.creational.abstractfactory.MediaConverterFactory;

public class VideoConverterFactory implements MediaConverterFactory {

    public static Converter create(VideoType videoType){
        if(videoType == VideoType.AVI){
            return new AVIConverter();
        }else{
            return new MP4Converter();
        }
    }

}
