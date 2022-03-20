package CalculadoraCucumber;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions.*;

import CalculadoraCucumber.*;


class Calculator {
	
	public Calculator() {
		}
	
    public double suma(double a, double b) {
    	double suma = a+b;
        return suma;
    }
    public double resta(double a, double b) {
    	double resta = a+b;
    	return resta;
    }
    public double multiplicacion(double a, double b) {
    	double mult = a*b;
    	return mult;
    }
    public double divide(double a, double b) {
		double divide = a / b;
		return divide;
	}
	
	public int fact(int n) {
		int producto = 1;
		int numero = 2;
		while (numero <=n) {
			producto *= numero;
			numero++;
		}
		return producto;
	}
    
}

public class StepDefinitions {
	double a,b;

    @Given("I have a {Calculator}")
    

    @When("I sum <a> and <b>")
    

    @Then("The result should be {value}") 
    
}
