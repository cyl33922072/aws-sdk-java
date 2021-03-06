/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetDataCatalogEncryptionSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataCatalogEncryptionSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Data Catalog for which to retrieve the security configuration. If none is supplied, the AWS account
     * ID is used by default.
     * </p>
     */
    private String catalogId;

    /**
     * <p>
     * The ID of the Data Catalog for which to retrieve the security configuration. If none is supplied, the AWS account
     * ID is used by default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog for which to retrieve the security configuration. If none is supplied, the AWS
     *        account ID is used by default.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog for which to retrieve the security configuration. If none is supplied, the AWS account
     * ID is used by default.
     * </p>
     * 
     * @return The ID of the Data Catalog for which to retrieve the security configuration. If none is supplied, the AWS
     *         account ID is used by default.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog for which to retrieve the security configuration. If none is supplied, the AWS account
     * ID is used by default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog for which to retrieve the security configuration. If none is supplied, the AWS
     *        account ID is used by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataCatalogEncryptionSettingsRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCatalogId() != null)
            sb.append("CatalogId: ").append(getCatalogId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDataCatalogEncryptionSettingsRequest == false)
            return false;
        GetDataCatalogEncryptionSettingsRequest other = (GetDataCatalogEncryptionSettingsRequest) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        return hashCode;
    }

    @Override
    public GetDataCatalogEncryptionSettingsRequest clone() {
        return (GetDataCatalogEncryptionSettingsRequest) super.clone();
    }

}
