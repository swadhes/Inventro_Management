package vbvsdbsv;

import java.util.List;

public class InventoryService {
    public String getInventoryLocationByPartNumber(Integer partNumber) {
        for (StoreRoom storeRoom : InventoryTest.storeRooms) {
            for (Shelf shelf : storeRoom.getShelves()) {
                for (Part part : shelf.getParts()) {
                    if (part.getPartNumber().equals(partNumber)) {
                        return "Store Room Id: " + storeRoom.getId() + ", Shelf Id: " + shelf.getId();
                    }
                }
            }
        }
        return "Part not found in inventory";
    }

    public Integer getNumberOfPartsGreaterThanAveragePartPrice() {
        double totalPartPrice = 0;
        int totalPartCount = 0;

        for (StoreRoom storeRoom : InventoryTest.storeRooms) {
            for (Shelf shelf : storeRoom.getShelves()) {
                for (Part part : shelf.getParts()) {
                    totalPartPrice += part.getPartCost();
                    totalPartCount++;
                }
            }
        }

        if (totalPartCount > 0) {
            double averagePartPrice = totalPartPrice / totalPartCount;
            
            int countAboveAverage = 0;

            for (StoreRoom storeRoom : InventoryTest.storeRooms) {
                for (Shelf shelf : storeRoom.getShelves()) {
                    for (Part part : shelf.getParts()) {
                        if (part.getPartCost() > averagePartPrice) {
                            countAboveAverage++;
                        }
                    }
                }
            }

            return countAboveAverage;
        } else {
            return 0;
        }
    }
}

