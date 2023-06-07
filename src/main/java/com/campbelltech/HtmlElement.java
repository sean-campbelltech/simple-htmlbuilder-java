package com.campbelltech;

import java.text.MessageFormat;

public class HtmlElement {
    public String tag;
    public String text;

    public HtmlElement(String tag, String text) {
        this.tag = tag;
        this.text = text;
    }

    @Override
    public String toString() {
        return MessageFormat.format("<{0}>{1}</{0}>", tag, text);
    }
}
