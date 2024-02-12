package vbvsdbsv;

import java.util.List;

public class StoreRoom {
    private Integer id;
    private double area;
    private List<Shelf> shelves;

    public StoreRoom() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public List<Shelf> getShelves() {
        return shelves;
    }

    public void setShelves(List<Shelf> shelves) {
        this.shelves = shelves;
    }

	@Override
	public String toString() {
		return "StoreRoom [id=" + id + ", area=" + area + ", shelves=" + shelves + "]";
	}

    
}


