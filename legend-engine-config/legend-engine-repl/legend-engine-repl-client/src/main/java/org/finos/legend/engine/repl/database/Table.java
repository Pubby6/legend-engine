// Copyright 2023 Goldman Sachs
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.finos.legend.engine.repl.database;

import org.eclipse.collections.api.list.MutableList;
import org.eclipse.collections.impl.factory.Lists;
import org.finos.legend.engine.repl.database.Column;

public class Table
{
    public String schema;
    public String name;
    public MutableList<Column> columns = Lists.mutable.empty();

    public Table(String schema, String name, MutableList<Column> columns)
    {
        this.schema = schema;
        this.name = name;
        this.columns = columns;
    }
}
