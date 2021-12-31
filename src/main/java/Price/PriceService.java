package Price;

public class PriceService {
	
	public MyPrice myService(MyPrice myPrice){
		System.out.println(myPrice);
		MyPrice ma = new MyPrice();
		ma.setAmount(myPrice.getAmount() + 200);
		ma.setName(myPrice.getName());
		ma.setNumber(myPrice.getNumber());
		return ma;
		//myPrice.setAmount(myPrice.getAmount() + 200);
		//return myPrice;
	}

}
