package com.datorium.Datorium.API;

public class Christmas {
    public int gift;  // Change to int to hold numerical value
}

package com.datorium.Datorium.API;

public class Gift {
    public String name;  // Field to hold the gift name

    // Constructor to initialize the gift name
    public Gift(String name) {
        this.name = name;
    }
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
		// Determine gift based on the number provided
		if (christmas.gift == 1) {
			return new Gift("Toy car");
		} else if (christmas.gift == 2) {
			return new Gift("Doll");
		} else if (christmas.gift == 3) {
			return new Gift("Board game");
		} else {
			return new Gift("Gift card");  // Default gift
		}
	}
}

http://localhost:8080/christmas
{
  "gift": 1
}
