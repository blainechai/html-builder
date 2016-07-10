package com.samsung.htmlbuilder.impl;

/**
 * Created by blainechai on 2016. 7. 8..
 */
public interface IHtmlBuilder {

    public String buildHtml(String text);

    public String markAsRed(String text);

    public String markAsBlue(String text);

    public String markAsGray(String text);

    public String markAsBlack(String text);

    public String markAsYellow(String text);

    public String addTagP(String text, Color color);

    enum Color {
        BLACK, RED, BLUE, GRAY, YELLOW
    }

}
