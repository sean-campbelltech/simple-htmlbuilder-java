package com.campbelltech;

import java.util.ArrayList;
import java.util.List;

public class HtmlPage {
    private String title;
    private final List<HtmlElement> elements = new ArrayList<>();
    private final StringBuilder htmlStringBuilder = new StringBuilder("<!DOCTYPE html>");
    private final static String NEW_LINE = System.lineSeparator();

    public void setTitle(String title) {
        this.title = title;
    }

    public List<HtmlElement> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        return getHtml();
    }

    private String getHtml() {
        htmlStringBuilder.append(NEW_LINE)
                .append("<html>")
                .append(NEW_LINE);
        AddTitle();
        AddBody();
        htmlStringBuilder.append("</html>");
        return htmlStringBuilder.toString();
    }

    private void AddTitle() {
        if (title != null && !title.isEmpty()) {
            htmlStringBuilder.append("<head>")
                    .append(NEW_LINE)
                    .append("<title>")
                    .append(title)
                    .append("</title>")
                    .append(NEW_LINE)
                    .append("</head>")
                    .append(NEW_LINE);
        }
    }

    private void AddBody() {
        if (!elements.isEmpty()) {
            htmlStringBuilder.append("<body>");
            for (HtmlElement element : elements) {
                htmlStringBuilder.append(element).append(NEW_LINE);
            }
            htmlStringBuilder.append("</body>").append(NEW_LINE);
        }
    }
}
