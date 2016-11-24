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
    public void run(final rappConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    	LOGGER.info("Method App#run() called");
    	System.out.println( "Hello world, says Rapp Webservice!" );
    }

}
