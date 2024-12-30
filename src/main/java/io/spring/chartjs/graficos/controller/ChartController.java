package io.spring.chartjs.graficos.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ChartController {


    @GetMapping("/")
    public String index(Model model) {
    	
    	Random r = new Random();
    	
        List<Integer> dados = Arrays.asList(r.nextInt(501), r.nextInt(501), r.nextInt(500));
        List<String> labels = Arrays.asList("Abacaxi", "Banana", "Caju");

        model.addAttribute("labels", labels);
        model.addAttribute("dados", dados);

        return "index";

    }


}
