package com.campbelltech;

public class HtmlBuilder {
    private final HtmlPage htmlPage = new HtmlPage();

    public HtmlBuilder() {
        // the builder constructor is a convenient place for setting object defaults if any
    }

    public HtmlBuilder AddTitle(String title) {
        htmlPage.setTitle(title);
        return this;
    }

    public HtmlBuilder AddHeader1(String headerText) {
        htmlPage.getElements().add(new HtmlElement("h1", headerText));
        return this;
    }

    public HtmlBuilder AddHeader2(String headerText) {
        htmlPage.getElements().add(new HtmlElement("h2", headerText));
        return this;
    }

    public HtmlBuilder AddHeader3(String headerText) {
        htmlPage.getElements().add(new HtmlElement("h3", headerText));
        return this;
    }

    public HtmlBuilder AddHeader4(String headerText) {
        htmlPage.getElements().add(new HtmlElement("h4", headerText));
        return this;
    }

    public HtmlBuilder AddParagraph(String paragraphText) {
        htmlPage.getElements().add(new HtmlElement("p", paragraphText));
        return this;
    }

    public HtmlPage Build() {
        return htmlPage;
    }
}
