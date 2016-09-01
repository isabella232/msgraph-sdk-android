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
 * The class for the Base Workbook Request Builder.
 */
public class BaseWorkbookRequestBuilder extends BaseRequestBuilder implements IBaseWorkbookRequestBuilder {

    /**
     * The request builder for the Workbook
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     */
    public IWorkbookRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     */
    public IWorkbookRequest buildRequest(final List<Option> requestOptions) {
        return new WorkbookRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     * Gets the request builder for WorkbookApplication.
     */
    public IWorkbookApplicationRequestBuilder getApplication() {
        return new WorkbookApplicationRequestBuilder(getRequestUrlWithAdditionalSegment("application"), getClient(), null);
    }
    public IWorkbookNamedItemCollectionRequestBuilder getNames() {
        return new WorkbookNamedItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("names"), getClient(), null);
    }

    public IWorkbookNamedItemRequestBuilder getNames(final String id) {
        return new WorkbookNamedItemRequestBuilder(getRequestUrlWithAdditionalSegment("names") + "/" + id, getClient(), null);
    }
    public IWorkbookTableCollectionRequestBuilder getTables() {
        return new WorkbookTableCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("tables"), getClient(), null);
    }

    public IWorkbookTableRequestBuilder getTables(final String id) {
        return new WorkbookTableRequestBuilder(getRequestUrlWithAdditionalSegment("tables") + "/" + id, getClient(), null);
    }
    public IWorkbookWorksheetCollectionRequestBuilder getWorksheets() {
        return new WorkbookWorksheetCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("worksheets"), getClient(), null);
    }

    public IWorkbookWorksheetRequestBuilder getWorksheets(final String id) {
        return new WorkbookWorksheetRequestBuilder(getRequestUrlWithAdditionalSegment("worksheets") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookFunctions.
     */
    public IWorkbookFunctionsRequestBuilder getFunctions() {
        return new WorkbookFunctionsRequestBuilder(getRequestUrlWithAdditionalSegment("functions"), getClient(), null);
    }

    public IWorkbookCreateSessionRequestBuilder getCreateSession(final Boolean persistChanges) {
        return new WorkbookCreateSessionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.createSession"), getClient(), null, persistChanges);
    }

    public IWorkbookCloseSessionRequestBuilder getCloseSession() {
        return new WorkbookCloseSessionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.closeSession"), getClient(), null);
    }

    public IWorkbookRefreshSessionRequestBuilder getRefreshSession() {
        return new WorkbookRefreshSessionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.refreshSession"), getClient(), null);
    }

    public IWorkbookProcessQueryRequestBuilder getProcessQuery(final byte[] input) {
        return new WorkbookProcessQueryRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.processQuery"), getClient(), null, input);
    }
}