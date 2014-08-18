/*
 *
 *  * Copyright 2013 Jive Software
 *  *
 *  *    Licensed under the Apache License, Version 2.0 (the "License");
 *  *    you may not use this file except in compliance with the License.
 *  *    You may obtain a copy of the License at
 *  *
 *  *       http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *    Unless required by applicable law or agreed to in writing, software
 *  *    distributed under the License is distributed on an "AS IS" BASIS,
 *  *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *    See the License for the specific language governing permissions and
 *  *    limitations under the License.
 *
 */

package com.jivesoftware.addon.example.service.storage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by David Nicholls.
 */
@Path("/storage")
@Singleton
public class StorageService {
    private static final Logger log = LoggerFactory.getLogger(StorageService.class);

    @POST
    @Path("/resolveResources")
    @Produces(MediaType.APPLICATION_JSON)
    public Response resolveResources(
            @HeaderParam(HttpHeaders.AUTHORIZATION) String authorization) {
        return Response.ok("resolveResources - unimplemented").build();
    } // end unregister        

    @DELETE
    @Path("/place")
    @Produces(MediaType.APPLICATION_JSON)
    public Response place(
            @HeaderParam(HttpHeaders.AUTHORIZATION) String authorization) {
        return Response.ok("place - unimplemented").build();
    } // end place    



} // end class JiveOAuth2Service