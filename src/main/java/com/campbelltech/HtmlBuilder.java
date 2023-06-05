package com.campbelltech;

public class HtmlBuilder {
    private final HtmlPage htmlPage = new HtmlPage();

    public HtmlBuilder() {
        // the builder constructor is a convenient place for setting object defaults if any
    }

    public HtmlBuilder AddHeader(String header) {
        return this;
    }

    public HtmlBuilder AddParagraph(String paragraphText) {
        return this;
    }

    public HtmlPage Build() {
        return htmlPage;
    }
}
