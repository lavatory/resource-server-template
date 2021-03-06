/**
 * Copyright (c) 2015 Intel Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.trustedanalytics.resourceserver.data;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * This is really simple data provider, reading value from property. In the real
 * world, you might want to read something from database here.
 * 
 */

@Component
public class DataProvider {

    // Get the value from property

    @Value("${demo.data}")
    private String demoData;

    public DemoData getDemoData() {
        // Create resource with new value
        return new DemoData(demoData);
    }

}
