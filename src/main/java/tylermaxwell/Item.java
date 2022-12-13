package tylermaxwell;

import java.text.DecimalFormat;

public class Item {
	
	private final DecimalFormat df = new DecimalFormat( "0.00" );
    // MEMBER VARIABLES
    private String name;
    private double price;
    // CONSTRUCTOR
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return df.format(price);
	}
	public void setPrice(double price) {
		this.price = price;
	}
    
    // As always, don't forget to generate Getters and Setters!
    
    
}
