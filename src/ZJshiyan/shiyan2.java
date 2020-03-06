package ZJshiyan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//public class Car  {
//
//    String brand;
//    double price;
//
//    public Car(String brand, double price) {
//        this.brand = brand;
//        this.price = price;
//    }
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//
//    public double getPrice() {123wqqqqq
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//
////    @Override
////    public int compareTo(Car o) {
////        if (this.brand.compareTo(o.getBrand()) < 0)
////            return -1;
////        else if(this.brand.compareTo(o.getBrand()) > 0)
////            return 1;
////        else
////            return (int)(this.price - o.getPrice());
////    }
//}

class Car implements Comparable<Car> {

    String brand;
    double price;

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public int compareTo(Car o) {
        if (this.brand.compareTo(o.getBrand()) < 0)
            return -1;
        else if(this.brand.compareTo(o.getBrand()) > 0)
            return 1;
        else
            return (int)this.price - (int)o.getPrice();
    }
}


public class shiyan2 {
	public static void main(String[] args) {
		ArrayList<Car> list = new ArrayList<>();
		list.add(new Car("benchi", 1000));
		list.add(new Car("aaa", 1010));
		list.add(new Car("ccc", 10044));
		list.add(new Car("cdf", 1000));
		list.add(new Car("dsada", 1400));
		list.add(new Car("aaa", 1001));
		list.add(new Car("aaa", 1011));
		
		
//		Collections.sort(list);
		
		
		Collections.sort(list, new Comparator<Car>() {

			@Override
			public int compare(Car o1, Car o2) {
				// TODO Auto-generated method stub
				if(o1.getBrand().compareTo(o2.getBrand()) > 0) {
					return 1;
				}else if(o1.getBrand().compareTo(o2.getBrand()) < 0) {
					return -1;
				}else {
					return (int)(o1.price-o2.price);
				}
				
			}
		});
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getBrand()+"  "+list.get(i).getPrice());
		}

	}
}
