///*
// * To change this license header, choose License Headers in Project Properties.
// *
// * and open the template in the editor.
// */
//package net.vpc.app.bdvbbroker.web.conf;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import javax.ws.rs.ProcessingException;
//import javax.ws.rs.core.Context;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.ext.*;
//import java.io.IOException;
//import java.lang.annotation.Annotation;
//import java.lang.reflect.Type;
//
///**
// * @author taha.bensalah@gmail.com
// */
//@Provider
//public class JacksonJsonParamConverterProvider implements ParamConverterProvider {
//
//    @Context
//    private Providers providers;
//
//    @Override
//    public <T> ParamConverter<T> getConverter(final Class<T> rawType,
//                                              final Type genericType,
//                                              final Annotation[] annotations) {
//        // Check whether we can convert the given type with Jackson.
//        final MessageBodyReader<T> mbr = providers.getMessageBodyReader(rawType,
//                genericType, annotations, MediaType.APPLICATION_JSON_TYPE);
//        if (mbr == null
//                || !mbr.isReadable(rawType, genericType, annotations, MediaType.APPLICATION_JSON_TYPE)) {
//            return null;
//        }
//
//        // Obtain custom ObjectMapper for special handling.
//        final ContextResolver<ObjectMapper> contextResolver = providers
//                .getContextResolver(ObjectMapper.class, MediaType.APPLICATION_JSON_TYPE);
//
//        final ObjectMapper mapper = contextResolver != null ?
//                contextResolver.getContext(rawType) : new ObjectMapper();
//
//        // Create ParamConverter.
//        return new ParamConverter<T>() {
//
//            @Override
//            public T fromString(final String value) {
//                try {
//                    return mapper.reader(rawType).readValue(value);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                    throw new ProcessingException(e);
//                }
//            }
//
//            @Override
//            public String toString(final T value) {
//                try {
//                    return mapper.writer().writeValueAsString(value);
//                } catch (JsonProcessingException e) {
//                    throw new ProcessingException(e);
//                }
//            }
//        };
//    }
//}
