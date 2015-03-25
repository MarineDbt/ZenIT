package BL.DataClasses;

public class ContainsAcc {
	
	private Accessory acc;
	private int qty;
	
	/* Constructor */
	
	public ContainsAcc(Accessory myAccessory, int myQty)
	{
		acc = myAccessory;
		qty = myQty;
	}

	/* Getters */
	
	public Accessory getAcc()
	{
		return acc;
	}

	public int getQty()
	{
		return qty;
	}
}


