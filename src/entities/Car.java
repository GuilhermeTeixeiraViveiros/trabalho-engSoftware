package entities;

public class Car {
    private String plate;
    private Tag associatedTag;
    private Person owner;

    public Tag getAssociatedTag() { return associatedTag; }
    public void setAssociatedTag(Tag associatedTag) {
        this.associatedTag = associatedTag;
    }

    public String getPlate() {
        return plate;
    }
    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Person getOwner() {
        return owner;
    }
    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Car(String plate, Tag associatedTag, Person owner) {
        this.plate = plate;
        this.associatedTag = associatedTag;
        this.owner = owner;
    }
}
