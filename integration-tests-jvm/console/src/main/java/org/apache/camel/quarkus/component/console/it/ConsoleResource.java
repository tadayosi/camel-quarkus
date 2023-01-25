/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.quarkus.component.console.it;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.apache.camel.CamelContext;
import org.jboss.logging.Logger;

@Path("/console")
@ApplicationScoped
public class ConsoleResource {

    private static final Logger LOG = Logger.getLogger(ConsoleResource.class);

    private static final String OTHER_CONSOLE = "console";
    @Inject
    CamelContext context;

    @Path("/load/other/console")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response loadOtherConsole() throws Exception {
        /* This is an autogenerated test */
        /* No way to test a Camel artifact of kind "other" */
        return Response.ok().build();
    }
}
