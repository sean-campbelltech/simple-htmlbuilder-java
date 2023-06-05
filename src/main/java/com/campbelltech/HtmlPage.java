package com.campbelltech;

import java.util.ArrayList;
import java.util.List;

public class HtmlPage {
    private String title;
    private HtmlPage head;
    private HtmlPage body;
    private List<HtmlElement> elements;

    public HtmlPage() {
        // the constructor is a great place for defaults
        elements = new ArrayList<>();
        elements.add(new HtmlElement("html", null, ElementType.ROOT));
        elements.add(new HtmlElement("", null, ElementType.ROOT));
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addElement(HtmlElement element) {
        elements.add(element);
    }

    @Override
    public String toString() {
        return String.join("\n", elements.toString());
    }
}
