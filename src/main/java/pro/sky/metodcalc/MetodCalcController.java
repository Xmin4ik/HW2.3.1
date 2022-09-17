package pro.sky.metodcalc;
// отвечает за адреса

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetodCalcController {
    private final MetodServisInterface metodCalcServis;

    public MetodCalcController(MetodServisInterface metodCalcServis) {
        this.metodCalcServis = metodCalcServis;
    }

    @GetMapping
    public String hello() {
        return metodCalcServis.hello();
    }

    @GetMapping(path = "/calculator")
    public String helloCalc() {
        return metodCalcServis.helloCalc();
    }

    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam() int num1, int num2) {

        return metodCalcServis.plus(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam() int num1, int num2) {
        return metodCalcServis.minus(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam() int num1, int num2) {
        return metodCalcServis.multiply(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam() int num1, int num2) {
        return metodCalcServis.divide(num1, num2);
    }

}
