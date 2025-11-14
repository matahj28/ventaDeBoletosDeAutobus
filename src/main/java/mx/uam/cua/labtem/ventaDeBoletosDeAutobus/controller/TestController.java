package mx.uam.cua.labtem.ventaDeBoletosDeAutobus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hola")
    public String hola(){
        return "hola";
    }

    @GetMapping("/holajorge")
    public String holajorge(){
        return "Hola Jorge, esto es una prueba.";
    }

}
