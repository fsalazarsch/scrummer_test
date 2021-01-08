package com.nullpointerex.scrummer_test;

import com.nullpointerex.scrummer_test.entity.models.Circulo;
import com.nullpointerex.scrummer_test.entity.models.Cuadrado;
import com.nullpointerex.scrummer_test.entity.models.Figura;
import com.nullpointerex.scrummer_test.entity.models.Triangulo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class FiguraTest{



    Figura c = new Cuadrado(3);
    Figura circ = new Circulo(5);
    Figura trectangulo = new Triangulo(5,12,13);
    Figura tequilatero = new Triangulo(5,5,5);
    Figura tisosceles = new Triangulo(3,3,2);


    @Test
    public void perimetro() throws Exception {
        assertEquals(c.getPerimetro(), 12);
        assertEquals(circ.getPerimetro(), 31.41592653589793);
        assertEquals(trectangulo.getPerimetro(), 30);
        assertEquals(tequilatero.getPerimetro(), 15);
        assertEquals(tisosceles.getPerimetro(), 8);
    }

    @Test
    public void area() throws Exception {
        assertEquals(c.getArea(), 9);
        assertEquals(circ.getArea(), 78.53981633974483);
        assertEquals(trectangulo.getArea(), 30);
        assertEquals(tequilatero.getArea(), 10.825317547305483);
        assertEquals(tisosceles.getArea(), 2.8284271247461903);
    }
}
