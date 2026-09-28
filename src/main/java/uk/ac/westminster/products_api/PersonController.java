package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/person")
    public String getPerson() {
        return "Ali, age 21";
    }

    @GetMapping("/person/second")
    public String getSecondPerson() {
        return "Sara, age 25";
    }


}
