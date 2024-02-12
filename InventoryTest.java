package vbvsdbsv;

import java.util.ArrayList;
import java.util.List;

public class InventoryTest {
	static List<StoreRoom> storeRooms;
    public static void main(String[] args) {
    	 
        StoreRoom storeRoom1 = new StoreRoom();
        storeRoom1.setId(1);
        storeRoom1.setArea(100);

        Shelf shelf1 = new Shelf();
        shelf1.setId(1);
        shelf1.setVolume(200);

        List<Part> parts1 = new ArrayList<>();
        parts1.add(new Part(1, 25.50));
        parts1.add(new Part(2, 35.50));

        shelf1.setParts(parts1);

        Shelf shelf2 = new Shelf();
        shelf2.setId(2);
        shelf2.setVolume(100);

        List<Part> parts2 = new ArrayList<>();
        parts2.add(new Part(3, 11.50));
        parts2.add(new Part(4, 13.50));
        parts2.add(new Part(5, 21.50));
        parts2.add(new Part(6, 36.50));

        shelf2.setParts(parts2);

        List<Shelf> shelves1 = new ArrayList<>();
        shelves1.add(shelf1);
        shelves1.add(shelf2);

        storeRoom1.setShelves(shelves1);
        storeRooms = new ArrayList<>();

        storeRooms.add(storeRoom1);
        System.out.println(storeRooms);
        InventoryService inventoryService = new InventoryService();
        String location = inventoryService.getInventoryLocationByPartNumber(1);
        System.out.println("Location for Part : " + location);
        
        System.out.println("more than aveage cost count "+inventoryService.getNumberOfPartsGreaterThanAveragePartPrice());
    }
}
