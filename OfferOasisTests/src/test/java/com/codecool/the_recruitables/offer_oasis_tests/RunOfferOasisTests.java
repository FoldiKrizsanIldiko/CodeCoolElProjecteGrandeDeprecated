package com.codecool.the_recruitables.offer_oasis_tests;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("offer_oasis_tests")
@SelectClasspathResource("com.codecool.the_recruitables.offer_oasis_tests")
@ConfigurationParameter(key=PLUGIN_PROPERTY_NAME, value = "pretty")
public class RunOfferOasisTests {
}
