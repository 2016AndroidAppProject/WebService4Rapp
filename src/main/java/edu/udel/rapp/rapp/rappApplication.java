package edu.udel.rapp.rapp;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.dropwizard.Application;
import io.dropwizard.Configuration;


public class rappApplication extends Application<rappConfiguration> {
	private static final Logger LOGGER =
			LoggerFactory.getLogger(rappApplication.class);

    public static void main(final String[] args) throws Exception {
        new rappApplication().run(args);
    }

    @Override
    public String getName() {
        return "rapp";
    }

    @Override
    public void initialize(final Bootstrap<rappConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final rappConfiguration c,
                    final Environment environment) {
        // TODO: implement application
    	LOGGER.info("Method App#run() called");
    	for (int i=0; i < c.getMessageRepetitions(); i++) {
    		System.out.println(c.getMessage());
    		System.out.println(c.getAdditionalMessage());
    	}
    }

}
