package com.campbelltech;

import java.text.MessageFormat;

public class HtmlElement {
    public String tag;
    public String value;
    public ElementType type;

    public HtmlElement(String tag, String value, ElementType type) {
        this.tag = tag;
        this.value = value;
        this.type = type;
    }

    @Override
    public String toString() {
        switch (type) {
            case TEXT_BASED ->  {
                return MessageFormat.format("<{0}>{1}</{0}>", type, value);
            }
            case IMAGE -> {
                return MessageFormat.format("<{0}>{1}</{0}>", type, value);
            }
            case LINK -> {
            }
            case BREAK -> {
            }
            case ORDERED_LIST -> {
            }
            case UNORDERED_LIST -> {
            }
        }
        return MessageFormat.format("<{0}>{1}</{0}>", type, value);
    }
}
