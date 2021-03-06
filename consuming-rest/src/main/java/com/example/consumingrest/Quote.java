package com.example.consumingrest;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
    private String type;
    @JsonProperty("value")
    private Value value1;

    public Quote() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Value getValue() {
        return value1;
    }

    public void setValue(Value value) {
        this.value1 = value;
    }

    @Override
    public String toString() {
        return "Quote{" +
               "type='" + type + "\'" +
               ",value=" + value1 + "}";
    }


}