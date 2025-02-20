// Copyright 2023 Goldman Sachs
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.finos.legend.engine.plan.execution.stores.mongodb.plugin;

import org.finos.legend.engine.plan.execution.stores.StoreExecutor;
import org.finos.legend.engine.plan.execution.stores.StoreExecutorBuilder;
import org.finos.legend.engine.plan.execution.stores.StoreExecutorConfiguration;
import org.finos.legend.engine.plan.execution.stores.StoreType;

public class MongoDBStoreExecutorBuilder implements StoreExecutorBuilder
{
    @Override
    public String group()
    {
        return "ST_Mongo";
    }

    @Override
    public StoreType getStoreType()
    {
        return StoreType.NonRelational_MongoDB;
    }

    @Override
    public MongoDBStoreExecutor build()
    {
        return (MongoDBStoreExecutor) build(MongoDBStoreExecutorConfiguration.newInstance().build());
    }

    @Override
    public StoreExecutor build(StoreExecutorConfiguration storeExecutorConfiguration)
    {
        if (!(storeExecutorConfiguration instanceof MongoDBStoreExecutorConfiguration))
        {
            throw new IllegalStateException("Incorrect store execution configuration, expected MongoDBStoreExecutorConfiguration. Please reach out to dev team");
        }
        MongoDBStoreExecutorConfiguration mongoDBStoreExecutorConfiguration = (MongoDBStoreExecutorConfiguration) storeExecutorConfiguration;
        MongoDBStoreState state = new MongoDBStoreState();
        return new MongoDBStoreExecutor(state, mongoDBStoreExecutorConfiguration);
    }
}
