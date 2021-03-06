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
 * The interface for the Base Column Definition Request.
 */
public interface IBaseColumnDefinitionRequest extends IHttpRequest {

    /**
     * Gets the ColumnDefinition from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<ColumnDefinition> callback);

    /**
     * Gets the ColumnDefinition from the service
     * @return The ColumnDefinition from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    ColumnDefinition get() throws ClientException;

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
     * Patches this ColumnDefinition with a source
     * @param sourceColumnDefinition The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final ColumnDefinition sourceColumnDefinition, final ICallback<ColumnDefinition> callback);

    /**
     * Patches this ColumnDefinition with a source
     * @param sourceColumnDefinition The source object with updates
     * @return The updated ColumnDefinition
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    ColumnDefinition patch(final ColumnDefinition sourceColumnDefinition) throws ClientException;

    /**
     * Posts a ColumnDefinition with a new object
     * @param newColumnDefinition The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final ColumnDefinition newColumnDefinition, final ICallback<ColumnDefinition> callback);

    /**
     * Posts a ColumnDefinition with a new object
     * @param newColumnDefinition The new object to create
     * @return The created ColumnDefinition
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    ColumnDefinition post(final ColumnDefinition newColumnDefinition) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseColumnDefinitionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseColumnDefinitionRequest expand(final String value);

}

