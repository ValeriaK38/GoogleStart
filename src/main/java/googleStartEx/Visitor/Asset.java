package googleStartEx.Visitor;

public class Asset implements Appliance {
    private int serial;
    private String owner;
    private double rating;

    public Asset(int serial, String owner, double rating) {
        this.serial = serial;
        this.owner = owner;
        this.rating = rating;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Asset{" +
                "serial=" + serial +
                ", owner='" + owner + '\'' +
                ", rating=" + rating +
                '}';
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.exportToJson(this);
    }
}
