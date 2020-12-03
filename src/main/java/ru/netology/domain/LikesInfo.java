package ru.netology.domain;

public class LikesInfo {
    private int totalLikes;
    private String userIdLikes;
    private boolean canLike;

    public int getTotalLikes() {
        return totalLikes;
    }

    public void setTotalLikes(int totalLikes) {
        this.totalLikes = totalLikes;
    }

    public String getUserIdLikes() {
        return userIdLikes;
    }

    public void setUserIdLikes(String userIdLikes) {
        this.userIdLikes = userIdLikes;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }
}
