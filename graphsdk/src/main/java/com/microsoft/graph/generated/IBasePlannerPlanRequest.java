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
 * The interface for the Base Planner Plan Request.
 */
public interface IBasePlannerPlanRequest extends IHttpRequest {

    /**
     * Gets the PlannerPlan from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<PlannerPlan> callback);

    /**
     * Gets the PlannerPlan from the service
     * @return The PlannerPlan from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    PlannerPlan get() throws ClientException;

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this PlannerPlan with a source
     * @param sourcePlannerPlan The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final PlannerPlan sourcePlannerPlan, final ICallback<PlannerPlan> callback);

    /**
     * Patches this PlannerPlan with a source
     * @param sourcePlannerPlan The source object with updates
     * @return The updated PlannerPlan
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    PlannerPlan patch(final PlannerPlan sourcePlannerPlan) throws ClientException;

    /**
     * Posts a PlannerPlan with a new object
     * @param newPlannerPlan The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final PlannerPlan newPlannerPlan, final ICallback<PlannerPlan> callback);

    /**
     * Posts a PlannerPlan with a new object
     * @param newPlannerPlan The new object to create
     * @return The created PlannerPlan
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    PlannerPlan post(final PlannerPlan newPlannerPlan) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBasePlannerPlanRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBasePlannerPlanRequest expand(final String value);

}

