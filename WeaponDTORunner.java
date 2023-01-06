package com.xworkz.pizza.constant;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.sun.xml.internal.ws.wsdl.writer.document.Types;
import com.xworkz.pizza.constant.dto.WeaponDTO;

public class WeaponDTORunner {
  

	public static void main(String[] args) {

		WeaponDTO dto = new WeaponDTO("AirGun", "Chitra", LocalDate.of(2022, 01, 20), 25000D, Types.FIRAMS);
		WeaponDTO dto1 = new WeaponDTO("adamsite", "Omkar", LocalDate.now(), 5620D, Types.CHEMICAL_WEAPONS);
		WeaponDTO dto2 = new WeaponDTO("ak46", "Raviteja", LocalDate.now(), 7852D, Types.AK47);
		WeaponDTO dto3 = new WeaponDTO("plague", "Shubam", LocalDate.now(), 15210D, Types.BIOLOGICAL_WEPONS);
		WeaponDTO dto4 = new WeaponDTO("bola", "Dharshan", LocalDate.now(), 98524D, Types.COMBAT_WEPONS);
		WeaponDTO dto5 = new WeaponDTO("cabine", "sangeetha", LocalDate.now(), 478547D, Types.FIRAMS);
		WeaponDTO dto6 = new WeaponDTO("club", "Kartik", LocalDate.now(), 795485D, Types.lONG_RANGE_WEAPONS);
		WeaponDTO dto7 = new WeaponDTO("iron", "Akshay", LocalDate.now(), 985620D, Types.Long);
		WeaponDTO dto8 = new WeaponDTO("thonawk", "Manu", LocalDate.now(), 875482D, Types.MISSILAS);
		WeaponDTO dto9 = new WeaponDTO("Automic bomb", "Govind", LocalDate.now(), 879458D, Types.NUCLEAR_WEPONS);
		WeaponDTO dto10 = new WeaponDTO("bazooka", "Jems", LocalDate.now(), 8490D, Types.ROCKET);
		WeaponDTO dto11 = new WeaponDTO("handgun", "Goslin", LocalDate.now(), 789200D, Types.SEMI_AUTOMIC);
		WeaponDTO dto12 = new WeaponDTO("cannon", "anusha", LocalDate.now(), 40000D, Types.SIGE_WEPONS);
		WeaponDTO dto13 = new WeaponDTO("long", "Nayana", LocalDate.now(), 558200D, Types.SHORT_RANGE_WEAPONS);
		WeaponDTO dto14 = new WeaponDTO("narve gas", "Nataraj", LocalDate.now(), 15022D, Types.CHEMICAL_WEAPONS);
		WeaponDTO dto15 = new WeaponDTO("grenad", "Navya", LocalDate.now(), 12000D, Types.EXPLOSSIVE);
		WeaponDTO dto16 = new WeaponDTO("catpult", "Airpitha", LocalDate.now(), 362000D, Types.SIGE_WEPONS);
		WeaponDTO dto17 = new WeaponDTO("blowgun", "Balu", LocalDate.now(), 28000D, Types.FIRAMS);
		WeaponDTO dto18 = new WeaponDTO("ICBM", "Naveen", LocalDate.now(), 98201D, Types.MISSILAS);
		WeaponDTO dto19 = new WeaponDTO("Yellow", "Shalini", LocalDate.now(), 599999D, Types.BIOLOGICAL_WEPONS);

		WeaponDTO a3=new WeaponDTO();
		Collection<WeaponDTO> wepons = Stream.of(dto, dto1, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10,
				dto11, dto12, dto13, dto14, dto15, dto16, dto17, dto18, dto19).collect(Collectors.toList());
		wepons.stream().forEach(e -> System.out.println(e));

		System.out.println(System.lineSeparator());

		System.out.println("Printing all weapon price gratherthan 100");
		wepons.stream().filter(e -> e.getPrice() > 1000).collect(Collectors.toList())
				.forEach(p -> System.out.println(p));

		System.out.println(System.lineSeparator());

		System.out.println("Print all weapons madeby and made on");
		wepons.stream().collect(Collectors.toList())
				.forEach(r -> System.out.println("Made By    : " + r.getMadeBy() + "    Made On  : " + r.getMadeOn()));

		System.out.println(System.lineSeparator());

		System.out.println("Print all the weapons by name sorted in desc order");

		wepons.stream().sorted((a1, a2) -> a2.getName().compareToIgnoreCase(a1.getName())).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));
		System.out.println(System.lineSeparator());
		System.out.println("all weapons sort by madeBy  :");
		wepons.stream().sorted((a1,a2)-> a1.getMadeBy().compareTo(a2.getMadeBy())).collect(Collectors.toList()).forEach(e->System.out.println(e));
		System.out.println(System.lineSeparator());
		System.out.println("all weapons sort by on  :");
		wepons.stream().sorted((a1,a2)->a1.getMadeOn().compareTo(a2.getMadeOn())).collect(Collectors.toList()).forEach(r->System.out.println(r));
		
		System.out.println(System.lineSeparator());
		System.out.println("all weapons sort by on  :");
		wepons.stream().sorted((a1,a2)->Double.compare(a1.getPrice(), a2.getPrice())).collect(Collectors.toList()).forEach(p->System.out.println(p));
		
		System.out.println(System.lineSeparator());
		System.out.println("all weapons sort by on  :");
		wepons.stream().sorted((a1,a2)->Double.compare(a2.getPrice(), a1.getPrice())).collect(Collectors.toList()).forEach(p->System.out.println(p));
		
		System.out.println(System.lineSeparator());
		System.out.println("all weapons sort by on  :");
		
		
	}

}
