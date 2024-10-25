package dio.my_first_web_api.handler;

import java.util.Date;

public class ResponseError {
    private Date timestamp = new Date();
    private String status = "error";
    private int statusCode = 400;
    private String error;

    public Date getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getError() {
        return this.error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
