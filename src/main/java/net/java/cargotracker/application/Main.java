package net.java.cargotracker.application;

import org.jboss.shrinkwrap.api.Archive;
import org.wildfly.swarm.container.Container;

/**
 * @author hwellmann
 *
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Container container = new Container();
        Archive<?> deployment = container.createDefaultDeployment();
        container.start().deploy(deployment);
    }

}
