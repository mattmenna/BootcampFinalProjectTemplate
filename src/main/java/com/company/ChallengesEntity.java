package com.company;

import javax.persistence.*;

@Entity
@Table(name = "challenges", schema = "projectdraftdb", catalog = "")
public class ChallengesEntity {
    private String username;
    private String category;
    private String postTitle;
    private String postText;
    private int creditReward;
    private String solvedBy;

    @Id
    @Column(name = "username", nullable = false, length = 55)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "category", nullable = false, length = 45)
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Basic
    @Column(name = "postTitle", nullable = false, length = 45)
    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    @Basic
    @Column(name = "postText", nullable = false, length = 45)
    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    @Basic
    @Column(name = "creditReward", nullable = false)
    public int getCreditReward() {
        return creditReward;
    }

    public void setCreditReward(int creditReward) {
        this.creditReward = creditReward;
    }

    @Basic
    @Column(name = "solvedBy", nullable = true, length = 45)
    public String getSolvedBy() {
        return solvedBy;
    }

    public void setSolvedBy(String solvedBy) {
        this.solvedBy = solvedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChallengesEntity that = (ChallengesEntity) o;

        if (creditReward != that.creditReward) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (category != null ? !category.equals(that.category) : that.category != null) return false;
        if (postTitle != null ? !postTitle.equals(that.postTitle) : that.postTitle != null) return false;
        if (postText != null ? !postText.equals(that.postText) : that.postText != null) return false;
        if (solvedBy != null ? !solvedBy.equals(that.solvedBy) : that.solvedBy != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (postTitle != null ? postTitle.hashCode() : 0);
        result = 31 * result + (postText != null ? postText.hashCode() : 0);
        result = 31 * result + creditReward;
        result = 31 * result + (solvedBy != null ? solvedBy.hashCode() : 0);
        return result;
    }
}
