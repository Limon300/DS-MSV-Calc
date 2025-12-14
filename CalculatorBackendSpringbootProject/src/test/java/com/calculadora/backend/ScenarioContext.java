/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calculadora.backend;

import io.cucumber.spring.ScenarioScope;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

/**
 *
 * @author usuario
 */
@Component
@ScenarioScope
public class ScenarioContext {

    public Map<String,Object> backpack = new HashMap();

    public void setScenarioContext(Map backpack) {
        this.backpack = backpack;
    }

    public Map getTestUser() {
        return backpack;
    }
    
    public Object get(String key){
        return backpack.get(key);
    }
    
    public void put(String key,Object value){
        backpack.put(key, value);
    }

}