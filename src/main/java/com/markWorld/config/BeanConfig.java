package com.markWorld.config;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.PrecisionModel;
import org.locationtech.jts.io.WKTWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public GeometryFactory geometryFactory(){
        GeometryFactory geometryFactory = new GeometryFactory(new PrecisionModel(PrecisionModel.FLOATING), 4326);
        return geometryFactory;
    }
    @Bean
    public WKTWriter wktWriter(){
        WKTWriter wktWriter = new WKTWriter();
        return wktWriter;
    }


}
