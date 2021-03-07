package id.bmri.induction.be.day2.ari.beinductionday2.controller;


import org.springframework.web.bind.annotation.*;

@RequestMapping("/example")
@RestController
public class ExampleController {

    @GetMapping
    public String getString(){
        return "Hello";
    }

    @GetMapping("/{name}")
    public String getString2(@RequestParam(defaultValue = "10") String age, @PathVariable String name){
        return "hello " + name + " age " + age;
    }

    @PostMapping("/test2")
    public String test2(@RequestBody String name){
        return "coba lah " + name;
    }


}
