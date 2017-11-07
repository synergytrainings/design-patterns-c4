package java.visitor.example2;

/**
 * Created by arsen.avagumyan on 11/7/2017.
 */
public abstract class Building extends Element {
    private String address;
    private Integer floor;
    private String findingsAudit;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public String getFindingsAudit() {
        return findingsAudit;
    }

    public void setFindingsAudit(String findingsAudit) {
        this.findingsAudit = findingsAudit;
    }
}
