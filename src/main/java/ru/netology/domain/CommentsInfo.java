package ru.netology.domain;

public class CommentsInfo {
    private int totalComments;
    private String userIdComment;
    private boolean canComment;
    private String textComment;

    public int getTotalComments() {
        return totalComments;
    }

    public void setTotalComments(int totalComments) {
        this.totalComments = totalComments;
    }

    public String getUserIdComment() {
        return userIdComment;
    }

    public void setUserIdComment(String userIdComment) {
        this.userIdComment = userIdComment;
    }

    public boolean isCanComment() {
        return canComment;
    }

    public void setCanComment(boolean canComment) {
        this.canComment = canComment;
    }

    public String getTextComment() {
        return textComment;
    }

    public void setTextComment(String textComment) {
        this.textComment = textComment;
    }
}
