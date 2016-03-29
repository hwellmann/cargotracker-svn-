/*
 * Copyright 2016 EOS UPTRADE GmbH.
 *
 * This is proprietary software. All rights reserved. Unauthorized use is prohibited.
 */
package net.java.cargotracker.application;

import org.wildfly.swarm.container.Container;
import org.wildfly.swarm.undertow.WARArchive;

/**
 * @author hwellmann
 *
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Container container = new Container();
        WARArchive deployment = container.createDefaultDeployment().as(WARArchive.class);//.addAllDependencies();
        container.start().deploy(deployment);
    }

}
