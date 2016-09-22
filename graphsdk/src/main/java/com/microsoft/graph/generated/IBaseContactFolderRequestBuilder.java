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
import java.util.List;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Contact Folder Request Builder.
 */
public interface IBaseContactFolderRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     */
    IContactFolderRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     */
    IContactFolderRequest buildRequest(final List<Option> requestOptions);

    IContactCollectionRequestBuilder getContacts();

    IContactRequestBuilder getContacts(final String id);

    IContactFolderCollectionRequestBuilder getChildFolders();

    IContactFolderRequestBuilder getChildFolders(final String id);

    ISingleValueLegacyExtendedPropertyCollectionRequestBuilder getSingleValueExtendedProperties();

    ISingleValueLegacyExtendedPropertyRequestBuilder getSingleValueExtendedProperties(final String id);

    IMultiValueLegacyExtendedPropertyCollectionRequestBuilder getMultiValueExtendedProperties();

    IMultiValueLegacyExtendedPropertyRequestBuilder getMultiValueExtendedProperties(final String id);

}
