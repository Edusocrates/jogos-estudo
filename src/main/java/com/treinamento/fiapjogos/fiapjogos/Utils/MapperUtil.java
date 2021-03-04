package com.treinamento.fiapjogos.fiapjogos.Utils;


import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.databind.ObjectMapper;
//import com.google.common.collect.Iterables;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Optional;
import lombok.SneakyThrows;
import org.mapstruct.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Component
public class MapperUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(Exception.class);

    private final ObjectMapper objectMapper = new ObjectMapper();

    @SneakyThrows
    @Named("stringToHashmap")
    public HashMap stringToHashmap(String inch) throws JsonProcessingException {
        if (inch == null) {
            return null;
        }
        return objectMapper.readValue(inch, HashMap.class);
    }

    @SneakyThrows
    @Named("hashmapToString")
    public String hashmapToString(HashMap<?, ?> target) throws JsonProcessingException {
        if (target == null) {
            return null;
        }
        return objectMapper.writeValueAsString(target);
    }

    @SneakyThrows
    @Named("byteArrayConverter")
    public Object byteArrayConverter(byte[] inch) throws IOException {
        if (inch == null) {
            return null;
        }
        return objectMapper.readValue(inch, HashMap.class);
    }

    @SneakyThrows
    @Named("toByteArray")
    public byte[] toByteArray(Object o) throws JsonProcessingException {
        if (o == null) {
            return null;
        }
        return objectMapper.writeValueAsBytes(o);
    }

//    @SneakyThrows
//    @Named("getFirst")
//    public <T> T getFirst(Collection<T> collection) {
//        return Iterables.getFirst(collection, null);
//    }

    @SneakyThrows
    @Named("toJson")
    public String toJson(Object o) throws JsonProcessingException {
        return objectMapper.writeValueAsString(o);
    }

    public <T> T get(Optional optionalT) {
        return (T) optionalT.orElse(null);
    }
}

