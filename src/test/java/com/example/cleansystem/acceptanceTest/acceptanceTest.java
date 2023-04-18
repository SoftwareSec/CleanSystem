package com.example.cleansystem.acceptanceTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit. CucumberOptions.SnippetType;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions (features = "cases", monochrome = true, snippets = SnippetType. CAMELCASE,
        glue = {"com.example.cleansystem.acceptanceTest"})
public class acceptanceTest {

}