package mybatis.example.entity;

import java.io.Serializable;

public class BaseRequest implements Serializable {
    private String content;

    public BaseRequest() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
