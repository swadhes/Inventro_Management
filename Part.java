package vbvsdbsv;

public class Part {
    private Integer partNumber;
    private double partCost;


    public Part(Integer partNumber,double partCost) {
    	this.partNumber=partNumber;
    	this.partCost=partCost;
    }

    public Integer getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(Integer partNumber) {
        this.partNumber = partNumber;
    }

    public double getPartCost() {
        return partCost;
    }

    public void setPartCost(double partCost) {
        this.partCost = partCost;
    }

	@Override
	public String toString() {
		return "Part [partNumber=" + partNumber + ", partCost=" + partCost + "]";
	}

   
}
