/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 ~ Copyright 2019 Adobe Systems Incorporated
 ~
 ~ Licensed under the Apache License, Version 2.0 (the "License");
 ~ you may not use this file except in compliance with the License.
 ~ You may obtain a copy of the License at
 ~
 ~     http://www.apache.org/licenses/LICENSE-2.0
 ~
 ~ Unless required by applicable law or agreed to in writing, software
 ~ distributed under the License is distributed on an "AS IS" BASIS,
 ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 ~ See the License for the specific language governing permissions and
 ~ limitations under the License.
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
package com.adobe.cq.wcm.core.components.models;

import org.jetbrains.annotations.NotNull;
import org.osgi.annotation.versioning.ConsumerType;

import com.adobe.cq.export.json.ComponentExporter;

/**
 * Defines the {@code Modal} Sling Model used for the
 * {@code /apps/core/wcm/components/modal} component. This component currently
 * supports using "#{modalId}" in the url
 *
 * @since com.adobe.cq.wcm.core.components.models 12.8.0
 */
@ConsumerType
public interface Modal extends ComponentExporter {

	/**
	 * Returns the id for the modal based on the hash generated from the component path
	 * 
	 * @return id
	 * @since com.adobe.cq.wcm.core.components.models 12.8.0
	 */
	default String getId() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the title for the modal
	 * 
	 * @return title
	 * @since com.adobe.cq.wcm.core.components.models 12.8.0
	 */
	default String getTitle() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the boolean value defining whether to show modal by default on page
	 * load or not
	 * 
	 * @return open
	 * @since com.adobe.cq.wcm.core.components.models 12.8.0
	 */
	default boolean isOpen() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the type of the fragment chosen
	 * 
	 * @return fragmentType
	 * @since com.adobe.cq.wcm.core.components.models 12.8.0
	 */
	default ModalFragmentType getFragmentType() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the fragment path
	 * 
	 * @return fragmentPath
	 * @since com.adobe.cq.wcm.core.components.models 12.8.0
	 */
	default String getFragmentPath() {
		throw new UnsupportedOperationException();
	}

	/**
	 * @see ComponentExporter#getExportedType()
	 * @since com.adobe.cq.wcm.core.components.models 12.8.0
	 */
	@NotNull
	@Override
	default String getExportedType() {
		throw new UnsupportedOperationException();
	}

}