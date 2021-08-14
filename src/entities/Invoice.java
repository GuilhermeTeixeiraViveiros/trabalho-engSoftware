package entities;

import java.time.LocalDateTime;
import java.util.Date;

public class Invoice {
    private String id;
    private Number value;
    private Date dateRef;
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Number getValue() {
        return value;
    }

    public void setValue(Number value) {
        this.value = value;
    }

    public Date getDateRef() {
        return dateRef;
    }

    public void setDateRef(Date dateRef) {
        this.dateRef = dateRef;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Invoice(String id, Number value, String status) {
        this.id = id;
        this.value = value;
        this.status = status;
    }
}
