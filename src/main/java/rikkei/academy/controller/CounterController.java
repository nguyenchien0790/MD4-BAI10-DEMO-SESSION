package rikkei.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import rikkei.academy.model.Counter;
@Controller
@SessionAttributes("counter")
public class CounterController {
    // Ham Counter() chi duoc goi lan dau tien tu lam sau no sex lay cuonter tren Session nen se tang gia trin cua cuonter
    @ModelAttribute("counter")
    public Counter setUpCounter() {
        return new Counter();
    }

    @GetMapping("/")
    public String get(@ModelAttribute("counter") Counter counter) {
        counter.increment();
        return "/index";
    }
    @GetMapping("/info")
    public String info(){
        return "/info";
    }


}

