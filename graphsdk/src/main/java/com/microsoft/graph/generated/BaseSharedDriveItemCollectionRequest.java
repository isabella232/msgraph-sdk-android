// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
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
 * The class for the Base Shared Drive Item Collection Request.
 */
public class BaseSharedDriveItemCollectionRequest extends BaseCollectionRequest<BaseSharedDriveItemCollectionResponse, ISharedDriveItemCollectionPage> implements IBaseSharedDriveItemCollectionRequest {

    /**
     * The request builder for this collection of SharedDriveItem
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseSharedDriveItemCollectionRequest(final String requestUrl, IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseSharedDriveItemCollectionResponse.class, ISharedDriveItemCollectionPage.class);
    }

    public void get(final ICallback<ISharedDriveItemCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public ISharedDriveItemCollectionPage get() throws ClientException {
        final BaseSharedDriveItemCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final SharedDriveItem newSharedDriveItem, final ICallback<SharedDriveItem> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new SharedDriveItemRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newSharedDriveItem, callback);
    }

    public SharedDriveItem post(final SharedDriveItem newSharedDriveItem) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new SharedDriveItemRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newSharedDriveItem);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public ISharedDriveItemCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (SharedDriveItemCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public ISharedDriveItemCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (SharedDriveItemCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public ISharedDriveItemCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (SharedDriveItemCollectionRequest)this;
    }

    public ISharedDriveItemCollectionPage buildFromResponse(final BaseSharedDriveItemCollectionResponse response) {
        final ISharedDriveItemCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new SharedDriveItemCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final SharedDriveItemCollectionPage page = new SharedDriveItemCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
