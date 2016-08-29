// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.options.*;

import java.util.List;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Directory Object Get Member Groups Collection Request Builder.
 */
public class BaseDirectoryObjectGetMemberGroupsCollectionRequestBuilder extends BaseActionRequestBuilder implements IBaseDirectoryObjectGetMemberGroupsCollectionRequestBuilder {

    /**
     * The request builder for this collection of DirectoryObject
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseDirectoryObjectGetMemberGroupsCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> options, final Boolean securityEnabledOnly) {
        super(requestUrl, client, options);
        mBodyParams.put("securityEnabledOnly", securityEnabledOnly);
      }

    public IDirectoryObjectGetMemberGroupsCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IDirectoryObjectGetMemberGroupsCollectionRequest buildRequest(final List<Option> options) {
        DirectoryObjectGetMemberGroupsCollectionRequest request = new DirectoryObjectGetMemberGroupsCollectionRequest(
                getRequestUrl(),
                getClient(),
                options
        );

        if (hasParameter("securityEnabledOnly")) {
            request.mBody.securityEnabledOnly = getParameter("securityEnabledOnly");
        }
  
        return request;
    }
}
