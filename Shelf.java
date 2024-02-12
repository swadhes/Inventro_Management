package vbvsdbsv;

import java.util.List;

public class Shelf {
    private Integer id;
    private StoreRoom storeRoom;
    private double volume;
    private List<Part> parts;


    public Shelf() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public StoreRoom getStoreRoom() {
        return storeRoom;
    }

    public void setStoreRoom(StoreRoom storeRoom) {
        this.storeRoom = storeRoom;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public List<Part> getParts() {
        return parts;
    }

    public void setParts(List<Part> parts) {
        this.parts = parts;
    }

	@Override
	public String toString() {
		return "Shelf [id=" + id + ", storeRoom=" + storeRoom + ", volume=" + volume + ", parts=" + parts + "]";
	}

    
}