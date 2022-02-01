package org.sb.manageComment;

public class Utility {
    public String getExtensionFromFile(String nameDocument) {
        String[] splittedString = nameDocument.split("\\.");
        return splittedString[splittedString.length - 1].substring(0, splittedString[splittedString.length - 1].length()-1);
    }

    public String[] getCommentLine(String extension) {
        String[] element = {"", ""};
        switch(extension){
            case "php":
                return element;
            default:
                return element;
        }

    }
}
