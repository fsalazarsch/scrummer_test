package com.nullpointerex.scrummer_test.controllers;

import com.nullpointerex.scrummer_test.entity.models.Circulo;
import com.nullpointerex.scrummer_test.entity.models.Cuadrado;
import com.nullpointerex.scrummer_test.entity.models.Figura;
import com.nullpointerex.scrummer_test.entity.models.Triangulo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@EnableAutoConfiguration
public class FiguraController {

    @GetMapping(value = "/", produces = MediaType.TEXT_PLAIN_VALUE)
    public String index(){
        return "Server OK";
    }

    @PostMapping(value = "/{nombrefigura}/{propiedad}")
    @ResponseBody
    public String getNombreFigura(@PathVariable String nombrefigura, @PathVariable String propiedad,
                                  @RequestParam(value = "lado") double lado,
                                  @RequestParam(value = "lado2") double lado2,
                                  @RequestParam(value = "lado3") double lado3) {

        Figura figura = null;
        if (nombrefigura.equals("cuadrado")){
            figura = new Cuadrado(lado);

        }

        if (nombrefigura.equals("circulo")){
            figura = new Circulo(lado);

        }

        if (nombrefigura.equals("triangulo")){
            figura = new Triangulo(lado, lado2, lado3);

        }

        if (propiedad.equals("perimetro")){
            return "El "+figura.getTipoFigura()+" tiene un "+propiedad+" de "+figura.getPerimetro();
        }

        if (propiedad.equals("area")){
            return "El "+figura.getTipoFigura()+" tiene un "+propiedad+" de "+figura.getArea();
        }

        return  "";
    }

}
