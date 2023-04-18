package com.example.cleansystem.acceptanceTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.lang.reflect.Field;
import java.util.List;


public class feature4 {
    public class ReportGenerationSteps {
        private BusinessApplication app;
        private User user;
        private Report report;

        @Given("the user is logged in to the business application")
        public void the_user_is_logged_in_to_the_business_application() {
            app = new BusinessApplication();
            user = app.login();
        }

        @Given("the user has permission to generate reports")
        public void the_user_has_permission_to_generate_reports() {
            user.setPermission(Permission.GENERATE_REPORTS);
        }

        @Given(value = "the user has selected the {string} option")
        public void the_user_has_selected_the_option(String option) {
            app.selectReportOption(option);
        }

        @When("the user selects {string} as the date range")
        public void the_user_selects_as_the_date_range(String dateRange) {
            report.setDateRange(dateRange);
        }

        @When("the user selects the desired fields to include in the report")
        public void the_user_selects_the_desired_fields_to_include_in_the_report() {
            report.selectFields();
        }

        @When("the user selects the desired format for the report")
        public void the_user_selects_the_desired_format_for_the_report() {
            report.setFormat(ReportFormat.PDF);
        }

        @Then("the system generates a customized report about sales for the previous month")
        public void the_system_generates_a_customized_report_about_sales_for_the_previous_month() {
            report.generate();
        }

        @Then("the report includes only the fields selected by the user")
        public void the_report_includes_only_the_fields_selected_by_the_user() {
            List<Field> fields = report.getFields();
            // Check that only the selected fields are included in the report
        }

        @Then("the report is in the format selected by the user")
        public void the_report_is_in_the_format_selected_by_the_user() {
            ReportFormat format = report.getFormat();
            // Check that the report is in the selected format
        }

        @Then("the user is able to download and/or print the report")
        public void the_user_is_able_to_download_and_or_print_the_report() {
            // Check that the user is able to download and/or print the report
        }

    }


}
