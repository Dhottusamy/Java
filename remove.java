package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class remove {

	public static void main(String[] args) {
		List<String> car=new ArrayList<>();
		car.add("Maruthi");
		car.add("Hyundai");
		car.add("Tvs");
		car.add("BMW");
		car.add("Audi");
		car.add("BMW");
		System.out.println("with the duplicate value:"+car);
		Set<String> s=new HashSet<>();
		s.addAll(car);
		System.out.println("without the duplicate:"+s);

	}

}
