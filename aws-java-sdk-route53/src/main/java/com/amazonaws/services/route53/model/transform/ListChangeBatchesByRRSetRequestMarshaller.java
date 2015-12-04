/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.route53.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;

import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.XMLWriter;

/**
 * List Change Batches By R R Set Request Marshaller
 */
public class ListChangeBatchesByRRSetRequestMarshaller implements Marshaller<Request<ListChangeBatchesByRRSetRequest>, ListChangeBatchesByRRSetRequest> {

    private static final String RESOURCE_PATH_TEMPLATE;
    private static final Map<String, String> STATIC_QUERY_PARAMS;
    private static final Map<String, String> DYNAMIC_QUERY_PARAMS;
    static {
        String path = "/2013-04-01/hostedzone/{Id}/rrsChanges?rrSet_name={Name}&type={Type}&identifier={SetIdentifier}&startDate={StartDate}&endDate={EndDate}&marker={Marker}&maxItems={MaxItems}";
        Map<String, String> staticMap = new HashMap<String, String>();
        Map<String, String> dynamicMap = new HashMap<String, String>();

        int index = path.indexOf("?");
        if (index != -1) {
            String queryString = path.substring(index + 1);
            path = path.substring(0, index);

            for (String s : queryString.split("[;&]")) {
                index = s.indexOf("=");
                if (index != -1) {
                    String name = s.substring(0, index);
                    String value = s.substring(index + 1);

                    if (value.startsWith("{") && value.endsWith("}")) {
                        dynamicMap.put(value.substring(1, value.length() - 1), name);
                    } else {
                        staticMap.put(name, value);
                    }
                }
            }
        }

        RESOURCE_PATH_TEMPLATE = path;
        STATIC_QUERY_PARAMS = Collections.unmodifiableMap(staticMap);
        DYNAMIC_QUERY_PARAMS = Collections.unmodifiableMap(dynamicMap);
    }

    public Request<ListChangeBatchesByRRSetRequest> marshall(ListChangeBatchesByRRSetRequest listChangeBatchesByRRSetRequest) {

        if (listChangeBatchesByRRSetRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListChangeBatchesByRRSetRequest> request = new DefaultRequest<ListChangeBatchesByRRSetRequest>(listChangeBatchesByRRSetRequest, "AmazonRoute53");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = RESOURCE_PATH_TEMPLATE;
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("Id")) {
            String name = DYNAMIC_QUERY_PARAMS.get("Id");
            String value = (listChangeBatchesByRRSetRequest.getHostedZoneId() == null) ? null : StringUtils.fromString(listChangeBatchesByRRSetRequest.getHostedZoneId());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{Id}", (listChangeBatchesByRRSetRequest.getHostedZoneId() == null) ? "" : StringUtils.fromString(listChangeBatchesByRRSetRequest.getHostedZoneId())); 
        }
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("Name")) {
            String name = DYNAMIC_QUERY_PARAMS.get("Name");
            String value = (listChangeBatchesByRRSetRequest.getName() == null) ? null : StringUtils.fromString(listChangeBatchesByRRSetRequest.getName());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{Name}", (listChangeBatchesByRRSetRequest.getName() == null) ? "" : StringUtils.fromString(listChangeBatchesByRRSetRequest.getName())); 
        }
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("Type")) {
            String name = DYNAMIC_QUERY_PARAMS.get("Type");
            String value = (listChangeBatchesByRRSetRequest.getType() == null) ? null : StringUtils.fromString(listChangeBatchesByRRSetRequest.getType());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{Type}", (listChangeBatchesByRRSetRequest.getType() == null) ? "" : StringUtils.fromString(listChangeBatchesByRRSetRequest.getType())); 
        }
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("SetIdentifier")) {
            String name = DYNAMIC_QUERY_PARAMS.get("SetIdentifier");
            String value = (listChangeBatchesByRRSetRequest.getSetIdentifier() == null) ? null : StringUtils.fromString(listChangeBatchesByRRSetRequest.getSetIdentifier());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{SetIdentifier}", (listChangeBatchesByRRSetRequest.getSetIdentifier() == null) ? "" : StringUtils.fromString(listChangeBatchesByRRSetRequest.getSetIdentifier())); 
        }
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("StartDate")) {
            String name = DYNAMIC_QUERY_PARAMS.get("StartDate");
            String value = (listChangeBatchesByRRSetRequest.getStartDate() == null) ? null : StringUtils.fromString(listChangeBatchesByRRSetRequest.getStartDate());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{StartDate}", (listChangeBatchesByRRSetRequest.getStartDate() == null) ? "" : StringUtils.fromString(listChangeBatchesByRRSetRequest.getStartDate())); 
        }
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("EndDate")) {
            String name = DYNAMIC_QUERY_PARAMS.get("EndDate");
            String value = (listChangeBatchesByRRSetRequest.getEndDate() == null) ? null : StringUtils.fromString(listChangeBatchesByRRSetRequest.getEndDate());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{EndDate}", (listChangeBatchesByRRSetRequest.getEndDate() == null) ? "" : StringUtils.fromString(listChangeBatchesByRRSetRequest.getEndDate())); 
        }
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("MaxItems")) {
            String name = DYNAMIC_QUERY_PARAMS.get("MaxItems");
            String value = (listChangeBatchesByRRSetRequest.getMaxItems() == null) ? null : StringUtils.fromString(listChangeBatchesByRRSetRequest.getMaxItems());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{MaxItems}", (listChangeBatchesByRRSetRequest.getMaxItems() == null) ? "" : StringUtils.fromString(listChangeBatchesByRRSetRequest.getMaxItems())); 
        }
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("Marker")) {
            String name = DYNAMIC_QUERY_PARAMS.get("Marker");
            String value = (listChangeBatchesByRRSetRequest.getMarker() == null) ? null : StringUtils.fromString(listChangeBatchesByRRSetRequest.getMarker());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{Marker}", (listChangeBatchesByRRSetRequest.getMarker() == null) ? "" : StringUtils.fromString(listChangeBatchesByRRSetRequest.getMarker())); 
        }

        request.setResourcePath(uriResourcePath.replaceAll("//", "/"));

        for (Map.Entry<String, String> entry : STATIC_QUERY_PARAMS.entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

        return request;
    }
}
