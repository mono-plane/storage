/*
 * JBoss, Home of Professional Open Source
 *  Copyright ${year}, Red Hat, Inc., and individual contributors
 *  by the @authors tag. See the copyright.txt in the distribution for a
 *  full listing of individual contributors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.wildfly.monoplane.storage.extension;

import org.jboss.as.controller.AttributeDefinition;
import org.jboss.as.controller.PersistentResourceDefinition;
import org.jboss.as.controller.ReloadRequiredRemoveStepHandler;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author Heiko Braun
 * @since 20/08/14
 */
public class RootDefinition extends PersistentResourceDefinition {
    public static final RootDefinition INSTANCE = new RootDefinition();

       private RootDefinition() {
           super(CassandraExtension.SUBSYSTEM_PATH,
                   CassandraExtension.getResourceDescriptionResolver(),
                   RootAdd.INSTANCE,
                   ReloadRequiredRemoveStepHandler.INSTANCE);
       }

       @Override
       public Collection<AttributeDefinition> getAttributes() {
           return Collections.emptySet();
       }

       @Override
       protected List<? extends PersistentResourceDefinition> getChildren() {
           return Arrays.asList(ClusterDefinition.INSTANCE);
       }
}
