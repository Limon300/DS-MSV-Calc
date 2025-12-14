/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calculadora.backend.steps;

import com.calculadora.backend.CucumberSpringConfiguration;
import com.calculadora.backend.ScenarioContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author usuario
 */

public class OperacionesBasicasItSteps extends CucumberSpringConfiguration {
    @Autowired
    private ScenarioContext backpack;
    @Autowired
    RestTemplate restTemplate;
    @Value("${server.port}")
    private String port;

    
}
