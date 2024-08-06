package com.datorium.Datorium.API;

public class Christmas {
    public int giftNumber;
}

package com.datorium.Datorium.API;

public class Gift {
    public String name;
}

package com.datorium.Datorium.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@CrossOrigin
public class DatoriumApiApplication {

	public static void main(String[] args) {
		System.out.println("asd");
		SpringApplication.run(DatoriumApiApplication.class, args);
	}

	@PostMapping("/christmas")
	public Gift christmas(@RequestBody Christmas christmas) {
		var gift = new Gift();
		if (christmas.giftNumber == 1) {
			gift.name = "Toy car";
		} else if (christmas.giftNumber == 2) {
			gift.name = "Doll";
		} else if (christmas.giftNumber == 3) {
			gift.name = "Board game";
		} else {
			gift.name = "Gift card";
		}
		return gift;
	}
}

http://localhost:8080/christmas
{
  "giftNumber": 1
}
