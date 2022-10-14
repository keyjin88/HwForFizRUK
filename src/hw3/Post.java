package src.hw3;

import src.hw3.annotation.IsLike;

@IsLike
public class Post {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
