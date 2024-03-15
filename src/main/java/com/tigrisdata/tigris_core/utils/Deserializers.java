/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.utils;

import java.io.IOException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;

public final class Deserializers {

    public static final JsonDeserializer<Boolean> BOOLEAN_STRICT = new StrictBooleanDeserializer();
    public static final JsonDeserializer<Integer> INTEGER_STRICT = new StrictIntegerDeserializer();
    public static final JsonDeserializer<Long> LONG_STRICT = new StrictLongDeserializer();
    public static final JsonDeserializer<Short> SHORT_STRICT = new StrictShortDeserializer();
    public static final JsonDeserializer<Float> FLOAT_STRICT = new StrictFloatDeserializer();
    public static final JsonDeserializer<Double> DOUBLE_STRICT = new StrictDoubleDeserializer();
    public static final JsonDeserializer<LocalDate> LOCAL_DATE_STRICT = new StrictLocalDateDeserializer();
    public static final JsonDeserializer<OffsetDateTime> OFFSET_DATE_TIME_STRICT = new StrictOffsetDateTimeDeserializer();
    public static final JsonDeserializer<String> STRING_STRICT = new StrictStringDeserializer();
    
    public static final Module STRICT_DESERIALIZERS = createStrictDeserializersModule();

    private static Module createStrictDeserializersModule() {
        SimpleModule m = new SimpleModule();
        m.addDeserializer(Boolean.class, Deserializers.BOOLEAN_STRICT);
        m.addDeserializer(Short.class, Deserializers.SHORT_STRICT);
        m.addDeserializer(Integer.class, Deserializers.INTEGER_STRICT);
        m.addDeserializer(Long.class, Deserializers.LONG_STRICT);
        m.addDeserializer(Float.class, Deserializers.FLOAT_STRICT);
        m.addDeserializer(Double.class, Deserializers.DOUBLE_STRICT);
        m.addDeserializer(OffsetDateTime.class, Deserializers.OFFSET_DATE_TIME_STRICT);
        m.addDeserializer(LocalDate.class, Deserializers.LOCAL_DATE_STRICT);
        m.addDeserializer(String.class, Deserializers.STRING_STRICT);
        return m;
    }
    
    private static final class StrictBooleanDeserializer extends StdDeserializer<Boolean> {

        private static final long serialVersionUID = 6014987192625841276L;

        StrictBooleanDeserializer() {
            super(Boolean.class);
        }

        @Override
        public Boolean deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            JsonToken t = p.currentToken();
            if (t == JsonToken.VALUE_TRUE) {
                return true;
            } else if (t == JsonToken.VALUE_FALSE) {
                return false;
            } else {
                return (Boolean) ctxt.handleUnexpectedToken(Boolean.class, p);
            }
        }
    }
    
    private static final class StrictDoubleDeserializer extends StdDeserializer<Double> {

        private static final long serialVersionUID = 5500822592284739392L;

        StrictDoubleDeserializer() {
            super(Double.class);
        }

        @Override
        public Double deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            JsonToken t = p.currentToken();
            if (t == JsonToken.VALUE_NUMBER_INT) {
                return p.getDoubleValue();
            } else if (t == JsonToken.VALUE_NUMBER_FLOAT) {
                return p.getDoubleValue();
            } else {
                return (Double) ctxt.handleUnexpectedToken(Double.class, p);
            }
        }
    }

    private static final class StrictFloatDeserializer extends StdDeserializer<Float> {

        private static final long serialVersionUID = 2207323065789635630L;

        StrictFloatDeserializer() {
            super(Float.class);
        }

        @Override
        public Float deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            JsonToken t = p.currentToken();
            if (t == JsonToken.VALUE_NUMBER_INT) {
                return p.getFloatValue();
            } else if (t == JsonToken.VALUE_NUMBER_FLOAT) {
                return p.getFloatValue();
            } else {
                return (Float) ctxt.handleUnexpectedToken(Float.class, p);
            }
        }
    }
    
    private static final class StrictIntegerDeserializer extends StdDeserializer<Integer> {

        private static final long serialVersionUID = 6079282945607228350L;

        StrictIntegerDeserializer() {
            super(Integer.class);
        }

        @Override
        public Integer deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            JsonToken t = p.currentToken();
            if (t == JsonToken.VALUE_NUMBER_INT) {
                return p.getIntValue();
            } else {
                return (Integer) ctxt.handleUnexpectedToken(Integer.class, p);
            }
        }
    }

    private static final class StrictLocalDateDeserializer extends StdDeserializer<LocalDate> {

        private static final long serialVersionUID = 6014987192625841276L;

        StrictLocalDateDeserializer() {
            super(LocalDate.class);
        }

        @Override
        public LocalDate deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {
            if (p.currentToken() == JsonToken.VALUE_STRING) {
                String text = p.getText();
                try {
                    return LocalDate.parse(text, DateTimeFormatter.ISO_LOCAL_DATE);
                } catch (DateTimeParseException e) {
                    return (LocalDate) ctxt.handleWeirdStringValue(LocalDate.class, text, e.getMessage());
                }
            } else {
                return (LocalDate) ctxt.handleUnexpectedToken(LocalDate.class, p);
            }
        }
    }

    private static final class StrictLongDeserializer extends StdDeserializer<Long> {

        private static final long serialVersionUID = -2721538755854421632L;

        public StrictLongDeserializer() {
            super(Long.class);
        }

        @Override
        public Long deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            JsonToken t = p.currentToken();
            if (t == JsonToken.VALUE_NUMBER_INT) {
                return p.getLongValue();
            } else {
                return (Long) ctxt.handleUnexpectedToken(Long.class, p);
            }
        }
    }

    private static final class StrictOffsetDateTimeDeserializer extends StdDeserializer<OffsetDateTime> {

        private static final long serialVersionUID = 6014987192625841276L;

        StrictOffsetDateTimeDeserializer() {
            super(OffsetDateTime.class);
        }

        @Override
        public OffsetDateTime deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {
            if (p.currentToken() == JsonToken.VALUE_STRING) {
                String text = p.getText();
                try {
                    return OffsetDateTime.parse(text, DateTimeFormatter.ISO_DATE_TIME);
                } catch (DateTimeParseException e) {
                    return (OffsetDateTime) ctxt.handleWeirdStringValue(OffsetDateTime.class, text, e.getMessage());
                }
            } else {
                return (OffsetDateTime) ctxt.handleUnexpectedToken(OffsetDateTime.class, p);
            }
        }
    }

    private static final class StrictShortDeserializer extends StdDeserializer<Short> {

        private static final long serialVersionUID = 2162877248512421L;

        StrictShortDeserializer() {
            super(Short.class);
        }

        @Override
        public Short deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            JsonToken t = p.currentToken();
            if (t == JsonToken.VALUE_NUMBER_INT) {
                return p.getShortValue();
            } else {
                return (Short) ctxt.handleUnexpectedToken(Short.class, p);
            }
        }
    }

    private static final class StrictStringDeserializer extends StdDeserializer<String> {

        private static final long serialVersionUID = 6014987192625841276L;

        StrictStringDeserializer() {
            super(String.class);
        }

        @Override
        public String deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            JsonToken t = p.currentToken();
            if (t == JsonToken.VALUE_STRING) {
                return p.getText();
            } else {
                return (String) ctxt.handleUnexpectedToken(String.class, p);
            }
        }
    }
}
