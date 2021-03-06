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
 * The interface for the Base Person Request.
 */
public interface IBasePersonRequest extends IHttpRequest {

    /**
     * Gets the Person from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<Person> callback);

    /**
     * Gets the Person from the service
     * @return The Person from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Person get() throws ClientException;

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
     * Patches this Person with a source
     * @param sourcePerson The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final Person sourcePerson, final ICallback<Person> callback);

    /**
     * Patches this Person with a source
     * @param sourcePerson The source object with updates
     * @return The updated Person
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Person patch(final Person sourcePerson) throws ClientException;

    /**
     * Posts a Person with a new object
     * @param newPerson The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final Person newPerson, final ICallback<Person> callback);

    /**
     * Posts a Person with a new object
     * @param newPerson The new object to create
     * @return The created Person
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Person post(final Person newPerson) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBasePersonRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBasePersonRequest expand(final String value);

}

