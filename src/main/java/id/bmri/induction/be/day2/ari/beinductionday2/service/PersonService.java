package id.bmri.induction.be.day2.ari.beinductionday2.service;

import id.bmri.induction.be.day2.ari.beinductionday2.model.PersonRequest;
import id.bmri.induction.be.day2.ari.beinductionday2.model.PersonRespon;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    public ResponseEntity<String> callPerson(String name, Integer age) {
        String message = name +","+ age;
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    public ResponseEntity<PersonRespon> add(PersonRequest personRequest) {
        String name = personRequest.getName();
        Integer age = personRequest.getAge();
        PersonRespon personResponse = new PersonRespon(name,age);
        System.out.println(name+" , "+age+ " added");
        return new ResponseEntity<>(personResponse, HttpStatus.OK);
    }

    public ResponseEntity<String> error() {
        return new ResponseEntity<>("ERROR REQUEST", HttpStatus.BAD_REQUEST);
    }


}
