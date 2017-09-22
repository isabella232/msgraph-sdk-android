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
 * The interface for the Base Workbook Request.
 */
public interface IBaseWorkbookRequest extends IHttpRequest {

    /**
     * Gets the Workbook from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<Workbook> callback);

    /**
     * Gets the Workbook from the service
     * @return The Workbook from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Workbook get() throws ClientException;

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
     * Patches this Workbook with a source
     * @param sourceWorkbook The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final Workbook sourceWorkbook, final ICallback<Workbook> callback);

    /**
     * Patches this Workbook with a source
     * @param sourceWorkbook The source object with updates
     * @return The updated Workbook
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Workbook patch(final Workbook sourceWorkbook) throws ClientException;

    /**
     * Posts a Workbook with a new object
     * @param newWorkbook The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final Workbook newWorkbook, final ICallback<Workbook> callback);

    /**
     * Posts a Workbook with a new object
     * @param newWorkbook The new object to create
     * @return The created Workbook
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Workbook post(final Workbook newWorkbook) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseWorkbookRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseWorkbookRequest expand(final String value);

}

