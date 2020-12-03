package ru.netology.domain;

public class RepostsInfo {
    private int totalReposts;
    private String userIdRepost;
    private boolean canRepost;

    public int getTotalReposts() {
        return totalReposts;
    }

    public void setTotalReposts(int totalReposts) {
        this.totalReposts = totalReposts;
    }

    public String getUserIdRepost() {
        return userIdRepost;
    }

    public void setUserIdRepost(String userIdRepost) {
        this.userIdRepost = userIdRepost;
    }

    public boolean isCanRepost() {
        return canRepost;
    }

    public void setCanRepost(boolean canRepost) {
        this.canRepost = canRepost;
    }
}
