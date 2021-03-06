package entities;

import org.json.simple.JSONObject;

public class Vehicle {
    private String plate;
    private Tag associatedTag;
    private Person owner;

    public Tag getAssociatedTag() { return associatedTag; }
    public void setAssociatedTag(Tag associatedTag) {
        this.associatedTag = associatedTag;
    }

    public String getPlate() {
        return this.plate;
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

    public Vehicle(String plate, Tag associatedTag, Person owner) {
        this.plate = plate;
        this.associatedTag = associatedTag;
        this.owner = owner;
    }

    public JSONObject ToJSONObject(){
        JSONObject json = new JSONObject();
        json.put("AssociatedTag", this.getAssociatedTag().getId());
        json.put("Plate", this.getPlate());
        json.put("Owner", this.getOwner().getId());
        return json;
    }
}











