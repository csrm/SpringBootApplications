package com.example.restservice;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Greeting {
    @XmlElement(name = "id")
    private final long id;
    @XmlElement(name = "content")
    private final String content;

    public Greeting( ) {
        this.id = 1;
        this.content = "Intial Content";
    }

    public Greeting( long id, String content) {
        this.id = id;
        this.content = content;
    }
    public long getId() {
        return id;
    }
    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "id : " + id + "\ncontent : " + content;
    }
}