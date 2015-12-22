package pl.edu.wat.student.model;

/**
 * Created by Witold on 2015-12-23.
 */
public class Table {

    private int seatsNo;
    private boolean isFree;
    private String location;

    public Table(int seatsNo, boolean isFree, String location) {
        this.seatsNo = seatsNo;
        this.isFree = isFree;
        this.location = location;
    }

    public Table(int seatsNo, String location) {
        this.seatsNo = seatsNo;
        this.isFree = true;
        this.location = location;
    }

    public int getSeatsNo() {
        return seatsNo;
    }

    public void setSeatsNo(int seatsNo) {
        this.seatsNo = seatsNo;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Table{" +
                "seatsNo=" + seatsNo +
                ", isFree=" + isFree +
                ", location='" + location + '\'' +
                '}';
    }
}
