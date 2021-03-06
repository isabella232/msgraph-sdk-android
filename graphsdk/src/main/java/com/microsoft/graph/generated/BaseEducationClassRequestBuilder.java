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
 * The class for the Base Education Class Request Builder.
 */
public class BaseEducationClassRequestBuilder extends BaseRequestBuilder implements IBaseEducationClassRequestBuilder {

    /**
     * The request builder for the EducationClass
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseEducationClassRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     */
    public IEducationClassRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     */
    public IEducationClassRequest buildRequest(final java.util.List<Option> requestOptions) {
        return new EducationClassRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IEducationSchoolCollectionWithReferencesRequestBuilder getSchools() {
        return new EducationSchoolCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("schools"), getClient(), null);
    }

    public IEducationSchoolWithReferenceRequestBuilder getSchools(final String id) {
        return new EducationSchoolWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("schools") + "/" + id, getClient(), null);
    }
    public IEducationUserCollectionWithReferencesRequestBuilder getMembers() {
        return new EducationUserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("members"), getClient(), null);
    }

    public IEducationUserWithReferenceRequestBuilder getMembers(final String id) {
        return new EducationUserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id, getClient(), null);
    }
    public IEducationUserCollectionWithReferencesRequestBuilder getTeachers() {
        return new EducationUserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("teachers"), getClient(), null);
    }

    public IEducationUserWithReferenceRequestBuilder getTeachers(final String id) {
        return new EducationUserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("teachers") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Group.
     */
    public IGroupWithReferenceRequestBuilder getGroup() {
        return new GroupWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("group"), getClient(), null);
    }

    public IEducationClassRenewRequestBuilder getRenew() {
        return new EducationClassRenewRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.renew"), getClient(), null);
    }
}
