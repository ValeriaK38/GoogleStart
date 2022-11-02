package org.example.Visitor;

public class Group implements Appliance {
    private final int id;
    private int size;

    public Group(int id, int size) {
        this.id = id;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", size=" + size +
                '}';
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.exportToJson(this);
    }
}
