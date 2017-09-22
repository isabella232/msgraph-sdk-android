// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Planner Plan Details Request.
 */
public class BasePlannerPlanDetailsRequest extends BaseRequest implements IBasePlannerPlanDetailsRequest {

    /**
     * The request for the PlannerPlanDetails
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BasePlannerPlanDetailsRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the PlannerPlanDetails from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<PlannerPlanDetails> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PlannerPlanDetails from the service
     * @return The PlannerPlanDetails from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public PlannerPlanDetails get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this PlannerPlanDetails with a source
     * @param sourcePlannerPlanDetails The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final PlannerPlanDetails sourcePlannerPlanDetails, final ICallback<PlannerPlanDetails> callback) {
        send(HttpMethod.PATCH, callback, sourcePlannerPlanDetails);
    }

    /**
     * Patches this PlannerPlanDetails with a source
     * @param sourcePlannerPlanDetails The source object with updates
     * @return The updated PlannerPlanDetails
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public PlannerPlanDetails patch(final PlannerPlanDetails sourcePlannerPlanDetails) throws ClientException {
        return send(HttpMethod.PATCH, sourcePlannerPlanDetails);
    }

    /**
     * Creates a PlannerPlanDetails with a new object
     * @param newPlannerPlanDetails The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final PlannerPlanDetails newPlannerPlanDetails, final ICallback<PlannerPlanDetails> callback) {
        send(HttpMethod.POST, callback, newPlannerPlanDetails);
    }

    /**
     * Creates a PlannerPlanDetails with a new object
     * @param newPlannerPlanDetails The new object to create
     * @return The created PlannerPlanDetails
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public PlannerPlanDetails post(final PlannerPlanDetails newPlannerPlanDetails) throws ClientException {
        return send(HttpMethod.POST, newPlannerPlanDetails);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IPlannerPlanDetailsRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (PlannerPlanDetailsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IPlannerPlanDetailsRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (PlannerPlanDetailsRequest)this;
     }

}

