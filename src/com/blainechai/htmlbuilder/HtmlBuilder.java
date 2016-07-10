package com.blainechai.htmlbuilder;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by blainechai on 2016. 7. 8..
 */
public class HtmlBuilder {

    //    private String filePath;
//    private String fileName;
//    private String code;
    private String resultHtml = "";

    private final String YELLOW = "#ffff88";
    private final String SKYBLUE = "#00ccff";
    private final String GRAY = "#c0c0c0";
    private final String BLACK = "#ffffff";
    private final String RED = "#ff4444";
    private final String PINK = "#ffafaf";


    public HtmlBuilder(String filePath, String fileName, String code) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filePath + fileName);
            resultHtml += "<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "<title>Page Title</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    addTagP(code, BLACK) +
                    addTagP(code, RED) +
                    addTagP(code, YELLOW) +
                    addTagP(code, SKYBLUE) +
                    addTagP(code, GRAY) +
                    addTagP(code, PINK) +
                    "</body>\n" +
                    "</html>";

            fileWriter.write(resultHtml);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String addTagP(String text, String color) {
        return "<a style='background-color: " + color + "'>" + text + "</a>";
    }


}
