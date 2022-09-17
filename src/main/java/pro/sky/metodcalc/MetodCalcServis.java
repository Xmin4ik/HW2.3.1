package pro.sky.metodcalc;
// отвечает за код

import org.springframework.stereotype.Service;

@Service
public class MetodCalcServis implements MetodServisInterface{
    public String hello() {
        return "<b>hello calc</b>";
    }

    public String helloCalc() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(int num1, int num2) {
        return num1 + " + " + num2 + "=" + (num1 + num2);
    }

    public String minus(int num1, int num2) {
        return num1 + "-" + num2 + "=" + (num1 - num2);
    }

    public String multiply(int num1, int num2) {
        return num1 + "*" + num2 + "=" + (num1 * num2);
    }

    public String divide(int num1, int num2) {
        String result;
        if (num2 == 0) {
            result = "На ноль нет деления";
          //  throw new IllegalArgumentException(result);
        } else {
        result = num1 +"/" +num2+"="+(num1/num2);}
        return result;
    }
}
