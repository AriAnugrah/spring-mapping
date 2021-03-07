package id.bmri.induction.be.day2.ari.beinductionday2.controller;


import id.bmri.induction.be.day2.ari.beinductionday2.model.PersonRequest;
import id.bmri.induction.be.day2.ari.beinductionday2.model.PersonRespon;
import id.bmri.induction.be.day2.ari.beinductionday2.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/example/v1")
@RestController
public class ExampleController {

    @Autowired
    PersonService personService;

    @GetMapping("/{name}")
    public ResponseEntity<String> callPerson(@PathVariable String name, Integer age) {
        return personService.callPerson(name, age);
    }

    @PostMapping("/add")
    public ResponseEntity<PersonRespon> add(@RequestBody PersonRequest personRequest) {
        return personService.add(personRequest);
    }

    @PostMapping("/error")
    public ResponseEntity<String> error(){
        return personService.error();
    }

}
