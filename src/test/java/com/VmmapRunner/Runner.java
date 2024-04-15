package com.VmmapRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Lenovo\\eclipse-workspace\\new workspace\\VmmapProject\\src\\main\\java\\Feature",
glue="com.stepdefinition1",
plugin={"pretty","html:reports/vmmap.html","json:report/vmmap.json"}
)
public class Runner {

}
